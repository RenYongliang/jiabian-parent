/*
 * MamaGoodsMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-04 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaGoods;
import com.jiabian.beans.basic.shoppingMall.MamaGoodsQueryHelper;
import com.jiabian.mama.request.MamaGoodsReq;
import com.jiabian.mama.response.MamaGoodsRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaGoodsMapper {
    int countByExample(MamaGoodsQueryHelper example);

    int deleteByExample(MamaGoodsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaGoods record);

    int insertSelective(MamaGoods record);

    List<MamaGoods> selectByExample(MamaGoodsQueryHelper example);

    MamaGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaGoods record, @Param("example") MamaGoodsQueryHelper example);

    int updateByExample(@Param("record") MamaGoods record, @Param("example") MamaGoodsQueryHelper example);

    int updateByPrimaryKeySelective(MamaGoods record);

    int updateByPrimaryKey(MamaGoods record);
    
    Integer countMamaGoods(@Param("pagesModel") PagesModel<MamaGoodsReq, MamaGoodsRes> pagesModel, @Param("condition") MamaGoodsReq mamaGoodsReq);

	List<MamaGoodsRes> selectMamaGoods(@Param("pagesModel") PagesModel<MamaGoodsReq, MamaGoodsRes> pagesModel, @Param("condition") MamaGoodsReq mamaGoodsReq);
}