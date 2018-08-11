/*
 * MamaAddressMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-31 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaAddress;
import com.jiabian.beans.basic.shoppingMall.MamaAddressQueryHelper;
import com.jiabian.mama.request.MamaAddressReq;
import com.jiabian.mama.response.MamaAddressRes;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MamaAddressMapper {
    int countByExample(MamaAddressQueryHelper example);

    int deleteByExample(MamaAddressQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaAddress record);

    int insertSelective(MamaAddress record);

    List<MamaAddress> selectByExample(MamaAddressQueryHelper example);

    MamaAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaAddress record, @Param("example") MamaAddressQueryHelper example);

    int updateByExample(@Param("record") MamaAddress record, @Param("example") MamaAddressQueryHelper example);

    int updateByPrimaryKeySelective(MamaAddress record);

    int updateByPrimaryKey(MamaAddress record);

	Integer countMamaAddressByUserId(@Param("pagesModel") PagesModel<MamaAddressReq, MamaAddressRes> pagesModel, @Param("id") Long id);

	List<MamaAddressRes> selectMamaAddressByUserId(@Param("pagesModel") PagesModel<MamaAddressReq, MamaAddressRes> pagesModel, @Param("id") Long id);
}