package com.jiabian.mama;

import java.util.Date;
import java.util.List;

import com.jiabian.beans.basic.hotel.HomeQueryHelper;
import com.jiabian.beans.basic.shoppingMall.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.dao.basic.shoppingMall.MamaAddressMapper;
import com.jiabian.dao.basic.shoppingMall.MamaBannerMapper;
import com.jiabian.dao.basic.shoppingMall.MamaCommentMapper;
import com.jiabian.dao.basic.shoppingMall.MamaConfigMapper;
import com.jiabian.dao.basic.shoppingMall.MamaGoodsMapper;
import com.jiabian.dao.basic.shoppingMall.MamaNewsMapper;
import com.jiabian.dao.basic.shoppingMall.MamaOrderMapper;
import com.jiabian.dao.basic.shoppingMall.MamaPrizeMapper;
import com.jiabian.dao.basic.shoppingMall.MamaUserMapper;
import com.jiabian.mama.request.MamaAddressReq;
import com.jiabian.mama.request.MamaBannerReq;
import com.jiabian.mama.request.MamaCommentReq;
import com.jiabian.mama.request.MamaConfigReq;
import com.jiabian.mama.request.MamaGoodsReq;
import com.jiabian.mama.request.MamaNewsReq;
import com.jiabian.mama.request.MamaOrderReq;
import com.jiabian.mama.request.MamaPrizeReq;
import com.jiabian.mama.request.MamaUserReq;
import com.jiabian.mama.response.MamaAddressRes;
import com.jiabian.mama.response.MamaBannerRes;
import com.jiabian.mama.response.MamaCommentRes;
import com.jiabian.mama.response.MamaConfigRes;
import com.jiabian.mama.response.MamaGoodsRes;
import com.jiabian.mama.response.MamaNewsRes;
import com.jiabian.mama.response.MamaOrderRes;
import com.jiabian.mama.response.MamaPrizeRes;
import com.jiabian.mama.response.MamaUserRes;
import com.jiabian.util.SpringBeanUtils;

@Service
public class MamaService implements IMamaService {

	@Autowired
	private MamaUserMapper mamaUserMapper;

	@Autowired
	private MamaNewsMapper mamaNewsMapper;
	
	@Autowired
	private MamaGoodsMapper mamaGoodsMapper;
	
	@Autowired
	private MamaAddressMapper mamaAddressMapper;
	
	@Autowired
	private MamaCommentMapper mamaCommentMapper;
	
	@Autowired
	private MamaOrderMapper mamaOrderMapper;
	
	@Autowired
	private MamaConfigMapper mamaConfigMapper;
	
	@Autowired
	private MamaBannerMapper mamaBannerMapper;
	
	@Autowired
	private MamaPrizeMapper mamaPrizeMapper;

//==========================================================================================================================
	@Override
	public PagesModel<MamaUserReq, MamaUserRes> selectUsers(PagesModel<MamaUserReq, MamaUserRes> pagesModel,
			MamaUserReq mamaUserReq) {
		pagesModel.setTotal(mamaUserMapper.countMamaUsers(pagesModel, mamaUserReq));
		if (pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaUserReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaUserMapper.selectMamaUsers(pagesModel, mamaUserReq));
		return pagesModel;
	}

	@Override
	public Integer updateMamaUser(MamaUser mamaUser) {
		return mamaUserMapper.updateByPrimaryKeySelective(mamaUser);
	}

	@Override
	public Integer UpdateBatchMamaUsers(List<Long> ids, Byte isDel) {
		MamaUserQueryHelper helper = new MamaUserQueryHelper();
		helper.createCriteria().andIdIn(ids);
		MamaUser user = new MamaUser();
		user.setIsDel(isDel);
		return mamaUserMapper.updateByExampleSelective(user, helper);
	}

//==========================================================================================================================	
	@Override
	public PagesModel<MamaAddressReq, MamaAddressRes> selectMamaAddressByUserId(
			PagesModel<MamaAddressReq, MamaAddressRes> pagesModel, Long id) {
		pagesModel.setTotal(mamaAddressMapper.countMamaAddressByUserId(pagesModel, id));
		pagesModel.setResults(mamaAddressMapper.selectMamaAddressByUserId(pagesModel, id));
		return pagesModel;
	}

	@Override
	public Integer deleteAddress(Long id) {
		return mamaAddressMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteAddressBatch(List<Long> ids) {
		MamaAddressQueryHelper helper = new MamaAddressQueryHelper();
		helper.createCriteria().andIdIn(ids);
		return mamaAddressMapper.deleteByExample(helper);
	}
	
	@Override
	public Integer inserMamaAddres(MamaAddressReq mamaAddressReq) {
		MamaAddress record = new MamaAddress();
		if(mamaAddressReq.getType() == 1) {
			MamaAddressQueryHelper helper = new MamaAddressQueryHelper();
			helper.createCriteria().andUseridEqualTo(mamaAddressReq.getUserid()).andTypeEqualTo((byte) 1);
			record.setType((byte) 2);
			mamaAddressMapper.updateByExampleSelective(record, helper);
		}
		SpringBeanUtils.copyProperties(mamaAddressReq, record);
		return mamaAddressMapper.insertSelective(record);
	}

//==========================================================================================================================
	@Override
	public PagesModel<MamaNewsReq, MamaNewsRes> selectNews(PagesModel<MamaNewsReq, MamaNewsRes> pagesModel,
			MamaNewsReq mamaNewsReq) {
		pagesModel.setTotal(mamaNewsMapper.countMamaNews(pagesModel, mamaNewsReq));
		if (pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaNewsReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaNewsMapper.selectMamaNews(pagesModel, mamaNewsReq));
		return pagesModel;
	}

	@Override
	public Integer operateMamaNewsStatus(Byte isDel, Long id) {
		MamaNews record = new MamaNews();
		record.setId(id);
		record.setIsDel((byte) (isDel == 1 ? 2 : 1));
		record.setUpdateTime(new Date());
		return mamaNewsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Integer operateMamaNewsStatusBatch(List<Long> ids, Byte isDel) {
		MamaNewsQueryHelper helper = new MamaNewsQueryHelper();
		helper.createCriteria().andIdIn(ids);
		MamaNews news = new MamaNews();
		news.setIsDel((byte) (isDel == 1 ? 2 : 1));
		news.setUpdateTime(new Date());
		return mamaNewsMapper.updateByExampleSelective(news, helper);
	}

	@Override
	public Integer insertMamaNews(MamaNewsReq mamaNewsReq) {
		mamaNewsReq.setCreateTime(new Date());
		mamaNewsReq.setUpdateTime(new Date());
		MamaNews target = new MamaNews();
		SpringBeanUtils.copyProperties(mamaNewsReq, target);
		return mamaNewsMapper.insertSelective(target);
	}

	@Override
	public MamaNews selectNewsById(Long id) {
		return mamaNewsMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateMamaNews(MamaNewsReq mamaNewsReq) {
		mamaNewsReq.setUpdateTime(new Date());
		MamaNews record = new MamaNews();
		SpringBeanUtils.copyProperties(mamaNewsReq, record);
		return mamaNewsMapper.updateByPrimaryKeySelective(record);
	}
//==========================================================================================================================

	@Override
	public PagesModel<MamaGoodsReq, MamaGoodsRes> selectGoods(PagesModel<MamaGoodsReq, MamaGoodsRes> pagesModel,
			MamaGoodsReq mamaGoodsReq) {
		pagesModel.setTotal(mamaGoodsMapper.countMamaGoods(pagesModel, mamaGoodsReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaGoodsReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaGoodsMapper.selectMamaGoods(pagesModel, mamaGoodsReq));
		return pagesModel;
	}

	@Override
	public Integer operateGoodsById(Long id, Byte isDel) {
		MamaGoods record = new MamaGoods();
		record.setId(id);
		record.setIsDel((byte) (isDel == 1 ? 2 : 1));
		record.setUpdateTime(new Date());
		return mamaGoodsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Integer operateMamaGoodsBatch(List<Long> ids, Byte isDel) {
		MamaGoodsQueryHelper helper = new MamaGoodsQueryHelper();
		helper.createCriteria().andIdIn(ids);
		MamaGoods record = new MamaGoods();
		record.setIsDel((byte) (isDel == 1 ? 2 : 1));
		record.setUpdateTime(new Date());
		return mamaGoodsMapper.updateByExampleSelective(record, helper);
	}

	@Override
	public Integer insertMamaGoods(MamaGoodsReq mamaGoodsReq) {
		mamaGoodsReq.setCreateTime(new Date());
		mamaGoodsReq.setUpdateTime(mamaGoodsReq.getCreateTime());
		MamaGoods target = new MamaGoods();
		SpringBeanUtils.copyProperties(mamaGoodsReq, target);
		return mamaGoodsMapper.insertSelective(target);
	}

	@Override
	public MamaGoods selectGoodsById(Long id) {
		return mamaGoodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateMamaGoods(MamaGoodsReq mamaGoodsReq) {
		mamaGoodsReq.setUpdateTime(new Date());
		MamaGoods target = new MamaGoods();
		SpringBeanUtils.copyProperties(mamaGoodsReq, target);
		return mamaGoodsMapper.updateByPrimaryKeySelective(target);
	}
//==========================================================================================================================

	@Override
	public PagesModel<MamaCommentReq, MamaCommentRes> selectMamaComments(
			PagesModel<MamaCommentReq, MamaCommentRes> pagesModel, MamaCommentReq mamaCommentReq) {
		pagesModel.setTotal(mamaCommentMapper.countMamaComments(pagesModel, mamaCommentReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaCommentReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaCommentMapper.selectMamaComments(pagesModel, mamaCommentReq));
		return pagesModel;
	}

	@Override
	public Integer deleteMamaComment(Long id) {
		return mamaCommentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer delMamaCommentsBatch(List<Long> ids) {
		MamaCommentQueryHelper helper = new MamaCommentQueryHelper();
		helper.createCriteria().andIdIn(ids);
		return mamaCommentMapper.deleteByExample(helper);
	}

	@Override
	public MamaUser selectMamaUserById(Long id) {
		return mamaUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public MamaGoods getMamaGoodById(Long id) {
		return mamaGoodsMapper.selectByPrimaryKey(id);
	}
//==========================================================================================================================

	@Override
	public PagesModel<MamaOrderReq, MamaOrderRes> selectMamaOrders(PagesModel<MamaOrderReq, MamaOrderRes> pagesModel,
			MamaOrderReq mamaOrderReq) {
		pagesModel.setTotal(mamaOrderMapper.countMamaOrders(pagesModel, mamaOrderReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaOrderReq.getSize()) {
			pagesModel.setCurrentPage(1);
		}
		pagesModel.setResults(mamaOrderMapper.selectMamaOrders(pagesModel, mamaOrderReq));
		return pagesModel;
	}

	@Override
	public Integer operateMamaOrderById(Long id, Byte isDel) {
		MamaOrder record = new MamaOrder();
		MamaOrderQueryHelper helper = new MamaOrderQueryHelper();
		helper.createCriteria().andIdEqualTo(id);
		record.setIsDel(isDel);
		return mamaOrderMapper.updateByExampleSelective(record, helper);
	}

	@Override
	public Integer operateMamaOrdersBatch(List<Long> ids, Byte isDel) {
		MamaOrder record = new MamaOrder();
		MamaOrderQueryHelper helper = new MamaOrderQueryHelper();
		helper.createCriteria().andIdIn(ids);
		record.setIsDel(isDel);
		return mamaOrderMapper.updateByExampleSelective(record, helper);
	}

	@Override
	public MamaAddress getMamaAddressById(Long id) {
		return mamaAddressMapper.selectByPrimaryKey(id);
	}
//==========================================================================================================================

	@Override
	public PagesModel<MamaConfigReq, MamaConfigRes> selectMamaConfig(
			PagesModel<MamaConfigReq, MamaConfigRes> pagesModel, MamaConfigReq mamaConfigReq) {
		pagesModel.setTotal(mamaConfigMapper.countMamaConfig(pagesModel, mamaConfigReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaConfigReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaConfigMapper.selectMamaConfig(pagesModel, mamaConfigReq));
		return pagesModel;
	}

	@Override
	public Integer deleteMamaConfigById(Long id) {
		return mamaConfigMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteMamaConfigsBatch(List<Long> ids) {
		MamaConfigQueryHelper helper = new MamaConfigQueryHelper();
		helper.createCriteria().andIdIn(ids);
		return mamaConfigMapper.deleteByExample(helper);
	}
//==========================================================================================================================

	@Override
	public PagesModel<MamaBannerReq, MamaBannerRes> selectMamaBanners(
			PagesModel<MamaBannerReq, MamaBannerRes> pagesModel, MamaBannerReq mamaBannerReq) {
		pagesModel.setTotal(mamaBannerMapper.countMamaBanners(pagesModel, mamaBannerReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaBannerReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaBannerMapper.selectMamaBanners(pagesModel, mamaBannerReq));
		return pagesModel;
	}

	@Override
	public Integer inertMamaBanner(MamaBannerReq mamaBannerReq) {
		MamaBanner record = new MamaBanner();
		SpringBeanUtils.copyProperties(mamaBannerReq, record);
		record.setCreateTime(new Date());
		record.setUpdateTime(record.getCreateTime());
		return mamaBannerMapper.insertSelective(record);
	}

	@Override
	public MamaBanner selectMamaBannerById(Long id) {
		return mamaBannerMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateMamaBanner(MamaBannerReq mamaBannerReq) {
		MamaBanner record = new MamaBanner();
		SpringBeanUtils.copyProperties(mamaBannerReq, record);
		record.setUpdateTime(new Date());
		return mamaBannerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Integer deleteMamaBanner(Long id) {
		return mamaBannerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteMamaBannersBatch(List<Long> ids) {
		MamaBannerQueryHelper helper = new MamaBannerQueryHelper();
		helper.createCriteria().andIdIn(ids);
		return mamaBannerMapper.deleteByExample(helper);
	}
//==========================================================================================================================

	@Override
	public PagesModel<MamaPrizeReq, MamaPrizeRes> selectMamaPrize(
			PagesModel<MamaPrizeReq, MamaPrizeRes> pagesModel,MamaPrizeReq mamaPrizeReq) {
		pagesModel.setTotal(mamaPrizeMapper.countMamaPrize(pagesModel, mamaPrizeReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * mamaPrizeReq.getSize())
			pagesModel.setCurrentPage(1);
		pagesModel.setResults(mamaPrizeMapper.selectMamaPrize(pagesModel, mamaPrizeReq));
		return pagesModel;
	}

	@Override
	public Integer deleteMamaPrize(Long id)  {
		return mamaPrizeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer insertMamaPrize(MamaPrizeReq mamaPrizeReq) {
		MamaPrize target = new MamaPrize();
		SpringBeanUtils.copyProperties(mamaPrizeReq,target);
		return mamaPrizeMapper.insertSelective(target);
	}

	@Override
	public Integer deleteMamaPrizesBatch(List<Long> ids) {
		MamaPrizeQueryHelper helper = new MamaPrizeQueryHelper();
		helper.createCriteria().andIdIn(ids);
		return mamaPrizeMapper.deleteByExample(helper);
	}


}
