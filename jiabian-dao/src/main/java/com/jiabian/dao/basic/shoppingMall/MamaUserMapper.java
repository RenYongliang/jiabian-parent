/*
 * MamaUserMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-26 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaUser;
import com.jiabian.beans.basic.shoppingMall.MamaUserQueryHelper;
import com.jiabian.mama.request.MamaUserReq;
import com.jiabian.mama.response.MamaUserRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaUserMapper {
    int countByExample(MamaUserQueryHelper example);

    int deleteByExample(MamaUserQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaUser record);

    int insertSelective(MamaUser record);

    List<MamaUser> selectByExample(MamaUserQueryHelper example);

    MamaUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaUser record, @Param("example") MamaUserQueryHelper example);

    int updateByExample(@Param("record") MamaUser record, @Param("example") MamaUserQueryHelper example);

    int updateByPrimaryKeySelective(MamaUser record);

    int updateByPrimaryKey(MamaUser record);

	List<MamaUserRes> selectMamaUsers(@Param("pagesModel") PagesModel<MamaUserReq, MamaUserRes> pagesModel, @Param("condition") MamaUserReq mamaUserReq);

	Integer countMamaUsers(@Param("pagesModel") PagesModel<MamaUserReq, MamaUserRes> pagesModel, @Param("condition") MamaUserReq mamaUserReq);
}