package com.jiabian.control.mama;

import com.jiabian.util.Result;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaPrizeReq;
import com.jiabian.mama.response.MamaPrizeRes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mamaPrize")
public class MamaPrizeController extends BaseController<MamaPrizeReq, MamaPrizeRes> {
	
	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 查询抽奖信息
	 * @param map
	 * @param mamaPReq
	 */	
	@RequestMapping("/prizeList")
	public String getPrizeList(ModelMap map,MamaPrizeReq mamaPrizeReq) {
		PagesModel<MamaPrizeReq, MamaPrizeRes> pagesModel = new PagesModel<>(mamaPrizeReq);
		this.setPagesToModel(pagesModel, mamaPrizeReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectMamaPrize(pagesModel, mamaPrizeReq);
		map.put("pagesModel", pagesModel);
		return "mama/prize/select";
		
	}

	/**
	 * 跳转至新增抽奖信息界面
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "mama/prize/insert";
	}

	/**
	 * 新增抽奖信息
	 *
	 * @param mamaPrizeReq
	 * @return res
	 */
	@ResponseBody
	@RequestMapping("/insertMamaPrize")
	public Result<Boolean> insertMamaPrize(MamaPrizeReq mamaPrizeReq){
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.insertMamaPrize(mamaPrizeReq);
		if (result > 0) {
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
	 * 删除抽奖信息
	 */
	@ResponseBody
	@RequestMapping("/deleteMamaPrize")
	public Result<Boolean> deleteMamaPrize(@RequestParam("id") Long id){
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.deleteMamaPrize(id);
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
	 *
	 * @param idList
	 * @return res
	 */
	@ResponseBody
	@RequestMapping("/deleteMamaPrizesBatch")
	public Result<Boolean> deleteMamaPrizeBatch(@RequestParam("idList") String idList){
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
		Integer result = iMamaService.deleteMamaPrizesBatch(ids);
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
