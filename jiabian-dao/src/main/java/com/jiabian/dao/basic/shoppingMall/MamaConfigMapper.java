/*
 * MamaConfigMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-06 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaConfig;
import com.jiabian.beans.basic.shoppingMall.MamaConfigQueryHelper;
import com.jiabian.mama.request.MamaConfigReq;
import com.jiabian.mama.response.MamaConfigRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaConfigMapper {
    int countByExample(MamaConfigQueryHelper example);

    int deleteByExample(MamaConfigQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaConfig record);

    int insertSelective(MamaConfig record);

    List<MamaConfig> selectByExample(MamaConfigQueryHelper example);

    MamaConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaConfig record, @Param("example") MamaConfigQueryHelper example);

    int updateByExample(@Param("record") MamaConfig record, @Param("example") MamaConfigQueryHelper example);

    int updateByPrimaryKeySelective(MamaConfig record);

    int updateByPrimaryKey(MamaConfig record);

	Integer countMamaConfig(@Param("pagesModel") PagesModel<MamaConfigReq, MamaConfigRes> pagesModel,
			@Param("condition") MamaConfigReq mamaConfigReq);

	List<MamaConfigRes> selectMamaConfig(@Param("pagesModel") PagesModel<MamaConfigReq, MamaConfigRes> pagesModel,
			@Param("condition") MamaConfigReq mamaConfigReq);
}