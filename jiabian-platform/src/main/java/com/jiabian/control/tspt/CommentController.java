package com.jiabian.control.tspt;

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
import com.jiabian.tspt.IComplaintService;
import com.jiabian.tspt.request.CommentReq;
import com.jiabian.tspt.response.CommentRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/comments")
public class CommentController extends BaseController<CommentReq, CommentRes> {

	@Autowired
	private IComplaintService iComplaintService;
	
	/**
	 * 根据公司id后台查询评论列表
	 * @param map
	 * @param commentReq
	 * @return
	 */
	@RequestMapping("/commentList")
	public String selectComment(ModelMap map, CommentReq commentReq, @RequestParam("compid") Long compid) {
		System.out.println(commentReq);
		System.out.println(compid);
		if(compid != null) commentReq.setCompid(compid);
		PagesModel<CommentReq, CommentRes> pagesModel = new PagesModel<>(commentReq);
		this.setPagesToModel(pagesModel, commentReq);
		pagesModel.setOrderBy("c.id desc");
		iComplaintService.selectCommentsWithUser(pagesModel, commentReq);
		map.put("pagesModel", pagesModel);
		map.put("compid", compid);
		map.put("id", commentReq.getId());
		map.put("userid", commentReq.getUserid());
		return "complaints/comment/select";
	}
	
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteComment")
	@ResponseBody
	public Result<Boolean> deleteComment(@RequestParam("id") Long id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iComplaintService.deleteComment(id);
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
	@RequestMapping("/delBatchComments/{idList}")
	@ResponseBody
	public Result<Boolean> delBatchComments(@PathVariable("idList") String idList) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Long> ids = new ArrayList<>();
		if(!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		}else {
			String[] idStrs = idList.split("-");
			for(String idStr : idStrs) {
				ids.add(Long.parseLong(idStr));
			}
		}
		Integer result = iComplaintService.delBatchComments(ids);
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
