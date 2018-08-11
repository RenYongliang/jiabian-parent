package com.jiabian.control.mama;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.beans.basic.shoppingMall.MamaUser;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaUserReq;
import com.jiabian.mama.response.MamaUserRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaUser")
public class MamaUserController extends BaseController<MamaUserReq, MamaUserRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 后台查询用户列表
	 * @param map
	 * @param mamaUserReq
	 * @return
	 */
	@RequestMapping("/userList")
	public String selectUsers(ModelMap map, MamaUserReq mamaUserReq) {
		System.out.println(mamaUserReq);
		if(mamaUserReq.getIsDel() == null) mamaUserReq.setIsDel((byte) 1);
		PagesModel<MamaUserReq, MamaUserRes> pagesModel = new PagesModel<>(mamaUserReq);
		this.setPagesToModel(pagesModel, mamaUserReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectUsers(pagesModel, mamaUserReq);
		map.put("pagesModel", pagesModel);
		map.put("isDel", mamaUserReq.getIsDel());
		map.put("name", mamaUserReq.getName());
		map.put("openid", mamaUserReq.getOpenid());
		return "mama/users/select";
	}
	
	/**
	 * 删除/还原用户
	 * @param id
	 * @param isDel
	 * @return res
	 */
	@RequestMapping("/deleteUser")
	@ResponseBody
	public Result<Boolean> deleteUser(@RequestParam("id") Long id, @RequestParam("isDel") Byte isDel) {
		Result<Boolean> res = new Result<>();
		String message;
		MamaUser mamaUser = new MamaUser();
		mamaUser.setIsDel((byte) (isDel == 1 ? 2 : 1));
		mamaUser.setId(id);
		mamaUser.setUpdateTime(new Date());
		Integer result = iMamaService.updateMamaUser(mamaUser);
		if(result > 0) {
			res.setData(true);
			message = "操作成功！";
		}else {
			res.setData(false);
			message = "操作失败！";
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 批量删除/还原用户
	 * @param id
	 * @param isDel
	 * @return res
	 */
	@RequestMapping("/delBatchUsers")
	@ResponseBody
	public Result<Boolean> delBatchUsers(@RequestParam("idList") String idList, @RequestParam("isDel") Byte isDel) {
		Result<Boolean> res = new Result<>();
		List<Long> ids = new ArrayList<>();
		String message;
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		}else {
			String[] strs = idList.split("-");
			for(String s : strs) {
				ids.add(Long.parseLong(s));
			}
		}
		isDel = (byte) (isDel == 1 ? 2 : 1);
		Integer result = iMamaService.UpdateBatchMamaUsers(ids, isDel);
		if(result > 0) {
			res.setData(true);
			message = "操作成功！";
		}else {
			res.setData(false);
			message = "操作失败！";
		}
		res.setDesc(message);
		return res;
	}
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return mamaUser
	 */
	@RequestMapping("/selectMamaUserById")
	@ResponseBody
	public MamaUser selectMamaUserById(@RequestParam("id") Long id) {
		return iMamaService.selectMamaUserById(id);
	}
	
}
