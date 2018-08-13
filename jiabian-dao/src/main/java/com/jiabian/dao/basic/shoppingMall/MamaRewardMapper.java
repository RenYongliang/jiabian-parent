/*
 * MamaRewardMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-13 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.base.PagesModel;
import com.jiabian.beans.basic.shoppingMall.MamaReward;
import com.jiabian.beans.basic.shoppingMall.MamaRewardQueryHelper;
import java.util.List;
import java.util.Map;

import com.jiabian.mama.request.MamaPrizeReq;
import com.jiabian.mama.request.MamaRewardReq;
import com.jiabian.mama.response.MamaPrizeRes;
import com.jiabian.mama.response.MamaRewardRes;
import org.apache.ibatis.annotations.Param;

public interface MamaRewardMapper {
    int countByExample(MamaRewardQueryHelper example);

    int deleteByExample(MamaRewardQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(MamaReward record);

    int insertSelective(MamaReward record);

    List<MamaReward> selectByExample(MamaRewardQueryHelper example);

    MamaReward selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MamaReward record, @Param("example") MamaRewardQueryHelper example);

    int updateByExample(@Param("record") MamaReward record, @Param("example") MamaRewardQueryHelper example);

    int updateByPrimaryKeySelective(MamaReward record);

    int updateByPrimaryKey(MamaReward record);

    Integer countMamaReward(@Param("pagesModel") PagesModel<MamaRewardReq, MamaRewardRes> pagesModel, @Param("condition") MamaRewardReq mamaRewardReq);

    List<MamaRewardRes> selectMamaReward(@Param("pagesModel") PagesModel<MamaRewardReq, MamaRewardRes> pagesModel, @Param("condition") MamaRewardReq mamaRewardReq);

    Integer updateMamaRewardsBatch(@Param("map") Map<Long,Integer> map);
}