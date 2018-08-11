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
import com.jiabian.mama.request.MamaOrderReq;
import com.jiabian.mama.response.MamaOrderRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaOrder")
public class MamaOrderController extends BaseController<MamaOrderReq, MamaOrderRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 后台查询订单
	 * @param mamaOrderReq
	 * @param map
	 */
	@RequestMapping("/selectMamaOrders")
	public String selectMamaOrders(ModelMap map, MamaOrderReq mamaOrderReq) {
		PagesModel<MamaOrderReq, MamaOrderRes> pagesModel = new PagesModel<>(mamaOrderReq);
		if(mamaOrderReq.getIsDel() == null) mamaOrderReq.setIsDel((byte) 1);
		if(mamaOrderReq.getPayment() == null) mamaOrderReq.setPayment((byte) 0);
		if(mamaOrderReq.getDeliver() == null) mamaOrderReq.setDeliver((byte) 0);
		this.setPagesToModel(pagesModel, mamaOrderReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectMamaOrders(pagesModel, mamaOrderReq);
		map.put("pagesModel", pagesModel);
		map.put("orderNumber", mamaOrderReq.getOrderNumber());
		map.put("payment", mamaOrderReq.getPayment());
		map.put("deliver", mamaOrderReq.getDeliver());
		map.put("isDel", mamaOrderReq.getIsDel());
		return "mama/orders/select";
	}
	
	/**
	 * 根据id删除还原订单
	 * @param id
	 * @param isDel
	 * @return res
	 */
	@RequestMapping("/operateMamaOrderById")
	@ResponseBody
	public Result<Boolean> operateMamaOrderById(@RequestParam("id") Long id, @RequestParam("isDel") Byte isDel) {
		Result<Boolean> res = new Result<>();
		String message;
		isDel = (byte) (isDel == 1 ? 2 : 1);
		Integer result = iMamaService.operateMamaOrderById(id, isDel);
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
	 * 批量删除/还原订单
	 * @param idList
	 * @param isDel
	 * @return res
	 */
	@RequestMapping("/operateMamaOrdersBatch")
	@ResponseBody
	public Result<Boolean> operateMamaOrdersBatch(@RequestParam("idList") String idList, @RequestParam("isDel")Byte isDel) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Long> ids = new ArrayList<>();
		isDel = (byte) (isDel == 1 ? 2 : 1);
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		} else {
			String[] strs = idList.split("-");
			for(String s : strs) {
				ids.add(Long.parseLong(s));
			}
		}
		Integer result = iMamaService.operateMamaOrdersBatch(ids, isDel);
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
