package com.jiabian.control.mama;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.shoppingMall.MamaGoods;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaGoodsReq;
import com.jiabian.mama.response.MamaGoodsRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaGoods")
public class MamaGoodsController extends BaseController<MamaGoodsReq, MamaGoodsRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 后台查询商品列表
	 * @param map
	 * @param mamaGoodsReq
	 */
	@RequestMapping("/goodsList")
	public String selectGoods(ModelMap map, MamaGoodsReq mamaGoodsReq) {
		if(mamaGoodsReq.getIsDel() == null) mamaGoodsReq.setIsDel((byte) 1);
		if(mamaGoodsReq.getType() == null) mamaGoodsReq.setType((byte) 0);
		PagesModel<MamaGoodsReq, MamaGoodsRes> pagesModel = new PagesModel<>(mamaGoodsReq);
		this.setPagesToModel(pagesModel, mamaGoodsReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectGoods(pagesModel, mamaGoodsReq);
		map.put("pagesModel", pagesModel);
		map.put("name", mamaGoodsReq.getName());
		map.put("type", mamaGoodsReq.getType());
		map.put("isDel", mamaGoodsReq.getIsDel());
		return "mama/goods/select";
	}
	
	/**
	 * 删除/还原商品
	 * @param id
	 * @return res
	 */
	@RequestMapping("/operateMamaGoodsById")
	@ResponseBody
	public Result<Boolean> deleteMamaGoodsById(@RequestParam("id") Long id, @RequestParam("isDel") Byte isDel) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.operateGoodsById(id, isDel);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 批量删除/还原商品
	 * @param idList
	 * @param isDel
	 * @return res
	 */
	@RequestMapping("/operateMamaGoodsBatch")
	@ResponseBody
	public Result<Boolean> operateMamaGoodsBatch(@RequestParam("idList") String idList, @RequestParam("isDel") Byte isDel) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Long> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		}else {
			String[] strs = idList.split("-");
			for(String s : strs) {
				ids.add(Long.parseLong(s));
			}
		}
		Integer result = iMamaService.operateMamaGoodsBatch(ids, isDel);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 跳转至新增页面
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "mama/goods/insert";
	}
	
	/**
	 * 新增商品
	 * @param mamaGoodsReq
	 * @return res
	 */
	@RequestMapping("/insertMamaGoods")
	@ResponseBody
	public Result<Boolean> insertMamaGoods(MamaGoodsReq mamaGoodsReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.insertMamaGoods(mamaGoodsReq);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 根据id查询商品
	 * @param id
	 * @param map
	 */
	@RequestMapping("/selectMamaGoodsById")
	public String selectMamaGoodsById(@RequestParam("id") Long id, ModelMap map) {
		MamaGoods mamaGoods = iMamaService.selectGoodsById(id);
		map.put("goods", mamaGoods);
		return "mama/goods/update";
	}
	
	/**
	 * 修改商品信息
	 * @param mamaGoodsReq
	 * @return res
	 */
	@RequestMapping("/updateMamaGoods")
	@ResponseBody
	public Result<Boolean> updateMamaGoods(MamaGoodsReq mamaGoodsReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.updateMamaGoods(mamaGoodsReq);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		}else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 根据id获取商品信息
	 * @param id
	 * @return mamaGoods
	 */
	@RequestMapping("/getMamaGoodById")
	@ResponseBody
	public MamaGoods getMamaGoodById(@RequestParam("id") Long id) {
		return iMamaService.getMamaGoodById(id);
	}
}
