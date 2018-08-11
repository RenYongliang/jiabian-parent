/*
 * ConfigBrandMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.ConfigBrand;
import com.jiabian.beans.basic.dada.ConfigBrandQueryHelper;
import com.jiabian.dada.request.ConfigBrandReq;
import com.jiabian.dada.response.ConfigBrandRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBrandMapper {
    int countByExample(ConfigBrandQueryHelper example);

    int deleteByExample(ConfigBrandQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBrand record);

    int insertSelective(ConfigBrand record);

    List<ConfigBrand> selectByExample(ConfigBrandQueryHelper example);

    ConfigBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBrand record, @Param("example") ConfigBrandQueryHelper example);

    int updateByExample(@Param("record") ConfigBrand record, @Param("example") ConfigBrandQueryHelper example);

    int updateByPrimaryKeySelective(ConfigBrand record);

    int updateByPrimaryKey(ConfigBrand record);

	List<ConfigBrandRes> selectBrands(PagesModel<ConfigBrandReq, ConfigBrandRes> pagesModel);

	Integer countBrandsByCondition(@Param("condition") String condition,
			@Param("pagesModel") PagesModel<ConfigBrandReq, ConfigBrandRes> pagesModel);
	
	List<ConfigBrandRes> selectBrandsByCondition(@Param("condition") String condition,
			@Param("pagesModel") PagesModel<ConfigBrandReq, ConfigBrandRes> pagesModel);
}