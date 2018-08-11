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
import com.jiabian.dada.request.ConfigCarReq;
import com.jiabian.dada.response.ConfigCarRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/cars")
public class ConfigCarController extends BaseController<ConfigCarReq, ConfigCarRes> {

	@Autowired
	private IDadaService iDadaService;
	
	/**
	 * 根据ID查询汽车
	 * @param id
	 * @param map
	 * @param configCarReq
	 * @return
	 */
	@RequestMapping("/selectCarsByCXId")
	public String selectCarsByCXId(@RequestParam("cx_id") String cxid, ModelMap map, ConfigCarReq configCarReq) {
		PagesModel<ConfigCarReq, ConfigCarRes> pagesModel = new PagesModel<>(configCarReq);
		//this.setPagesToModel(pagesModel, configCarReq);
		pagesModel.setOrderBy("id asc");
		iDadaService.selectCarsByCXId(cxid, pagesModel);
		map.put("cx_id", cxid);
		map.put("pagesModel", pagesModel);
		return "dada/cars/select";
	}
	
	/**
	 * 删除汽车
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteCarById")
	@ResponseBody
	public Result<Boolean> deleteCarById(@RequestParam("id") Integer id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iDadaService.deleteCarById(id);
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
	 * 批量删除汽车
	 * @param idList
	 * @return
	 */
	@RequestMapping("/delBatchCars/{idList}")
	@ResponseBody
	public Result<Boolean> delBatchCars(@PathVariable("idList") String idList) {
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
		Integer result = iDadaService.delBatchCars(ids);
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
