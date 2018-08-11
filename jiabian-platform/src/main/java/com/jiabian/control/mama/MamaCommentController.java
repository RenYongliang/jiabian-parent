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
import com.jiabian.mama.request.MamaCommentReq;
import com.jiabian.mama.response.MamaCommentRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaComments")
public class MamaCommentController extends BaseController<MamaCommentReq, MamaCommentRes> {

	@Autowired
	private IMamaService iMamaService;
	
	/**
	 * 后台查询用户评论
	 * @param mamaCommentReq
	 * @param map
	 */
	@RequestMapping("/commentList")
	public String selectMamaComments(MamaCommentReq mamaCommentReq, ModelMap map) {
		//System.out.println(mamaCommentReq.getId());
		//System.out.println(mamaCommentReq.getGoodid());
		PagesModel<MamaCommentReq, MamaCommentRes> pagesModel = new PagesModel<>(mamaCommentReq);
		this.setPagesToModel(pagesModel, mamaCommentReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectMamaComments(pagesModel, mamaCommentReq);
		map.put("pagesModel", pagesModel);
		map.put("id", mamaCommentReq.getId());
		map.put("goodid", mamaCommentReq.getGoodid());
		return "mama/comments/select";
	}
	
	/**
	 * 删除评论
	 * @param id
	 * @return res
	 */
	@RequestMapping("/deleteMamaComment")
	@ResponseBody
	public Result<Boolean> deleteMamaComment(@RequestParam("id") Long id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.deleteMamaComment(id);
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
	 * 批量删除评论
	 * @param idList
	 * @return res
	 */
	@RequestMapping("/delMamaCommentsBatch")
	@ResponseBody
	public Result<Boolean> delMamaCommentsBatch(@RequestParam("idList") String idList) {
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
		Integer result = iMamaService.delMamaCommentsBatch(ids);
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
