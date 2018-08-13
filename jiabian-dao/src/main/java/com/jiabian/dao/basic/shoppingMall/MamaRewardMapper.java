/*
 * MamaRewardMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-08-13 Created
 */
package com.jiabian.dao.basic.shoppingMall;

import com.jiabian.beans.basic.shoppingMall.MamaReward;
import com.jiabian.beans.basic.shoppingMall.MamaRewardQueryHelper;
import java.util.List;
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
}