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
import com.jiabian.dada.request.ConfigSeriesReq;
import com.jiabian.dada.response.ConfigSeriesRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/series")
public class ConfigSeriesController extends BaseController<ConfigSeriesReq, ConfigSeriesRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 后台查询车型
	 * @param map
	 * @param configSeriesReq
	 * @return
	 */
	@RequestMapping("/seriesList")
	public String selectSeries(ModelMap map, ConfigSeriesReq configSeriesReq) {
		PagesModel<ConfigSeriesReq, ConfigSeriesRes> pagesModel = new PagesModel<>(configSeriesReq);
		this.setPagesToModel(pagesModel, configSeriesReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectSeries(pagesModel);
		map.put("pagesModel", pagesModel);
		return "dada/series/select";
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteSeriesById")
	@ResponseBody
	public Result<Boolean> deleteSeriesById(@RequestParam("id") Integer id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.deleteSeries(id);
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
	@RequestMapping("/delBatchSeries/{idList}")
	@ResponseBody
	public Result<Boolean> delBatchSeries(@PathVariable("idList") String idList) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Integer> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Integer.parseInt(idList));
		}else {
			String[] idStrs = idList.split("-");
			for(String s : idStrs) {
				ids.add(Integer.parseInt(s));
			}
		}
		Integer result = iDadaService.delBatchSeries(ids);
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
	 * 条件查询
	 * @param condition
	 * @return
	 */
	@RequestMapping("/selectSeriesByCondition")
	@ResponseBody
	public PagesModel<ConfigSeriesReq, ConfigSeriesRes> selectSeriesByCondition(@RequestParam("condition") String condition) {
		PagesModel<ConfigSeriesReq, ConfigSeriesRes> pagesModel = new PagesModel<>();
		pagesModel.setOrderBy("id asc");
		iDadaService.selectSeriesByCondition(condition, pagesModel);
		return pagesModel;
	}
	
	/**
	 * 添加跳转页
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "dada/series/insert";
	}
	
	/**
	 * 新增品牌
	 * @param configSeriesReq
	 * @return
	 */
	@RequestMapping("/insertSeries")
	@ResponseBody
	public Result<Boolean> insertBrand(ConfigSeriesReq configSeriesReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.insertSeries(configSeriesReq);
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
