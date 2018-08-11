/*
 * MamaNewsMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-30 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaNews;
import com.jiabian.beans.basic.shoppingMall.MamaNewsQueryHelper;
import com.jiabian.mama.request.MamaNewsReq;
import com.jiabian.mama.response.MamaNewsRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaNewsMapper {
	int countByExample(MamaNewsQueryHelper example);

	int deleteByExample(MamaNewsQueryHelper example);

	int deleteByPrimaryKey(Long id);

	int insert(MamaNews record);

	int insertSelective(MamaNews record);

	List<MamaNews> selectByExample(MamaNewsQueryHelper example);

	MamaNews selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") MamaNews record, @Param("example") MamaNewsQueryHelper example);

	int updateByExample(@Param("record") MamaNews record, @Param("example") MamaNewsQueryHelper example);

	int updateByPrimaryKeySelective(MamaNews record);

	int updateByPrimaryKey(MamaNews record);

	Integer countMamaNews(@Param("pagesModel") PagesModel<MamaNewsReq, MamaNewsRes> pagesModel,
			@Param("condition") MamaNewsReq mamaNewsReq);

	List<MamaNewsRes> selectMamaNews(@Param("pagesModel") PagesModel<MamaNewsReq, MamaNewsRes> pagesModel,
			@Param("condition") MamaNewsReq mamaNewsReq);
}