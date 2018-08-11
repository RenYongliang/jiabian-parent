package com.jiabian.control.dada;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.dada.IDadaService;
import com.jiabian.dada.request.ConfigBrandReq;
import com.jiabian.dada.response.ConfigBrandRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/brands")
public class ConfigBrandController extends BaseController<ConfigBrandReq, ConfigBrandRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 后台查询品牌列表
	 * @param map
	 * @param configBrandReq
	 * @return
	 */
	@RequestMapping("/brandList")
	public String selectBrands(ModelMap map, ConfigBrandReq configBrandReq) {
		PagesModel<ConfigBrandReq, ConfigBrandRes> pagesModel = new PagesModel<>(configBrandReq);
		this.setPagesToModel(pagesModel, configBrandReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectBrands(pagesModel);
		map.put("pagesModel", pagesModel);
		return "dada/brand/select";
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteBrandById")
	@ResponseBody
	public Result<Boolean> deleteBrandById(@RequestParam("id") Integer id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.deleteBrandById(id);
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
	 * 批量删除
	 * @param idList
	 * @return
	 */
	@RequestMapping("/delBatchBrands/{idList}")
	@ResponseBody
	public Result<Boolean> delBatchBrands(@PathVariable("idList") String idList) {
		Result<Boolean> res = new Result<>();
		List<Integer> ids = new ArrayList<>();
		String message;
		if(!idList.contains("-")) {
			ids.add(Integer.parseInt(idList));
		}else {
			String[] idStrs = idList.split("-");
			for(String s : idStrs) {
				ids.add(Integer.parseInt(s));
			}
		}
		Integer result = iDadaService.delBatchBrands(ids);
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
	 * 条件查询品牌
	 * @param condition
	 * @param configBrandReq
	 * @return pagesModel
	 */
	@RequestMapping("/selectBrandsByCondition")
	@ResponseBody
	public PagesModel<ConfigBrandReq, ConfigBrandRes> selectBrandsByCondition(@RequestParam("condition") String condition,
			ConfigBrandReq configBrandReq) {
		PagesModel<ConfigBrandReq, ConfigBrandRes> pagesModel = new PagesModel<>();
		//this.setPagesToModel(pagesModel, configBrandReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectBrandsByCondition(condition, pagesModel);
		return pagesModel;
	}
	
	/**
	 * 添加跳转页
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "dada/brand/insert";
	}
	
	/**
	 * 新增品牌
	 * @param configBrandReq
	 * @return
	 */
	@RequestMapping("/insertBrand")
	@ResponseBody
	public Result<Boolean> insertBrand(ConfigBrandReq configBrandReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.insertBrand(configBrandReq);
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
	
}
