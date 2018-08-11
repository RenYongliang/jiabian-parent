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
import com.jiabian.beans.basic.shoppingMall.MamaBanner;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaBannerReq;
import com.jiabian.mama.response.MamaBannerRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaBanner")
public class MamaBannerController extends BaseController<MamaBannerReq, MamaBannerRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 后台查询横幅列表
	 * @param map
	 * @param mamaBannerReq
	 * @return
	 */
	@RequestMapping("/bannerList")
	public String selectMamaBanners(ModelMap map, MamaBannerReq mamaBannerReq) {
		if(mamaBannerReq.getType() == null)
			mamaBannerReq.setType((byte) 0);
		PagesModel<MamaBannerReq, MamaBannerRes> pagesModel = new PagesModel<>(mamaBannerReq);
		this.setPagesToModel(pagesModel, mamaBannerReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectMamaBanners(pagesModel, mamaBannerReq);
		map.put("pagesModel", pagesModel);
		map.put("type", mamaBannerReq.getType());
		return "mama/banners/select";
	}
	
	/**
	 * 跳转至新增页面
	 * @return
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "mama/banners/insert";
	}
	
	/**
	 * 插入banner图片
	 * @param mamaBannerReq
	 * @return
	 */
	@RequestMapping("/insertMamaBanner")
	@ResponseBody
	public Result<Boolean> insertMamaBanner(MamaBannerReq mamaBannerReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.inertMamaBanner(mamaBannerReq);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		} else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 根据id查找banner
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping("/selectMamaBannerById")
	public String selectMamaBannerById(@RequestParam("id") Long id, ModelMap map) {
		MamaBanner banner = iMamaService.selectMamaBannerById(id);
		map.put("banner", banner);
		return "mama/banners/update";
	}
	
	/**
	 * 更新banner图
	 * @param mamaBannerReq
	 * @return
	 */
	@RequestMapping("/updateMamaBanner")
	@ResponseBody
	public Result<Boolean> updateMamaBanner(MamaBannerReq mamaBannerReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.updateMamaBanner(mamaBannerReq);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		} else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 删除banner图
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteMamaBanner")
	@ResponseBody
	public Result<Boolean> deleteMamaBanner(@RequestParam("id") Long id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.deleteMamaBanner(id);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		} else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 批量删除banner图
	 * @param idList
	 * @return
	 */
	@RequestMapping("/deleteMamaBannersBatch")
	@ResponseBody
	public Result<Boolean> deleteMamaBannersBatch(@RequestParam("idList") String idList) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Long> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		} else {
			String[] strs = idList.split("-");
			for(String s : strs) {
				ids.add(Long.parseLong(s));
			}
		}
		Integer result = iMamaService.deleteMamaBannersBatch(ids);
		if(result > 0) {
			message = "操作成功！";
			res.setData(true);
		} else {
			message = "操作失败！";
			res.setData(false);
		}
		res.setDesc(message);
		return res;
	}
	
}
