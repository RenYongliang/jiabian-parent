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
import com.jiabian.beans.basic.shoppingMall.MamaAddress;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaAddressReq;
import com.jiabian.mama.response.MamaAddressRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaAddress")
public class MamaAddressController extends BaseController<MamaAddressReq, MamaAddressRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 根据id查询用户的个人地址
	 * @param id
	 * @param map
	 * @param mamaAddressReq
	 */
	@RequestMapping("/selectMamaAddress")
	public String selectMamaAddress(@RequestParam("id") Long id, ModelMap map, MamaAddressReq mamaAddressReq) {
		PagesModel<MamaAddressReq, MamaAddressRes> pagesModel = new PagesModel<>(mamaAddressReq);
		this.setPagesToModel(pagesModel, mamaAddressReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectMamaAddressByUserId(pagesModel, id);
		map.put("pagesModel", pagesModel);
		map.put("userid", id);
		return "mama/address/select";
	}
	
	/**
	 * 根据id删除地址
	 * @param id
	 * @return res
	 */
	@RequestMapping("/deleteAddress")
	@ResponseBody
	public Result<Boolean> deleteAddress(@RequestParam("id") Long id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.deleteAddress(id);
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
	 * 批量删除地址
	 * @param idList
	 * @return res
	 */
	@RequestMapping("/delBatchAddress")
	@ResponseBody
	public Result<Boolean> delBatchAddress(@RequestParam("idList") String idList) {
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
		Integer result = iMamaService.deleteAddressBatch(ids);
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
	 * @param userid
	 * @param map
	 */
	@RequestMapping("/toInsert")
	public String toInsert(@RequestParam("userid") Long userid, ModelMap map) {
		map.put("userid", userid);
		return "mama/address/insert";
	}
	
	/**
	 * 新增地址
	 * @param mamaAddressReq
	 * @return res
	 */
	@RequestMapping("/insertMamaAddress")
	@ResponseBody
	public Result<Boolean> insertMamaAddress(MamaAddressReq mamaAddressReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.inserMamaAddres(mamaAddressReq);
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
	 * 根据id查找地址
	 * @param id
	 * @return address
	 */
	@RequestMapping("/getMamaAddressById")
	@ResponseBody
	public MamaAddress getMamaAddressById(@RequestParam("id") Long id) {
		return iMamaService.getMamaAddressById(id);
	}
}
