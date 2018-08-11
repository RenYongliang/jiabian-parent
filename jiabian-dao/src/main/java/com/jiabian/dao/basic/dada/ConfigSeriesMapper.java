/*
 * ConfigSeriesMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.ConfigSeries;
import com.jiabian.beans.basic.dada.ConfigSeriesQueryHelper;
import com.jiabian.dada.request.ConfigSeriesReq;
import com.jiabian.dada.response.ConfigSeriesRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigSeriesMapper {
    int countByExample(ConfigSeriesQueryHelper example);

    int deleteByExample(ConfigSeriesQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigSeries record);

    int insertSelective(ConfigSeries record);

    List<ConfigSeries> selectByExample(ConfigSeriesQueryHelper example);

    ConfigSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigSeries record, @Param("example") ConfigSeriesQueryHelper example);

    int updateByExample(@Param("record") ConfigSeries record, @Param("example") ConfigSeriesQueryHelper example);

    int updateByPrimaryKeySelective(ConfigSeries record);

    int updateByPrimaryKey(ConfigSeries record);

	List<ConfigSeriesRes> selectSeries(PagesModel<ConfigSeriesReq, ConfigSeriesRes> pagesModel);

	List<ConfigSeriesRes> selectSeriesByCondition(@Param("condition") String condition,
			@Param("pagesModel") PagesModel<ConfigSeriesReq, ConfigSeriesRes> pagesModel);
}