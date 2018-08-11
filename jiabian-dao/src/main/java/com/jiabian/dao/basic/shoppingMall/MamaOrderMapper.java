/*
 * MamaOrderMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-06 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaOrder;
import com.jiabian.beans.basic.shoppingMall.MamaOrderQueryHelper;
import com.jiabian.mama.request.MamaOrderReq;
import com.jiabian.mama.response.MamaOrderRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaOrderMapper {
    int countByExample(MamaOrderQueryHelper example);

    int deleteByExample(MamaOrderQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaOrder record);

    int insertSelective(MamaOrder record);

    List<MamaOrder> selectByExample(MamaOrderQueryHelper example);

    MamaOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaOrder record, @Param("example") MamaOrderQueryHelper example);

    int updateByExample(@Param("record") MamaOrder record, @Param("example") MamaOrderQueryHelper example);

    int updateByPrimaryKeySelective(MamaOrder record);

    int updateByPrimaryKey(MamaOrder record);

	Integer countMamaOrders(@Param("pagesModel") PagesModel<MamaOrderReq, MamaOrderRes> pagesModel, @Param("condition") MamaOrderReq mamaOrderReq);

	List<MamaOrderRes> selectMamaOrders(@Param("pagesModel") PagesModel<MamaOrderReq, MamaOrderRes> pagesModel, @Param("condition") MamaOrderReq mamaOrderReq);
}