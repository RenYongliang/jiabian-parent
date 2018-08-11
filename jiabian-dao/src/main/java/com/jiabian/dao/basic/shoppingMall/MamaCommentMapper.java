/*
 * MamaCommentMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-31 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaComment;
import com.jiabian.beans.basic.shoppingMall.MamaCommentQueryHelper;
import com.jiabian.mama.request.MamaCommentReq;
import com.jiabian.mama.response.MamaCommentRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaCommentMapper {
    int countByExample(MamaCommentQueryHelper example);

    int deleteByExample(MamaCommentQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaComment record);

    int insertSelective(MamaComment record);

    List<MamaComment> selectByExample(MamaCommentQueryHelper example);

    MamaComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaComment record, @Param("example") MamaCommentQueryHelper example);

    int updateByExample(@Param("record") MamaComment record, @Param("example") MamaCommentQueryHelper example);

    int updateByPrimaryKeySelective(MamaComment record);

    int updateByPrimaryKey(MamaComment record);

	Integer countMamaComments(@Param("pagesModel") PagesModel<MamaCommentReq, MamaCommentRes> pagesModel, @Param("condition") MamaCommentReq mamaCommentReq);

	List<MamaCommentRes> selectMamaComments(@Param("pagesModel") PagesModel<MamaCommentReq, MamaCommentRes> pagesModel, @Param("condition") MamaCommentReq mamaCommentReq);
}