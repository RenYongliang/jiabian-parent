package com.jiabian.tspt;

import java.util.List;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.complaints.Complaints;
import com.jiabian.tspt.request.CommentReq;
import com.jiabian.tspt.request.ComplUserReq;
import com.jiabian.tspt.request.ComplaintsReq;
import com.jiabian.tspt.response.CommentRes;
import com.jiabian.tspt.response.ComplUserRes;
import com.jiabian.tspt.response.ComplaintsRes;

public interface IComplaintService {

	PagesModel<ComplUserReq, ComplUserRes> selectUsers(PagesModel<ComplUserReq, ComplUserRes> pagesModel);

	PagesModel<ComplUserReq, ComplUserRes> selectComplUsersByCondition(String condition, PagesModel<ComplUserReq, ComplUserRes> pagesModel);

	PagesModel<ComplaintsReq, ComplaintsRes> selectComplaints(PagesModel<ComplaintsReq, ComplaintsRes> pagesModel);

	PagesModel<ComplaintsReq, ComplaintsRes> selectComplaintsByCondition(ComplaintsReq complaintsReq, PagesModel<ComplaintsReq, ComplaintsRes> pagesModel);

	Integer updateComplaintStatus(Complaints complaints);

	Integer deleteComment(Long id);

	Integer delBatchComments(List<Long> ids);

	PagesModel<CommentReq, CommentRes> selectCommentsWithUser(PagesModel<CommentReq, CommentRes> pagesModel, CommentReq commentReq);

}
