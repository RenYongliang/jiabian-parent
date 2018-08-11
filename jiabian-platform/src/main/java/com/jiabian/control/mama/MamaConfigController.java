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
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaConfigReq;
import com.jiabian.mama.response.MamaConfigRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaConfig")
public class MamaConfigController extends BaseController<MamaConfigReq, MamaConfigRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 后台查询小程序app
	 * @param map
	 * @param mamaConfigReq
	 * @return
	 */
	@RequestMapping("/configList")
	public String selectConfigs(ModelMap map, MamaConfigReq mamaConfigReq) {
		PagesModel<MamaConfigReq, MamaConfigRes> pagesModel = new PagesModel<>(mamaConfigReq);
		this.setPagesToModel(pagesModel, mamaConfigReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectMamaConfig(pagesModel, mamaConfigReq);
		map.put("pagesModel", pagesModel);
		map.put("key", mamaConfigReq.getKey());
		map.put("mch_id", mamaConfigReq.getMch_id());
		return "mama/config/select";
	}
	
	/**
	 * 根据id删除小程序设置
	 * @param id
	 * @return res
	 */
	@RequestMapping("/deleteMamaConfigById")
	@ResponseBody
	public Result<Boolean> deleteMamaConfigById(@RequestParam("id") Long id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.deleteMamaConfigById(id);
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
	 * 批量删除小程序设置
	 * @param idList
	 * @return
	 */
	@RequestMapping("/deleteMamaConfigsBatch")
	@ResponseBody
	public Result<Boolean> deleteMamaConfigsBatch(@RequestParam("idList") String idList) {
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
		Integer result = iMamaService.deleteMamaConfigsBatch(ids);
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
