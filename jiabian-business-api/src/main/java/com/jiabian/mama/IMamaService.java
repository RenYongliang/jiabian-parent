package com.jiabian.mama;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaAddress;
import com.jiabian.beans.basic.shoppingMall.MamaBanner;
import com.jiabian.beans.basic.shoppingMall.MamaGoods;
import com.jiabian.beans.basic.shoppingMall.MamaNews;
import com.jiabian.beans.basic.shoppingMall.MamaUser;
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

public interface IMamaService {

	PagesModel<MamaUserReq, MamaUserRes> selectUsers(PagesModel<MamaUserReq, MamaUserRes> pagesModel,
			MamaUserReq mamaUserReq);

	Integer updateMamaUser(MamaUser mamaUser);

	Integer UpdateBatchMamaUsers(List<Long> ids, Byte isDel);
//==========================================================================================================================
	
	PagesModel<MamaAddressReq, MamaAddressRes> selectMamaAddressByUserId(PagesModel<MamaAddressReq, MamaAddressRes> pagesModel, Long id);
	
	Integer deleteAddress(Long id);

	Integer deleteAddressBatch(List<Long> ids);
	
	Integer inserMamaAddres(MamaAddressReq mamaAddressReq);
	
//==========================================================================================================================
	
	PagesModel<MamaNewsReq, MamaNewsRes> selectNews(PagesModel<MamaNewsReq, MamaNewsRes> pagesModel,
			MamaNewsReq mamaNewsReq);

	Integer operateMamaNewsStatus(Byte isDel, Long id);

	Integer operateMamaNewsStatusBatch(List<Long> ids, Byte isDel);

	Integer insertMamaNews(MamaNewsReq mamaNewsReq);

	MamaNews selectNewsById(Long id);

	Integer updateMamaNews(MamaNewsReq mamaNewsReq);
//==========================================================================================================================

	PagesModel<MamaGoodsReq, MamaGoodsRes> selectGoods(PagesModel<MamaGoodsReq, MamaGoodsRes> pagesModel, MamaGoodsReq mamaGoodsReq);

	Integer operateGoodsById(Long id, Byte isDel);

	Integer operateMamaGoodsBatch(List<Long> ids, Byte isDel);

	Integer insertMamaGoods(MamaGoodsReq mamaGoodsReq);

	MamaGoods selectGoodsById(Long id);

	Integer updateMamaGoods(MamaGoodsReq mamaGoodsReq);
//==========================================================================================================================

	PagesModel<MamaCommentReq, MamaCommentRes> selectMamaComments(PagesModel<MamaCommentReq, MamaCommentRes> pagesModel, MamaCommentReq mamaCommentReq);

	Integer deleteMamaComment(Long id);

	Integer delMamaCommentsBatch(List<Long> ids);

	MamaUser selectMamaUserById(Long id);

	MamaGoods getMamaGoodById(Long id);

	PagesModel<MamaOrderReq, MamaOrderRes> selectMamaOrders(PagesModel<MamaOrderReq, MamaOrderRes> pagesModel, MamaOrderReq mamaOrderReq);

	Integer operateMamaOrderById(Long id, Byte isDel);

	Integer operateMamaOrdersBatch(List<Long> ids, Byte isDel);

	MamaAddress getMamaAddressById(Long id);
//==========================================================================================================================
	
	PagesModel<MamaConfigReq, MamaConfigRes> selectMamaConfig(PagesModel<MamaConfigReq, MamaConfigRes> pagesModel, MamaConfigReq mamaConfigReq);

	Integer deleteMamaConfigById(Long id);

	Integer deleteMamaConfigsBatch(List<Long> ids);

	PagesModel<MamaBannerReq, MamaBannerRes> selectMamaBanners(PagesModel<MamaBannerReq, MamaBannerRes> pagesModel, MamaBannerReq mamaBannerReq);

	Integer inertMamaBanner(MamaBannerReq mamaBannerReq);

	MamaBanner selectMamaBannerById(Long id);

	Integer updateMamaBanner(MamaBannerReq mamaBannerReq);

	Integer deleteMamaBanner(Long id);

	Integer deleteMamaBannersBatch(List<Long> ids);
//==========================================================================================================================
	
	PagesModel<MamaPrizeReq, MamaPrizeRes> selectMamaPrize(PagesModel<MamaPrizeReq, MamaPrizeRes> pagesModel,MamaPrizeReq mamaPrizeReq);

	Integer deleteMamaPrize(Long id);

	Integer insertMamaPrize(MamaPrizeReq mamaPrizeReq);

	Integer deleteMamaPrizesBatch(List<Long> ids);

}
