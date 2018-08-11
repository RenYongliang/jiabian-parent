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
import com.jiabian.beans.basic.shoppingMall.MamaNews;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaNewsReq;
import com.jiabian.mama.response.MamaNewsRes;
import com.jiabian.util.Result;

@Controller
@RequestMapping("/mamaNews")
public class MamaNewsController extends BaseController<MamaNewsReq, MamaNewsRes> {

	@Autowired
	private IMamaService iMamaService;

	/**
	 * 后台查询新闻
	 * 
	 * @param map
	 * @param mamaNewsReq
	 * @return
	 */
	@RequestMapping("/newsList")
	public String selectNews(ModelMap map, MamaNewsReq mamaNewsReq) {
		if (mamaNewsReq.getIsDel() == null)
			mamaNewsReq.setIsDel((byte) 1);
		if (mamaNewsReq.getType() == null)
			mamaNewsReq.setType((byte) 0);
		// System.out.println(mamaNewsReq.getOffset());
		// System.out.println(mamaNewsReq.getPage());
		// System.out.println(mamaNewsReq.getSize());
		PagesModel<MamaNewsReq, MamaNewsRes> pagesModel = new PagesModel<>(mamaNewsReq);
		this.setPagesToModel(pagesModel, mamaNewsReq);
		pagesModel.setOrderBy("id asc");
		iMamaService.selectNews(pagesModel, mamaNewsReq);
		map.put("pagesModel", pagesModel);
		map.put("isDel", mamaNewsReq.getIsDel());
		map.put("title", mamaNewsReq.getTitle());
		map.put("type", mamaNewsReq.getType());
		return "mama/news/select";
	}

	/**
	 * 删除/还原新闻
	 * 
	 * @param isDel
	 * @param id
	 * @return res
	 */
	@RequestMapping("/operateMamaNews")
	@ResponseBody
	public Result<Boolean> operateMamaNews(@RequestParam("isDel") Byte isDel, @RequestParam("id") Long id) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.operateMamaNewsStatus(isDel, id);
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
	 * 批量删除/还原新闻
	 * 
	 * @param isDel
	 * @param idList
	 * @return res
	 */
	@RequestMapping("/operateMamaNewsBatch")
	@ResponseBody
	public Result<Boolean> operateMamaNewsBatch(@RequestParam("idList") String idList,
			@RequestParam("isDel") Byte isDel) {
		Result<Boolean> res = new Result<>();
		String message;
		List<Long> ids = new ArrayList<>();
		if (!idList.contains("-")) {
			ids.add(Long.parseLong(idList));
		} else {
			String[] strs = idList.split("-");
			for (String s : strs) {
				ids.add(Long.parseLong(s));
			}
		}
		Integer result = iMamaService.operateMamaNewsStatusBatch(ids, isDel);
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
	 * 跳转至新增新闻界面
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "mama/news/insert";
	}

	/**
	 * 新增新闻
	 * 
	 * @param mamaNewsReq
	 * @return res
	 */
	@RequestMapping("/insertMamaNews")
	@ResponseBody
	public Result<Boolean> insertMamaNews(MamaNewsReq mamaNewsReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.insertMamaNews(mamaNewsReq);
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
	 * 根据id查询新闻
	 * 
	 * @param id
	 * @param map
	 */
	@RequestMapping("/selectMamaNewsById")
	public String selectMamaNewsById(@RequestParam("id") Long id, ModelMap map) {
		MamaNews mamaNews = iMamaService.selectNewsById(id);
		map.put("mamaNews", mamaNews);
		return "mama/news/update";
	}

	/**
	 * 更新新闻信息
	 * 
	 * @param mamaNewsReq
	 * @return res
	 */
	@RequestMapping("/updateMamaNews")
	@ResponseBody
	public Result<Boolean> updateMamaNews(MamaNewsReq mamaNewsReq) {
		Result<Boolean> res = new Result<>();
		String message;
		Integer result = iMamaService.updateMamaNews(mamaNewsReq);
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

}
