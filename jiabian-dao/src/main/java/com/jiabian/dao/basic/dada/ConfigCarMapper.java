/*
 * ConfigCarMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.dao.basic.dada;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.dada.ConfigCar;
import com.jiabian.beans.basic.dada.ConfigCarQueryHelper;
import com.jiabian.dada.request.ConfigCarReq;
import com.jiabian.dada.response.ConfigCarRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigCarMapper {
    int countByExample(ConfigCarQueryHelper example);

    int deleteByExample(ConfigCarQueryHelper example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigCar record);

    int insertSelective(ConfigCar record);

    List<ConfigCar> selectByExample(ConfigCarQueryHelper example);

    ConfigCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigCar record, @Param("example") ConfigCarQueryHelper example);

    int updateByExample(@Param("record") ConfigCar record, @Param("example") ConfigCarQueryHelper example);

    int updateByPrimaryKeySelective(ConfigCar record);

    int updateByPrimaryKey(ConfigCar record);

	List<ConfigCarRes> selectCarsByCXId(@Param("cxid") String cxid, @Param("pagesModel") PagesModel<ConfigCarReq, ConfigCarRes> pagesModel);
}