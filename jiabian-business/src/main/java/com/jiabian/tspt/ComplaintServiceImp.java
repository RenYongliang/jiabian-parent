package com.jiabian.tspt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.complaints.CommentQueryHelper;
import com.jiabian.beans.basic.complaints.CommentQueryHelper.Criteria;
import com.jiabian.beans.basic.complaints.Complaints;
import com.jiabian.dao.basic.complaints.CommentMapper;
import com.jiabian.dao.basic.complaints.ComplUserMapper;
import com.jiabian.dao.basic.complaints.ComplaintsMapper;
import com.jiabian.tspt.request.CommentReq;
import com.jiabian.tspt.request.ComplUserReq;
import com.jiabian.tspt.request.ComplaintsReq;
import com.jiabian.tspt.response.CommentRes;
import com.jiabian.tspt.response.ComplUserRes;
import com.jiabian.tspt.response.ComplaintsRes;

@Service
public class ComplaintServiceImp implements IComplaintService {

	@Autowired
	private ComplUserMapper complUserMapper;
	
	@Autowired
	private ComplaintsMapper complaintsMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
//============================================================================================================================	
	@Override
	public PagesModel<ComplUserReq, ComplUserRes> selectUsers(PagesModel<ComplUserReq, ComplUserRes> pagesModel) {
		pagesModel.setTotal(complUserMapper.countComplUsers(pagesModel));
		pagesModel.setResults(complUserMapper.selectComplUsers(pagesModel));
		return pagesModel;
	}

	@Override
	public PagesModel<ComplUserReq, ComplUserRes> selectComplUsersByCondition(String condition,
			PagesModel<ComplUserReq, ComplUserRes> pagesModel) {
		pagesModel.setResults(complUserMapper.selectComplUsersByCondition(condition, pagesModel));
		return pagesModel;
	}
	
//============================================================================================================================	
	@Override
	public PagesModel<ComplaintsReq, ComplaintsRes> selectComplaints(
			PagesModel<ComplaintsReq, ComplaintsRes> pagesModel) {
		pagesModel.setTotal(complaintsMapper.countByExample(null));
		pagesModel.setResults(complaintsMapper.selectComplaints(pagesModel));
		return pagesModel;
	}

	@Override
	public PagesModel<ComplaintsReq, ComplaintsRes> selectComplaintsByCondition(ComplaintsReq complaintsReq,
			PagesModel<ComplaintsReq, ComplaintsRes> pagesModel) {
		pagesModel.setTotal(complaintsMapper.countComplaintsByCondition(complaintsReq, pagesModel));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * complaintsReq.getSize()) {
			pagesModel.setCurrentPage(1);
		}
		pagesModel.setResults(complaintsMapper.selectComplaintsByCondition(complaintsReq, pagesModel));
		return pagesModel;
	}

	@Override
	public Integer updateComplaintStatus(Complaints complaints) {
		return complaintsMapper.updateByPrimaryKeySelective(complaints);
	}
	
//============================================================================================================================	
	@Override
	public Integer deleteComment(Long id) {
		return commentMapper.deleteComment(id);
	}

	@Override
	public Integer delBatchComments(List<Long> ids) {
		CommentQueryHelper helper = new CommentQueryHelper();
		Criteria criteria = helper.createCriteria();
		criteria.andIdIn(ids);
		return commentMapper.deleteByExample(helper);
	}

	@Override
	public PagesModel<CommentReq, CommentRes> selectCommentsWithUser(PagesModel<CommentReq, CommentRes> pagesModel,
			CommentReq commentReq) {
		pagesModel.setTotal(commentMapper.countCommentByCompid(pagesModel, commentReq));
		if(pagesModel.getTotal() <= (pagesModel.getCurrentPage() - 1) * commentReq.getSize()) {
			pagesModel.setCurrentPage(1);
		}
		pagesModel.setResults(commentMapper.selectCommentByCompid(pagesModel, commentReq));
		for(CommentRes user : pagesModel.getResults()) {
			System.out.println(user);
		}
		return pagesModel;
	}

}
