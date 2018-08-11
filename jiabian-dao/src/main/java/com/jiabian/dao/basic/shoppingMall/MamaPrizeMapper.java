/*
 * MamaPrizeMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-09 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaPrize;
import com.jiabian.beans.basic.shoppingMall.MamaPrizeQueryHelper;
import com.jiabian.mama.request.MamaBannerReq;
import com.jiabian.mama.request.MamaPrizeReq;
import com.jiabian.mama.response.MamaBannerRes;
import com.jiabian.mama.response.MamaPrizeRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaPrizeMapper {
    int countByExample(MamaPrizeQueryHelper example);

    int deleteByExample(MamaPrizeQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaPrize record);

    int insertSelective(MamaPrize record);

    List<MamaPrize> selectByExample(MamaPrizeQueryHelper example);

    MamaPrize selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaPrize record, @Param("example") MamaPrizeQueryHelper example);

    int updateByExample(@Param("record") MamaPrize record, @Param("example") MamaPrizeQueryHelper example);

    int updateByPrimaryKeySelective(MamaPrize record);

    int updateByPrimaryKey(MamaPrize record);
    
    Integer countMamaPrize(@Param("pagesModel") PagesModel<MamaPrizeReq, MamaPrizeRes> pagesModel,@Param("condition") MamaPrizeReq mamaPrizeReq);
    
    List<MamaPrizeRes> selectMamaPrize(@Param("pagesModel") PagesModel<MamaPrizeReq, MamaPrizeRes> pagesModel, @Param("condition") MamaPrizeReq mamaPrizeReq);
}