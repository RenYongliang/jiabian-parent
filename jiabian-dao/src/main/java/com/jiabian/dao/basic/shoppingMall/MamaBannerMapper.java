/*
 * MamaBannerMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-07 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaBanner;
import com.jiabian.beans.basic.shoppingMall.MamaBannerQueryHelper;
import com.jiabian.mama.request.MamaBannerReq;
import com.jiabian.mama.response.MamaBannerRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaBannerMapper {
    int countByExample(MamaBannerQueryHelper example);

    int deleteByExample(MamaBannerQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaBanner record);

    int insertSelective(MamaBanner record);

    List<MamaBanner> selectByExample(MamaBannerQueryHelper example);

    MamaBanner selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaBanner record, @Param("example") MamaBannerQueryHelper example);

    int updateByExample(@Param("record") MamaBanner record, @Param("example") MamaBannerQueryHelper example);

    int updateByPrimaryKeySelective(MamaBanner record);

    int updateByPrimaryKey(MamaBanner record);

	Integer countMamaBanners(@Param("pagesModel") PagesModel<MamaBannerReq, MamaBannerRes> pagesModel, @Param("condition") MamaBannerReq mamaBannerReq);
	
	List<MamaBannerRes> selectMamaBanners(@Param("pagesModel") PagesModel<MamaBannerReq, MamaBannerRes> pagesModel, @Param("condition") MamaBannerReq mamaBannerReq);
}