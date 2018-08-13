package com.jiabian.control.mama;

import com.jiabian.base.PagesModel;
import com.jiabian.base.control.BaseController;
import com.jiabian.mama.IMamaService;
import com.jiabian.mama.request.MamaRewardReq;
import com.jiabian.mama.response.MamaRewardRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mamaReward")
public class MamaRewardController extends BaseController<MamaRewardReq,MamaRewardRes> {

    @Autowired
    private IMamaService iMamaService;

    /**
     * 查询奖励详情
     * @param map
     * @param mamaRewardReq
     */
    @RequestMapping("/rewardList")
    public String getRewardList(ModelMap map, MamaRewardReq mamaRewardReq) {
        PagesModel<MamaRewardReq, MamaRewardRes> pagesModel = new PagesModel<>(mamaRewardReq);
        this.setPagesToModel(pagesModel, mamaRewardReq);
        pagesModel.setOrderBy("id asc");
        iMamaService.selectMamaReward(pagesModel, mamaRewardReq);
        map.put("pagesModel", pagesModel);
        return "mama/reward/select";
    }


}
