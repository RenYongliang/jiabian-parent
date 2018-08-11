/*
 * ConfigCar.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2018-07-11 Created
 */
package com.jiabian.beans.basic.dada;

import java.io.Serializable;

/**
 * 
 * 
 * @author 菠萝大象
 * @version 1.0 2018-07-11
 */
public class ConfigCar implements Serializable {

    private Integer id;
    /**
     * 首字母
     */
    private String zm;
    /**
     * 品牌
     */
    private String pinpai;
    /**
     * 品牌id
     */
    private String pinpai_id;
    /**
     * 车标
     */
    private String logo;
    /**
     * 车系
     */
    private String chexi;
    /**
     * 车系id
     */
    private String chexi_id;
    /**
     * 车展示图
     */
    private String img;
    /**
     * 车名
     */
    private String cheming;
    /**
     * 车型id
     */
    private String chexing_id;
    /**
     * 销售状态
     */
    private String type;
    /**
     * 厂商
     */
    private String changjia;
    /**
     * 年款
     */
    private String niankuan;
    /**
     * 更新时间
     */
    private String gengxin_time;
    /**
     * 上市时间
     */
    private String shangshi_time;
    /**
     * 厂商指导价
     */
    private String zhidaojia;
    /**
     * 级别
     */
    private String jibie;
    /**
     * 发动机
     */
    private String fadongji;
    /**
     * 变速箱
     */
    private String biansuxiang;
    /**
     * 长宽高
     */
    private String changkuanggao;
    /**
     * 车身结构
     */
    private String jiegou;
    /**
     * 最高车速
     */
    private String zuigaochesu;
    /**
     * 官方百米加速
     */
    private String guangfang_jiasu;
    /**
     * 实测百米加速
     */
    private String shice__jiasu;
    /**
     * 实测百米制动
     */
    private String zhidong;
    /**
     * 实测离地间隙
     */
    private String lidijianxi;
    /**
     * 工信部综合油耗
     */
    private String zonghe_youhao;
    /**
     * 实测油耗
     */
    private String shice__youhao;
    /**
     * 整车质保
     */
    private String baozhiqi;
    /**
     * 长度
     */
    private String changdu;
    /**
     * 宽度
     */
    private String kuandu;
    private String gaodu;
    /**
     * 轴距
     */
    private String zhoujv;
    /**
     * 前轮距
     */
    private String qianlun_jv;
    /**
     * 后轮距
     */
    private String houlun_jv;
    /**
     * 最小离地间隙
     */
    private String lidi_jianxi;
    /**
     * 车门数
     */
    private String chemenshu;
    /**
     * 座位数
     */
    private String zuoweishu;
    /**
     * 油箱容积
     */
    private String youxiang;
    /**
     * 行李厢容积
     */
    private String houbeixiang;
    /**
     * 后排车门开启方式
     */
    private String houmenkaiqi;
    /**
     * 货箱尺寸
     */
    private String huoxiangchichun;
    /**
     * 整备质量
     */
    private String zhengbeizhiliang;
    /**
     * 发动机型号
     */
    private String fadongjiaxinghao;
    /**
     * 排量
     */
    private String pailiang;
    /**
     * 进气形式
     */
    private String jinqixiangshi;
    /**
     * 气缸排列形式
     */
    private String qigangpailiexingshi;
    /**
     * 气缸数
     */
    private String qigang;
    /**
     * 每缸气门数
     */
    private String meigangqimenshu;
    /**
     * 压缩比
     */
    private String yasuobi;
    /**
     * 配气机构
     */
    private String peiqijigou;
    /**
     * 缸径
     */
    private String gangjing;
    /**
     * 行程
     */
    private String xingcheng;
    /**
     * 最大马力
     */
    private String zuida_mali;
    /**
     * 最大功率
     */
    private String zuida_gonglv;
    /**
     * 最大功率转速
     */
    private String zuida_zhuansu;
    /**
     * 最大扭矩
     */
    private String zuida_niujv;
    /**
     * 最大扭矩转速
     */
    private String zuida_nuijvzhuansu;
    /**
     * 发动机特有技术
     */
    private String teyoujishhu;
    /**
     * 燃料形式
     */
    private String ranliaoxingshi;
    /**
     * 燃油标号
     */
    private String ranyoubiaohao;
    /**
     * 供油方式
     */
    private String gongyoufangshi;
    /**
     * 缸盖材料
     */
    private String ganggaicailiao;
    /**
     * 缸体材料
     */
    private String gangticailiao;
    /**
     * 环保标准
     */
    private String huanbaobiaozhuan;
    /**
     * 电机类型
     */
    private String dianjia_leixing;
    /**
     * 电动机总功率
     */
    private String dainji_zongguonglv;
    /**
     * 电动机总扭矩
     */
    private String dianji_zongniujv;
    /**
     * 前电动机最大功率
     */
    private String qiandainji_zuidadonglv;
    /**
     * 前电动机最大扭矩
     */
    private String qiandainji_zuidaniujv;
    /**
     * 后电动机最大功率
     */
    private String houtianji_zuidagonglv;
    /**
     * 后电动机最大扭矩
     */
    private String houdainjia_zuidaniujv;
    /**
     * 系统综合功率
     */
    private String xitong_zonghegonglv;
    /**
     * 系统综合扭矩
     */
    private String xitong_zongheniujv;
    /**
     * 驱动电机数
     */
    private String qvdongdianjishu;
    /**
     * 电机布局
     */
    private String dianjibuqv;
    /**
     * 电池类型
     */
    private String dianchileixing;
    /**
     * 能源类型
     */
    private String nengyuanleixing;
    /**
     * 纯电续航里程
     */
    private String xvhuanglicheng;
    /**
     * 快充电量百分比
     */
    private String baiFenBi;
    /**
     * 工信部续航里程
     */
    private String xvhanglicheng;
    /**
     * 电池容量
     */
    private String dainchirongliang;
    /**
     * 百公里耗电量
     */
    private String youhao;
    /**
     * 快充电量
     */
    private String kuaichnegdainliang;
    /**
     * 充电桩价格
     */
    private String chengdianzhnagjiage;
    /**
     * 挡位个数
     */
    private String dangweishu;
    /**
     * 变速箱类型
     */
    private String biansuxiangleixing;
    /**
     * 简称
     */
    private String jiancheng;
    /**
     * 驱动方式
     */
    private String qvdongfangshi;
    /**
     * 前悬架类型
     */
    private String qianxuan_jialeixing;
    /**
     * 后悬架类型
     */
    private String houxuan_jialeixing;
    /**
     * 助力类型
     */
    private String zhulileixing;
    /**
     * 车体结构
     */
    private String chetijiegou;
    /**
     * 后制动
     */
    private String houzhidong;
    /**
     * 后制动器类型
     */
    private String houzhidongleixing;
    /**
     * 驻车制动类型
     */
    private String zhuchezhidong;
    /**
     * 前轮胎规格
     */
    private String qianluantai;
    /**
     * 后轮胎规格
     */
    private String houluantai;
    /**
     * 备胎规格
     */
    private String beitai;
    /**
     * 主副驾驶座安全气囊
     */
    private String zhufuqilang;
    /**
     * 前后排侧气囊
     */
    private String cepaiqinang;
    /**
     * 前后排头部气囊
     */
    private String toubuqinang;
    /**
     * 膝部气囊
     */
    private String xibuqinang;
    /**
     * 胎压监测装置
     */
    private String taiyajiance;
    /**
     * 零胎压继续行驶
     */
    private String liangtaiya;
    /**
     * 安全带未系提示
     */
    private String anquandaitishi;
    /**
     * ISOFIX儿童座椅接口
     */
    private String ISOFIX;
    /**
     * ABS防抱死
     */
    private String ABS;
    /**
     * 制动力分配
     */
    private String zhidongfanpei;
    /**
     * 刹车辅助
     */
    private String shachefuzhu;
    /**
     * 牵引力控制
     */
    private String qianyinlikongzhi;
    /**
     * 车身稳定控制
     */
    private String cheshenwendingkongzhi;
    /**
     * 并线辅助
     */
    private String bingxianfuzhu;
    /**
     * 车道偏离预警系统
     */
    private String pianliyvjing;
    /**
     * 主动刹车主动安全系统
     */
    private String zhudongshanchu;
    /**
     * 夜视系统
     */
    private String yieshixitong;
    /**
     * 疲劳驾驶提示
     */
    private String pilaojiashi;
    /**
     * 前后驻车雷达
     */
    private String zhuchelieda;
    /**
     * 后制动器类型
     */
    private String daocheyangxiang;
    /**
     * 全景摄像头
     */
    private String quanqingshexaingtoou;
    /**
     * 定速巡航
     */
    private String dingsuxunhang;
    /**
     * 自适应巡航
     */
    private String zishiyingyunhang;
    /**
     * 自动泊车入位
     */
    private String zidongbuoche;
    /**
     * 发动机启停技术
     */
    private String fadongjizhanting;
    /**
     * 自动驾驶技术
     */
    private String zhidongjiashi;
    /**
     * 上坡辅助
     */
    private String shangbuofuzhu;
    /**
     * 自动驻车
     */
    private String zhidongzhuche;
    /**
     * 陡坡缓降
     */
    private String doupohuanjiang;
    /**
     * 可变悬架
     */
    private String kebianxuanjia;
    /**
     * 空气悬架
     */
    private String kongqixuanjia;
    /**
     * 电磁感应悬架
     */
    private String dainceganyingxuanjia;
    /**
     * 可变转向比
     */
    private String kebianzhuanxiangbi;
    /**
     * 电动天窗
     */
    private String diandongtianchuang;
    /**
     * 全景天窗
     */
    private String quanjingtianchuang;
    /**
     * 运动外观套件
     */
    private String yundongwaiguan;
    /**
     * 铝合金轮圈
     */
    private String luhejinlunquan;
    /**
     * 电动吸合门
     */
    private String daindongxihemen;
    /**
     * 侧滑门
     */
    private String cehuamen;
    /**
     * 电动后备厢
     */
    private String diandonghuobeixiang;
    /**
     * 感应后备厢
     */
    private String ganyinghoubeixing;
    /**
     * 车顶行李架
     */
    private String chedingxinglijia;
    /**
     * 发动机电子防盗
     */
    private String fadongjiadianzifangdao;
    /**
     * 车内中控锁
     */
    private String chenenzhongkongsuo;
    /**
     * 遥控钥匙
     */
    private String yaokongyaoshi;
    /**
     * 无钥匙启动系统
     */
    private String wuyaoshiqidongxitong;
    /**
     * 无钥匙进入系统
     */
    private String wuyaoshijinruxitong;
    /**
     * 远程启动
     */
    private String yuanchengqidong;
    /**
     * 皮质方向盘
     */
    private String pizhifangxiangpan;
    /**
     * 方向盘调节
     */
    private String fangxiangpantiaojieqi;
    /**
     * 方向盘电动调节
     */
    private String fangxiangpandiandongtiaojie;
    /**
     * 多功能方向盘
     */
    private String duogongnnegfangxiangpan;
    /**
     * 方向盘换挡
     */
    private String fxp_huandang;
    /**
     * 方向盘加热
     */
    private String fxp_jiare;
    /**
     * 方向盘记忆
     */
    private String fxp_jiyi;
    /**
     * 行车电脑显示屏
     */
    private String dainnaoxianshiping;
    /**
     * 全液晶仪表盘
     */
    private String yiejingyibiaopan;
    /**
     * HUD抬头数字显示
     */
    private String HUD;
    /**
     * 内置行车记录仪
     */
    private String nenzhixingchejiluyi;
    /**
     * 主动降噪
     */
    private String zhudongjiangzao;
    /**
     * 手机无线充电
     */
    private String shoujiwuxianchengdian;
    /**
     * 座椅材质
     */
    private String zuoyicaizhi;
    /**
     * 运动风格座椅
     */
    private String yongdongfenggezuoyi;
    /**
     * 座椅高低调节
     */
    private String zuoyigaoditiaojie;
    /**
     * 腰部支撑调节
     */
    private String yaobuzhichengtiaojie;
    /**
     * 肩部支撑调节
     */
    private String jianbuzhichengtiaojie;
    /**
     * 主副驾驶座电动调节
     */
    private String diandongzuoyitiaojie;
    /**
     * 第二排靠背角度调节
     */
    private String jiaodutiaojie;
    /**
     * 第二排座椅移动
     */
    private String dierpaizuoyiyidong;
    /**
     * 后排座椅电动调节
     */
    private String houpaizuoyidiandongtiaojie;
    /**
     * 副驾驶位后排可调节按钮
     */
    private String fujiashiketiaojie;
    /**
     * 电动座椅记忆
     */
    private String diandongzuoyijiyi;
    /**
     * 前后排座椅加热
     */
    private String qianhoupaizuoyijiare;
    /**
     * 前后排座椅通风
     */
    private String qianhoupaizuoyidongfeng;
    /**
     * 前后排座椅按摩
     */
    private String qianhoupaizuoyianmo;
    /**
     * 第二排独立座椅
     */
    private String dierpaidulizuoyi;
    /**
     * 第三排座椅
     */
    private String disanpaizuoyi;
    /**
     * 后排座椅放倒方式
     */
    private String houpaizuoyifabfshi;
    /**
     * 前后中央扶手
     */
    private String qianhouzhongyangfushou;
    /**
     * 后排杯架
     */
    private String houpaibeijia;
    /**
     * 可加热制冷杯架
     */
    private String jiarezhilingbeijia;
    /**
     * GPS导航系统
     */
    private String GPS;
    /**
     * 定位互动服务
     */
    private String dingweihudongfuwu;
    /**
     * 中控台彩色大屏
     */
    private String zhongkongtai_daping;
    /**
     * 中控台彩色大屏尺寸
     */
    private String zhongkongtai_dapingchicun;
    /**
     * 中控液晶屏分屏显示
     */
    private String zhongkongtai_xianshi;
    /**
     * 蓝牙车载电话
     */
    private String lanyachezaidianhu;
    /**
     * 手机互联映射
     */
    private String shoujihulianyingshe;
    /**
     * 车联网
     */
    private String chelianwang;
    /**
     * 车载电视
     */
    private String chezaidianshi;
    /**
     * 后排液晶屏
     */
    private String houpaiyiejingping;
    /**
     * 电源
     */
    private String dianyuan;
    /**
     * 外接音源接口
     */
    private String waijieyinwuanjiekou;
    /**
     * CDDVD
     */
    private String CDDVD;
    /**
     * 扬声器品牌
     */
    private String yinxhangpinpai;
    /**
     * 扬声器数量
     */
    private String yinxiangshuliang;
    /**
     * 近光灯
     */
    private String jinguangdeng;
    /**
     * 远光灯
     */
    private String yuanguangdeng;
    /**
     * LED日间行车灯
     */
    private String LED;
    /**
     * 自适应远近光
     */
    private String zishiyingyuanjinguang;
    /**
     * 自动头灯
     */
    private String zidongtoudeng;
    /**
     * 转向辅助灯
     */
    private String zuangxhangfuzhudeng;
    /**
     * 转向头灯
     */
    private String zhuangxhangdeng;
    /**
     * 前雾灯
     */
    private String qianweding;
    /**
     * 大灯高度可调
     */
    private String dadenggaodutijie;
    /**
     * 大灯清洗装置
     */
    private String dadengqingxizhuangzhi;
    /**
     * 车内氛围灯
     */
    private String chennengfenweideng;
    /**
     * 前后电动车窗
     */
    private String diandongchechaung;
    /**
     * 车窗一键升降
     */
    private String yijiangshangjiang;
    /**
     * 车窗防夹手功能
     */
    private String fangjiashou;
    /**
     * 防紫外线隔热玻璃
     */
    private String gereboli;
    /**
     * 后视镜电动调节
     */
    private String houshijingdiandongtiaojie;
    /**
     * 后视镜加热
     */
    private String houshijingjiare;
    /**
     * 内外后视镜自动防眩目
     */
    private String nenwaihoushijingfangxuanyun;
    /**
     * 流媒体车内后视镜
     */
    private String jiumeitichenenghoushijing;
    /**
     * 后视镜电动折叠
     */
    private String houshijingdiandongzhedie;
    /**
     * 后视镜记忆
     */
    private String houshijiangjiyi;
    /**
     * 后风挡遮阳帘
     */
    private String zheyanglian;
    /**
     * 后排侧遮阳帘
     */
    private String houpaizheyanglian;
    /**
     * 后排侧隐私玻璃
     */
    private String houpaiyinsiboli;
    /**
     * 遮阳板化妆镜
     */
    private String zheyangbanhuangzhuangjing;
    /**
     * 后雨刷
     */
    private String houyvshua;
    /**
     * 感应雨刷
     */
    private String ganyingyvshu;
    /**
     * 空调控制方式
     */
    private String kongtiaokongzhifangshi;
    /**
     * 后排独立空调
     */
    private String houpaidulikongtiao;
    /**
     * 后座出风口
     */
    private String houpaichufengkou;
    /**
     * 温度分区控制
     */
    private String wendufenqvkongzhi;
    /**
     * 车内空气调节花粉过滤
     */
    private String huafenguolv;
    /**
     * 车载空气净化器
     */
    private String chezaijinghuaqi;
    /**
     * 车载冰箱
     */
    private String chezaibingxiang;
    /**
     * 外观颜色
     */
    private String waiguanyanse;
    /**
     * 内饰颜色
     */
    private String neshiyansi;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getZm() {
        return zm;
    }
    public void setZm(String zm) {
        this.zm = zm == null ? null : zm.trim();
    }
    public String getPinpai() {
        return pinpai;
    }
    public void setPinpai(String pinpai) {
        this.pinpai = pinpai == null ? null : pinpai.trim();
    }
    public String getPinpai_id() {
        return pinpai_id;
    }
    public void setPinpai_id(String pinpai_id) {
        this.pinpai_id = pinpai_id == null ? null : pinpai_id.trim();
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
    public String getChexi() {
        return chexi;
    }
    public void setChexi(String chexi) {
        this.chexi = chexi == null ? null : chexi.trim();
    }
    public String getChexi_id() {
        return chexi_id;
    }
    public void setChexi_id(String chexi_id) {
        this.chexi_id = chexi_id == null ? null : chexi_id.trim();
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
    public String getCheming() {
        return cheming;
    }
    public void setCheming(String cheming) {
        this.cheming = cheming == null ? null : cheming.trim();
    }
    public String getChexing_id() {
        return chexing_id;
    }
    public void setChexing_id(String chexing_id) {
        this.chexing_id = chexing_id == null ? null : chexing_id.trim();
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
    public String getChangjia() {
        return changjia;
    }
    public void setChangjia(String changjia) {
        this.changjia = changjia == null ? null : changjia.trim();
    }
    public String getNiankuan() {
        return niankuan;
    }
    public void setNiankuan(String niankuan) {
        this.niankuan = niankuan == null ? null : niankuan.trim();
    }
    public String getGengxin_time() {
        return gengxin_time;
    }
    public void setGengxin_time(String gengxin_time) {
        this.gengxin_time = gengxin_time == null ? null : gengxin_time.trim();
    }
    public String getShangshi_time() {
        return shangshi_time;
    }
    public void setShangshi_time(String shangshi_time) {
        this.shangshi_time = shangshi_time == null ? null : shangshi_time.trim();
    }
    public String getZhidaojia() {
        return zhidaojia;
    }
    public void setZhidaojia(String zhidaojia) {
        this.zhidaojia = zhidaojia == null ? null : zhidaojia.trim();
    }
    public String getJibie() {
        return jibie;
    }
    public void setJibie(String jibie) {
        this.jibie = jibie == null ? null : jibie.trim();
    }
    public String getFadongji() {
        return fadongji;
    }
    public void setFadongji(String fadongji) {
        this.fadongji = fadongji == null ? null : fadongji.trim();
    }
    public String getBiansuxiang() {
        return biansuxiang;
    }
    public void setBiansuxiang(String biansuxiang) {
        this.biansuxiang = biansuxiang == null ? null : biansuxiang.trim();
    }
    public String getChangkuanggao() {
        return changkuanggao;
    }
    public void setChangkuanggao(String changkuanggao) {
        this.changkuanggao = changkuanggao == null ? null : changkuanggao.trim();
    }
    public String getJiegou() {
        return jiegou;
    }
    public void setJiegou(String jiegou) {
        this.jiegou = jiegou == null ? null : jiegou.trim();
    }
    public String getZuigaochesu() {
        return zuigaochesu;
    }
    public void setZuigaochesu(String zuigaochesu) {
        this.zuigaochesu = zuigaochesu == null ? null : zuigaochesu.trim();
    }
    public String getGuangfang_jiasu() {
        return guangfang_jiasu;
    }
    public void setGuangfang_jiasu(String guangfang_jiasu) {
        this.guangfang_jiasu = guangfang_jiasu == null ? null : guangfang_jiasu.trim();
    }
    public String getShice__jiasu() {
        return shice__jiasu;
    }
    public void setShice__jiasu(String shice__jiasu) {
        this.shice__jiasu = shice__jiasu == null ? null : shice__jiasu.trim();
    }
    public String getZhidong() {
        return zhidong;
    }
    public void setZhidong(String zhidong) {
        this.zhidong = zhidong == null ? null : zhidong.trim();
    }
    public String getLidijianxi() {
        return lidijianxi;
    }
    public void setLidijianxi(String lidijianxi) {
        this.lidijianxi = lidijianxi == null ? null : lidijianxi.trim();
    }
    public String getZonghe_youhao() {
        return zonghe_youhao;
    }
    public void setZonghe_youhao(String zonghe_youhao) {
        this.zonghe_youhao = zonghe_youhao == null ? null : zonghe_youhao.trim();
    }
    public String getShice__youhao() {
        return shice__youhao;
    }
    public void setShice__youhao(String shice__youhao) {
        this.shice__youhao = shice__youhao == null ? null : shice__youhao.trim();
    }
    public String getBaozhiqi() {
        return baozhiqi;
    }
    public void setBaozhiqi(String baozhiqi) {
        this.baozhiqi = baozhiqi == null ? null : baozhiqi.trim();
    }
    public String getChangdu() {
        return changdu;
    }
    public void setChangdu(String changdu) {
        this.changdu = changdu == null ? null : changdu.trim();
    }
    public String getKuandu() {
        return kuandu;
    }
    public void setKuandu(String kuandu) {
        this.kuandu = kuandu == null ? null : kuandu.trim();
    }
    public String getGaodu() {
        return gaodu;
    }
    public void setGaodu(String gaodu) {
        this.gaodu = gaodu == null ? null : gaodu.trim();
    }
    public String getZhoujv() {
        return zhoujv;
    }
    public void setZhoujv(String zhoujv) {
        this.zhoujv = zhoujv == null ? null : zhoujv.trim();
    }
    public String getQianlun_jv() {
        return qianlun_jv;
    }
    public void setQianlun_jv(String qianlun_jv) {
        this.qianlun_jv = qianlun_jv == null ? null : qianlun_jv.trim();
    }
    public String getHoulun_jv() {
        return houlun_jv;
    }
    public void setHoulun_jv(String houlun_jv) {
        this.houlun_jv = houlun_jv == null ? null : houlun_jv.trim();
    }
    public String getLidi_jianxi() {
        return lidi_jianxi;
    }
    public void setLidi_jianxi(String lidi_jianxi) {
        this.lidi_jianxi = lidi_jianxi == null ? null : lidi_jianxi.trim();
    }
    public String getChemenshu() {
        return chemenshu;
    }
    public void setChemenshu(String chemenshu) {
        this.chemenshu = chemenshu == null ? null : chemenshu.trim();
    }
    public String getZuoweishu() {
        return zuoweishu;
    }
    public void setZuoweishu(String zuoweishu) {
        this.zuoweishu = zuoweishu == null ? null : zuoweishu.trim();
    }
    public String getYouxiang() {
        return youxiang;
    }
    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang == null ? null : youxiang.trim();
    }
    public String getHoubeixiang() {
        return houbeixiang;
    }
    public void setHoubeixiang(String houbeixiang) {
        this.houbeixiang = houbeixiang == null ? null : houbeixiang.trim();
    }
    public String getHoumenkaiqi() {
        return houmenkaiqi;
    }
    public void setHoumenkaiqi(String houmenkaiqi) {
        this.houmenkaiqi = houmenkaiqi == null ? null : houmenkaiqi.trim();
    }
    public String getHuoxiangchichun() {
        return huoxiangchichun;
    }
    public void setHuoxiangchichun(String huoxiangchichun) {
        this.huoxiangchichun = huoxiangchichun == null ? null : huoxiangchichun.trim();
    }
    public String getZhengbeizhiliang() {
        return zhengbeizhiliang;
    }
    public void setZhengbeizhiliang(String zhengbeizhiliang) {
        this.zhengbeizhiliang = zhengbeizhiliang == null ? null : zhengbeizhiliang.trim();
    }
    public String getFadongjiaxinghao() {
        return fadongjiaxinghao;
    }
    public void setFadongjiaxinghao(String fadongjiaxinghao) {
        this.fadongjiaxinghao = fadongjiaxinghao == null ? null : fadongjiaxinghao.trim();
    }
    public String getPailiang() {
        return pailiang;
    }
    public void setPailiang(String pailiang) {
        this.pailiang = pailiang == null ? null : pailiang.trim();
    }
    public String getJinqixiangshi() {
        return jinqixiangshi;
    }
    public void setJinqixiangshi(String jinqixiangshi) {
        this.jinqixiangshi = jinqixiangshi == null ? null : jinqixiangshi.trim();
    }
    public String getQigangpailiexingshi() {
        return qigangpailiexingshi;
    }
    public void setQigangpailiexingshi(String qigangpailiexingshi) {
        this.qigangpailiexingshi = qigangpailiexingshi == null ? null : qigangpailiexingshi.trim();
    }
    public String getQigang() {
        return qigang;
    }
    public void setQigang(String qigang) {
        this.qigang = qigang == null ? null : qigang.trim();
    }
    public String getMeigangqimenshu() {
        return meigangqimenshu;
    }
    public void setMeigangqimenshu(String meigangqimenshu) {
        this.meigangqimenshu = meigangqimenshu == null ? null : meigangqimenshu.trim();
    }
    public String getYasuobi() {
        return yasuobi;
    }
    public void setYasuobi(String yasuobi) {
        this.yasuobi = yasuobi == null ? null : yasuobi.trim();
    }
    public String getPeiqijigou() {
        return peiqijigou;
    }
    public void setPeiqijigou(String peiqijigou) {
        this.peiqijigou = peiqijigou == null ? null : peiqijigou.trim();
    }
    public String getGangjing() {
        return gangjing;
    }
    public void setGangjing(String gangjing) {
        this.gangjing = gangjing == null ? null : gangjing.trim();
    }
    public String getXingcheng() {
        return xingcheng;
    }
    public void setXingcheng(String xingcheng) {
        this.xingcheng = xingcheng == null ? null : xingcheng.trim();
    }
    public String getZuida_mali() {
        return zuida_mali;
    }
    public void setZuida_mali(String zuida_mali) {
        this.zuida_mali = zuida_mali == null ? null : zuida_mali.trim();
    }
    public String getZuida_gonglv() {
        return zuida_gonglv;
    }
    public void setZuida_gonglv(String zuida_gonglv) {
        this.zuida_gonglv = zuida_gonglv == null ? null : zuida_gonglv.trim();
    }
    public String getZuida_zhuansu() {
        return zuida_zhuansu;
    }
    public void setZuida_zhuansu(String zuida_zhuansu) {
        this.zuida_zhuansu = zuida_zhuansu == null ? null : zuida_zhuansu.trim();
    }
    public String getZuida_niujv() {
        return zuida_niujv;
    }
    public void setZuida_niujv(String zuida_niujv) {
        this.zuida_niujv = zuida_niujv == null ? null : zuida_niujv.trim();
    }
    public String getZuida_nuijvzhuansu() {
        return zuida_nuijvzhuansu;
    }
    public void setZuida_nuijvzhuansu(String zuida_nuijvzhuansu) {
        this.zuida_nuijvzhuansu = zuida_nuijvzhuansu == null ? null : zuida_nuijvzhuansu.trim();
    }
    public String getTeyoujishhu() {
        return teyoujishhu;
    }
    public void setTeyoujishhu(String teyoujishhu) {
        this.teyoujishhu = teyoujishhu == null ? null : teyoujishhu.trim();
    }
    public String getRanliaoxingshi() {
        return ranliaoxingshi;
    }
    public void setRanliaoxingshi(String ranliaoxingshi) {
        this.ranliaoxingshi = ranliaoxingshi == null ? null : ranliaoxingshi.trim();
    }
    public String getRanyoubiaohao() {
        return ranyoubiaohao;
    }
    public void setRanyoubiaohao(String ranyoubiaohao) {
        this.ranyoubiaohao = ranyoubiaohao == null ? null : ranyoubiaohao.trim();
    }
    public String getGongyoufangshi() {
        return gongyoufangshi;
    }
    public void setGongyoufangshi(String gongyoufangshi) {
        this.gongyoufangshi = gongyoufangshi == null ? null : gongyoufangshi.trim();
    }
    public String getGanggaicailiao() {
        return ganggaicailiao;
    }
    public void setGanggaicailiao(String ganggaicailiao) {
        this.ganggaicailiao = ganggaicailiao == null ? null : ganggaicailiao.trim();
    }
    public String getGangticailiao() {
        return gangticailiao;
    }
    public void setGangticailiao(String gangticailiao) {
        this.gangticailiao = gangticailiao == null ? null : gangticailiao.trim();
    }
    public String getHuanbaobiaozhuan() {
        return huanbaobiaozhuan;
    }
    public void setHuanbaobiaozhuan(String huanbaobiaozhuan) {
        this.huanbaobiaozhuan = huanbaobiaozhuan == null ? null : huanbaobiaozhuan.trim();
    }
    public String getDianjia_leixing() {
        return dianjia_leixing;
    }
    public void setDianjia_leixing(String dianjia_leixing) {
        this.dianjia_leixing = dianjia_leixing == null ? null : dianjia_leixing.trim();
    }
    public String getDainji_zongguonglv() {
        return dainji_zongguonglv;
    }
    public void setDainji_zongguonglv(String dainji_zongguonglv) {
        this.dainji_zongguonglv = dainji_zongguonglv == null ? null : dainji_zongguonglv.trim();
    }
    public String getDianji_zongniujv() {
        return dianji_zongniujv;
    }
    public void setDianji_zongniujv(String dianji_zongniujv) {
        this.dianji_zongniujv = dianji_zongniujv == null ? null : dianji_zongniujv.trim();
    }
    public String getQiandainji_zuidadonglv() {
        return qiandainji_zuidadonglv;
    }
    public void setQiandainji_zuidadonglv(String qiandainji_zuidadonglv) {
        this.qiandainji_zuidadonglv = qiandainji_zuidadonglv == null ? null : qiandainji_zuidadonglv.trim();
    }
    public String getQiandainji_zuidaniujv() {
        return qiandainji_zuidaniujv;
    }
    public void setQiandainji_zuidaniujv(String qiandainji_zuidaniujv) {
        this.qiandainji_zuidaniujv = qiandainji_zuidaniujv == null ? null : qiandainji_zuidaniujv.trim();
    }
    public String getHoutianji_zuidagonglv() {
        return houtianji_zuidagonglv;
    }
    public void setHoutianji_zuidagonglv(String houtianji_zuidagonglv) {
        this.houtianji_zuidagonglv = houtianji_zuidagonglv == null ? null : houtianji_zuidagonglv.trim();
    }
    public String getHoudainjia_zuidaniujv() {
        return houdainjia_zuidaniujv;
    }
    public void setHoudainjia_zuidaniujv(String houdainjia_zuidaniujv) {
        this.houdainjia_zuidaniujv = houdainjia_zuidaniujv == null ? null : houdainjia_zuidaniujv.trim();
    }
    public String getXitong_zonghegonglv() {
        return xitong_zonghegonglv;
    }
    public void setXitong_zonghegonglv(String xitong_zonghegonglv) {
        this.xitong_zonghegonglv = xitong_zonghegonglv == null ? null : xitong_zonghegonglv.trim();
    }
    public String getXitong_zongheniujv() {
        return xitong_zongheniujv;
    }
    public void setXitong_zongheniujv(String xitong_zongheniujv) {
        this.xitong_zongheniujv = xitong_zongheniujv == null ? null : xitong_zongheniujv.trim();
    }
    public String getQvdongdianjishu() {
        return qvdongdianjishu;
    }
    public void setQvdongdianjishu(String qvdongdianjishu) {
        this.qvdongdianjishu = qvdongdianjishu == null ? null : qvdongdianjishu.trim();
    }
    public String getDianjibuqv() {
        return dianjibuqv;
    }
    public void setDianjibuqv(String dianjibuqv) {
        this.dianjibuqv = dianjibuqv == null ? null : dianjibuqv.trim();
    }
    public String getDianchileixing() {
        return dianchileixing;
    }
    public void setDianchileixing(String dianchileixing) {
        this.dianchileixing = dianchileixing == null ? null : dianchileixing.trim();
    }
    public String getNengyuanleixing() {
        return nengyuanleixing;
    }
    public void setNengyuanleixing(String nengyuanleixing) {
        this.nengyuanleixing = nengyuanleixing == null ? null : nengyuanleixing.trim();
    }
    public String getXvhuanglicheng() {
        return xvhuanglicheng;
    }
    public void setXvhuanglicheng(String xvhuanglicheng) {
        this.xvhuanglicheng = xvhuanglicheng == null ? null : xvhuanglicheng.trim();
    }
    public String getBaiFenBi() {
        return baiFenBi;
    }
    public void setBaiFenBi(String baiFenBi) {
        this.baiFenBi = baiFenBi == null ? null : baiFenBi.trim();
    }
    public String getXvhanglicheng() {
        return xvhanglicheng;
    }
    public void setXvhanglicheng(String xvhanglicheng) {
        this.xvhanglicheng = xvhanglicheng == null ? null : xvhanglicheng.trim();
    }
    public String getDainchirongliang() {
        return dainchirongliang;
    }
    public void setDainchirongliang(String dainchirongliang) {
        this.dainchirongliang = dainchirongliang == null ? null : dainchirongliang.trim();
    }
    public String getYouhao() {
        return youhao;
    }
    public void setYouhao(String youhao) {
        this.youhao = youhao == null ? null : youhao.trim();
    }
    public String getKuaichnegdainliang() {
        return kuaichnegdainliang;
    }
    public void setKuaichnegdainliang(String kuaichnegdainliang) {
        this.kuaichnegdainliang = kuaichnegdainliang == null ? null : kuaichnegdainliang.trim();
    }
    public String getChengdianzhnagjiage() {
        return chengdianzhnagjiage;
    }
    public void setChengdianzhnagjiage(String chengdianzhnagjiage) {
        this.chengdianzhnagjiage = chengdianzhnagjiage == null ? null : chengdianzhnagjiage.trim();
    }
    public String getDangweishu() {
        return dangweishu;
    }
    public void setDangweishu(String dangweishu) {
        this.dangweishu = dangweishu == null ? null : dangweishu.trim();
    }
    public String getBiansuxiangleixing() {
        return biansuxiangleixing;
    }
    public void setBiansuxiangleixing(String biansuxiangleixing) {
        this.biansuxiangleixing = biansuxiangleixing == null ? null : biansuxiangleixing.trim();
    }
    public String getJiancheng() {
        return jiancheng;
    }
    public void setJiancheng(String jiancheng) {
        this.jiancheng = jiancheng == null ? null : jiancheng.trim();
    }
    public String getQvdongfangshi() {
        return qvdongfangshi;
    }
    public void setQvdongfangshi(String qvdongfangshi) {
        this.qvdongfangshi = qvdongfangshi == null ? null : qvdongfangshi.trim();
    }
    public String getQianxuan_jialeixing() {
        return qianxuan_jialeixing;
    }
    public void setQianxuan_jialeixing(String qianxuan_jialeixing) {
        this.qianxuan_jialeixing = qianxuan_jialeixing == null ? null : qianxuan_jialeixing.trim();
    }
    public String getHouxuan_jialeixing() {
        return houxuan_jialeixing;
    }
    public void setHouxuan_jialeixing(String houxuan_jialeixing) {
        this.houxuan_jialeixing = houxuan_jialeixing == null ? null : houxuan_jialeixing.trim();
    }
    public String getZhulileixing() {
        return zhulileixing;
    }
    public void setZhulileixing(String zhulileixing) {
        this.zhulileixing = zhulileixing == null ? null : zhulileixing.trim();
    }
    public String getChetijiegou() {
        return chetijiegou;
    }
    public void setChetijiegou(String chetijiegou) {
        this.chetijiegou = chetijiegou == null ? null : chetijiegou.trim();
    }
    public String getHouzhidong() {
        return houzhidong;
    }
    public void setHouzhidong(String houzhidong) {
        this.houzhidong = houzhidong == null ? null : houzhidong.trim();
    }
    public String getHouzhidongleixing() {
        return houzhidongleixing;
    }
    public void setHouzhidongleixing(String houzhidongleixing) {
        this.houzhidongleixing = houzhidongleixing == null ? null : houzhidongleixing.trim();
    }
    public String getZhuchezhidong() {
        return zhuchezhidong;
    }
    public void setZhuchezhidong(String zhuchezhidong) {
        this.zhuchezhidong = zhuchezhidong == null ? null : zhuchezhidong.trim();
    }
    public String getQianluantai() {
        return qianluantai;
    }
    public void setQianluantai(String qianluantai) {
        this.qianluantai = qianluantai == null ? null : qianluantai.trim();
    }
    public String getHouluantai() {
        return houluantai;
    }
    public void setHouluantai(String houluantai) {
        this.houluantai = houluantai == null ? null : houluantai.trim();
    }
    public String getBeitai() {
        return beitai;
    }
    public void setBeitai(String beitai) {
        this.beitai = beitai == null ? null : beitai.trim();
    }
    public String getZhufuqilang() {
        return zhufuqilang;
    }
    public void setZhufuqilang(String zhufuqilang) {
        this.zhufuqilang = zhufuqilang == null ? null : zhufuqilang.trim();
    }
    public String getCepaiqinang() {
        return cepaiqinang;
    }
    public void setCepaiqinang(String cepaiqinang) {
        this.cepaiqinang = cepaiqinang == null ? null : cepaiqinang.trim();
    }
    public String getToubuqinang() {
        return toubuqinang;
    }
    public void setToubuqinang(String toubuqinang) {
        this.toubuqinang = toubuqinang == null ? null : toubuqinang.trim();
    }
    public String getXibuqinang() {
        return xibuqinang;
    }
    public void setXibuqinang(String xibuqinang) {
        this.xibuqinang = xibuqinang == null ? null : xibuqinang.trim();
    }
    public String getTaiyajiance() {
        return taiyajiance;
    }
    public void setTaiyajiance(String taiyajiance) {
        this.taiyajiance = taiyajiance == null ? null : taiyajiance.trim();
    }
    public String getLiangtaiya() {
        return liangtaiya;
    }
    public void setLiangtaiya(String liangtaiya) {
        this.liangtaiya = liangtaiya == null ? null : liangtaiya.trim();
    }
    public String getAnquandaitishi() {
        return anquandaitishi;
    }
    public void setAnquandaitishi(String anquandaitishi) {
        this.anquandaitishi = anquandaitishi == null ? null : anquandaitishi.trim();
    }
    public String getISOFIX() {
        return ISOFIX;
    }
    public void setISOFIX(String ISOFIX) {
        this.ISOFIX = ISOFIX == null ? null : ISOFIX.trim();
    }
    public String getABS() {
        return ABS;
    }
    public void setABS(String ABS) {
        this.ABS = ABS == null ? null : ABS.trim();
    }
    public String getZhidongfanpei() {
        return zhidongfanpei;
    }
    public void setZhidongfanpei(String zhidongfanpei) {
        this.zhidongfanpei = zhidongfanpei == null ? null : zhidongfanpei.trim();
    }
    public String getShachefuzhu() {
        return shachefuzhu;
    }
    public void setShachefuzhu(String shachefuzhu) {
        this.shachefuzhu = shachefuzhu == null ? null : shachefuzhu.trim();
    }
    public String getQianyinlikongzhi() {
        return qianyinlikongzhi;
    }
    public void setQianyinlikongzhi(String qianyinlikongzhi) {
        this.qianyinlikongzhi = qianyinlikongzhi == null ? null : qianyinlikongzhi.trim();
    }
    public String getCheshenwendingkongzhi() {
        return cheshenwendingkongzhi;
    }
    public void setCheshenwendingkongzhi(String cheshenwendingkongzhi) {
        this.cheshenwendingkongzhi = cheshenwendingkongzhi == null ? null : cheshenwendingkongzhi.trim();
    }
    public String getBingxianfuzhu() {
        return bingxianfuzhu;
    }
    public void setBingxianfuzhu(String bingxianfuzhu) {
        this.bingxianfuzhu = bingxianfuzhu == null ? null : bingxianfuzhu.trim();
    }
    public String getPianliyvjing() {
        return pianliyvjing;
    }
    public void setPianliyvjing(String pianliyvjing) {
        this.pianliyvjing = pianliyvjing == null ? null : pianliyvjing.trim();
    }
    public String getZhudongshanchu() {
        return zhudongshanchu;
    }
    public void setZhudongshanchu(String zhudongshanchu) {
        this.zhudongshanchu = zhudongshanchu == null ? null : zhudongshanchu.trim();
    }
    public String getYieshixitong() {
        return yieshixitong;
    }
    public void setYieshixitong(String yieshixitong) {
        this.yieshixitong = yieshixitong == null ? null : yieshixitong.trim();
    }
    public String getPilaojiashi() {
        return pilaojiashi;
    }
    public void setPilaojiashi(String pilaojiashi) {
        this.pilaojiashi = pilaojiashi == null ? null : pilaojiashi.trim();
    }
    public String getZhuchelieda() {
        return zhuchelieda;
    }
    public void setZhuchelieda(String zhuchelieda) {
        this.zhuchelieda = zhuchelieda == null ? null : zhuchelieda.trim();
    }
    public String getDaocheyangxiang() {
        return daocheyangxiang;
    }
    public void setDaocheyangxiang(String daocheyangxiang) {
        this.daocheyangxiang = daocheyangxiang == null ? null : daocheyangxiang.trim();
    }
    public String getQuanqingshexaingtoou() {
        return quanqingshexaingtoou;
    }
    public void setQuanqingshexaingtoou(String quanqingshexaingtoou) {
        this.quanqingshexaingtoou = quanqingshexaingtoou == null ? null : quanqingshexaingtoou.trim();
    }
    public String getDingsuxunhang() {
        return dingsuxunhang;
    }
    public void setDingsuxunhang(String dingsuxunhang) {
        this.dingsuxunhang = dingsuxunhang == null ? null : dingsuxunhang.trim();
    }
    public String getZishiyingyunhang() {
        return zishiyingyunhang;
    }
    public void setZishiyingyunhang(String zishiyingyunhang) {
        this.zishiyingyunhang = zishiyingyunhang == null ? null : zishiyingyunhang.trim();
    }
    public String getZidongbuoche() {
        return zidongbuoche;
    }
    public void setZidongbuoche(String zidongbuoche) {
        this.zidongbuoche = zidongbuoche == null ? null : zidongbuoche.trim();
    }
    public String getFadongjizhanting() {
        return fadongjizhanting;
    }
    public void setFadongjizhanting(String fadongjizhanting) {
        this.fadongjizhanting = fadongjizhanting == null ? null : fadongjizhanting.trim();
    }
    public String getZhidongjiashi() {
        return zhidongjiashi;
    }
    public void setZhidongjiashi(String zhidongjiashi) {
        this.zhidongjiashi = zhidongjiashi == null ? null : zhidongjiashi.trim();
    }
    public String getShangbuofuzhu() {
        return shangbuofuzhu;
    }
    public void setShangbuofuzhu(String shangbuofuzhu) {
        this.shangbuofuzhu = shangbuofuzhu == null ? null : shangbuofuzhu.trim();
    }
    public String getZhidongzhuche() {
        return zhidongzhuche;
    }
    public void setZhidongzhuche(String zhidongzhuche) {
        this.zhidongzhuche = zhidongzhuche == null ? null : zhidongzhuche.trim();
    }
    public String getDoupohuanjiang() {
        return doupohuanjiang;
    }
    public void setDoupohuanjiang(String doupohuanjiang) {
        this.doupohuanjiang = doupohuanjiang == null ? null : doupohuanjiang.trim();
    }
    public String getKebianxuanjia() {
        return kebianxuanjia;
    }
    public void setKebianxuanjia(String kebianxuanjia) {
        this.kebianxuanjia = kebianxuanjia == null ? null : kebianxuanjia.trim();
    }
    public String getKongqixuanjia() {
        return kongqixuanjia;
    }
    public void setKongqixuanjia(String kongqixuanjia) {
        this.kongqixuanjia = kongqixuanjia == null ? null : kongqixuanjia.trim();
    }
    public String getDainceganyingxuanjia() {
        return dainceganyingxuanjia;
    }
    public void setDainceganyingxuanjia(String dainceganyingxuanjia) {
        this.dainceganyingxuanjia = dainceganyingxuanjia == null ? null : dainceganyingxuanjia.trim();
    }
    public String getKebianzhuanxiangbi() {
        return kebianzhuanxiangbi;
    }
    public void setKebianzhuanxiangbi(String kebianzhuanxiangbi) {
        this.kebianzhuanxiangbi = kebianzhuanxiangbi == null ? null : kebianzhuanxiangbi.trim();
    }
    public String getDiandongtianchuang() {
        return diandongtianchuang;
    }
    public void setDiandongtianchuang(String diandongtianchuang) {
        this.diandongtianchuang = diandongtianchuang == null ? null : diandongtianchuang.trim();
    }
    public String getQuanjingtianchuang() {
        return quanjingtianchuang;
    }
    public void setQuanjingtianchuang(String quanjingtianchuang) {
        this.quanjingtianchuang = quanjingtianchuang == null ? null : quanjingtianchuang.trim();
    }
    public String getYundongwaiguan() {
        return yundongwaiguan;
    }
    public void setYundongwaiguan(String yundongwaiguan) {
        this.yundongwaiguan = yundongwaiguan == null ? null : yundongwaiguan.trim();
    }
    public String getLuhejinlunquan() {
        return luhejinlunquan;
    }
    public void setLuhejinlunquan(String luhejinlunquan) {
        this.luhejinlunquan = luhejinlunquan == null ? null : luhejinlunquan.trim();
    }
    public String getDaindongxihemen() {
        return daindongxihemen;
    }
    public void setDaindongxihemen(String daindongxihemen) {
        this.daindongxihemen = daindongxihemen == null ? null : daindongxihemen.trim();
    }
    public String getCehuamen() {
        return cehuamen;
    }
    public void setCehuamen(String cehuamen) {
        this.cehuamen = cehuamen == null ? null : cehuamen.trim();
    }
    public String getDiandonghuobeixiang() {
        return diandonghuobeixiang;
    }
    public void setDiandonghuobeixiang(String diandonghuobeixiang) {
        this.diandonghuobeixiang = diandonghuobeixiang == null ? null : diandonghuobeixiang.trim();
    }
    public String getGanyinghoubeixing() {
        return ganyinghoubeixing;
    }
    public void setGanyinghoubeixing(String ganyinghoubeixing) {
        this.ganyinghoubeixing = ganyinghoubeixing == null ? null : ganyinghoubeixing.trim();
    }
    public String getChedingxinglijia() {
        return chedingxinglijia;
    }
    public void setChedingxinglijia(String chedingxinglijia) {
        this.chedingxinglijia = chedingxinglijia == null ? null : chedingxinglijia.trim();
    }
    public String getFadongjiadianzifangdao() {
        return fadongjiadianzifangdao;
    }
    public void setFadongjiadianzifangdao(String fadongjiadianzifangdao) {
        this.fadongjiadianzifangdao = fadongjiadianzifangdao == null ? null : fadongjiadianzifangdao.trim();
    }
    public String getChenenzhongkongsuo() {
        return chenenzhongkongsuo;
    }
    public void setChenenzhongkongsuo(String chenenzhongkongsuo) {
        this.chenenzhongkongsuo = chenenzhongkongsuo == null ? null : chenenzhongkongsuo.trim();
    }
    public String getYaokongyaoshi() {
        return yaokongyaoshi;
    }
    public void setYaokongyaoshi(String yaokongyaoshi) {
        this.yaokongyaoshi = yaokongyaoshi == null ? null : yaokongyaoshi.trim();
    }
    public String getWuyaoshiqidongxitong() {
        return wuyaoshiqidongxitong;
    }
    public void setWuyaoshiqidongxitong(String wuyaoshiqidongxitong) {
        this.wuyaoshiqidongxitong = wuyaoshiqidongxitong == null ? null : wuyaoshiqidongxitong.trim();
    }
    public String getWuyaoshijinruxitong() {
        return wuyaoshijinruxitong;
    }
    public void setWuyaoshijinruxitong(String wuyaoshijinruxitong) {
        this.wuyaoshijinruxitong = wuyaoshijinruxitong == null ? null : wuyaoshijinruxitong.trim();
    }
    public String getYuanchengqidong() {
        return yuanchengqidong;
    }
    public void setYuanchengqidong(String yuanchengqidong) {
        this.yuanchengqidong = yuanchengqidong == null ? null : yuanchengqidong.trim();
    }
    public String getPizhifangxiangpan() {
        return pizhifangxiangpan;
    }
    public void setPizhifangxiangpan(String pizhifangxiangpan) {
        this.pizhifangxiangpan = pizhifangxiangpan == null ? null : pizhifangxiangpan.trim();
    }
    public String getFangxiangpantiaojieqi() {
        return fangxiangpantiaojieqi;
    }
    public void setFangxiangpantiaojieqi(String fangxiangpantiaojieqi) {
        this.fangxiangpantiaojieqi = fangxiangpantiaojieqi == null ? null : fangxiangpantiaojieqi.trim();
    }
    public String getFangxiangpandiandongtiaojie() {
        return fangxiangpandiandongtiaojie;
    }
    public void setFangxiangpandiandongtiaojie(String fangxiangpandiandongtiaojie) {
        this.fangxiangpandiandongtiaojie = fangxiangpandiandongtiaojie == null ? null : fangxiangpandiandongtiaojie.trim();
    }
    public String getDuogongnnegfangxiangpan() {
        return duogongnnegfangxiangpan;
    }
    public void setDuogongnnegfangxiangpan(String duogongnnegfangxiangpan) {
        this.duogongnnegfangxiangpan = duogongnnegfangxiangpan == null ? null : duogongnnegfangxiangpan.trim();
    }
    public String getFxp_huandang() {
        return fxp_huandang;
    }
    public void setFxp_huandang(String fxp_huandang) {
        this.fxp_huandang = fxp_huandang == null ? null : fxp_huandang.trim();
    }
    public String getFxp_jiare() {
        return fxp_jiare;
    }
    public void setFxp_jiare(String fxp_jiare) {
        this.fxp_jiare = fxp_jiare == null ? null : fxp_jiare.trim();
    }
    public String getFxp_jiyi() {
        return fxp_jiyi;
    }
    public void setFxp_jiyi(String fxp_jiyi) {
        this.fxp_jiyi = fxp_jiyi == null ? null : fxp_jiyi.trim();
    }
    public String getDainnaoxianshiping() {
        return dainnaoxianshiping;
    }
    public void setDainnaoxianshiping(String dainnaoxianshiping) {
        this.dainnaoxianshiping = dainnaoxianshiping == null ? null : dainnaoxianshiping.trim();
    }
    public String getYiejingyibiaopan() {
        return yiejingyibiaopan;
    }
    public void setYiejingyibiaopan(String yiejingyibiaopan) {
        this.yiejingyibiaopan = yiejingyibiaopan == null ? null : yiejingyibiaopan.trim();
    }
    public String getHUD() {
        return HUD;
    }
    public void setHUD(String HUD) {
        this.HUD = HUD == null ? null : HUD.trim();
    }
    public String getNenzhixingchejiluyi() {
        return nenzhixingchejiluyi;
    }
    public void setNenzhixingchejiluyi(String nenzhixingchejiluyi) {
        this.nenzhixingchejiluyi = nenzhixingchejiluyi == null ? null : nenzhixingchejiluyi.trim();
    }
    public String getZhudongjiangzao() {
        return zhudongjiangzao;
    }
    public void setZhudongjiangzao(String zhudongjiangzao) {
        this.zhudongjiangzao = zhudongjiangzao == null ? null : zhudongjiangzao.trim();
    }
    public String getShoujiwuxianchengdian() {
        return shoujiwuxianchengdian;
    }
    public void setShoujiwuxianchengdian(String shoujiwuxianchengdian) {
        this.shoujiwuxianchengdian = shoujiwuxianchengdian == null ? null : shoujiwuxianchengdian.trim();
    }
    public String getZuoyicaizhi() {
        return zuoyicaizhi;
    }
    public void setZuoyicaizhi(String zuoyicaizhi) {
        this.zuoyicaizhi = zuoyicaizhi == null ? null : zuoyicaizhi.trim();
    }
    public String getYongdongfenggezuoyi() {
        return yongdongfenggezuoyi;
    }
    public void setYongdongfenggezuoyi(String yongdongfenggezuoyi) {
        this.yongdongfenggezuoyi = yongdongfenggezuoyi == null ? null : yongdongfenggezuoyi.trim();
    }
    public String getZuoyigaoditiaojie() {
        return zuoyigaoditiaojie;
    }
    public void setZuoyigaoditiaojie(String zuoyigaoditiaojie) {
        this.zuoyigaoditiaojie = zuoyigaoditiaojie == null ? null : zuoyigaoditiaojie.trim();
    }
    public String getYaobuzhichengtiaojie() {
        return yaobuzhichengtiaojie;
    }
    public void setYaobuzhichengtiaojie(String yaobuzhichengtiaojie) {
        this.yaobuzhichengtiaojie = yaobuzhichengtiaojie == null ? null : yaobuzhichengtiaojie.trim();
    }
    public String getJianbuzhichengtiaojie() {
        return jianbuzhichengtiaojie;
    }
    public void setJianbuzhichengtiaojie(String jianbuzhichengtiaojie) {
        this.jianbuzhichengtiaojie = jianbuzhichengtiaojie == null ? null : jianbuzhichengtiaojie.trim();
    }
    public String getDiandongzuoyitiaojie() {
        return diandongzuoyitiaojie;
    }
    public void setDiandongzuoyitiaojie(String diandongzuoyitiaojie) {
        this.diandongzuoyitiaojie = diandongzuoyitiaojie == null ? null : diandongzuoyitiaojie.trim();
    }
    public String getJiaodutiaojie() {
        return jiaodutiaojie;
    }
    public void setJiaodutiaojie(String jiaodutiaojie) {
        this.jiaodutiaojie = jiaodutiaojie == null ? null : jiaodutiaojie.trim();
    }
    public String getDierpaizuoyiyidong() {
        return dierpaizuoyiyidong;
    }
    public void setDierpaizuoyiyidong(String dierpaizuoyiyidong) {
        this.dierpaizuoyiyidong = dierpaizuoyiyidong == null ? null : dierpaizuoyiyidong.trim();
    }
    public String getHoupaizuoyidiandongtiaojie() {
        return houpaizuoyidiandongtiaojie;
    }
    public void setHoupaizuoyidiandongtiaojie(String houpaizuoyidiandongtiaojie) {
        this.houpaizuoyidiandongtiaojie = houpaizuoyidiandongtiaojie == null ? null : houpaizuoyidiandongtiaojie.trim();
    }
    public String getFujiashiketiaojie() {
        return fujiashiketiaojie;
    }
    public void setFujiashiketiaojie(String fujiashiketiaojie) {
        this.fujiashiketiaojie = fujiashiketiaojie == null ? null : fujiashiketiaojie.trim();
    }
    public String getDiandongzuoyijiyi() {
        return diandongzuoyijiyi;
    }
    public void setDiandongzuoyijiyi(String diandongzuoyijiyi) {
        this.diandongzuoyijiyi = diandongzuoyijiyi == null ? null : diandongzuoyijiyi.trim();
    }
    public String getQianhoupaizuoyijiare() {
        return qianhoupaizuoyijiare;
    }
    public void setQianhoupaizuoyijiare(String qianhoupaizuoyijiare) {
        this.qianhoupaizuoyijiare = qianhoupaizuoyijiare == null ? null : qianhoupaizuoyijiare.trim();
    }
    public String getQianhoupaizuoyidongfeng() {
        return qianhoupaizuoyidongfeng;
    }
    public void setQianhoupaizuoyidongfeng(String qianhoupaizuoyidongfeng) {
        this.qianhoupaizuoyidongfeng = qianhoupaizuoyidongfeng == null ? null : qianhoupaizuoyidongfeng.trim();
    }
    public String getQianhoupaizuoyianmo() {
        return qianhoupaizuoyianmo;
    }
    public void setQianhoupaizuoyianmo(String qianhoupaizuoyianmo) {
        this.qianhoupaizuoyianmo = qianhoupaizuoyianmo == null ? null : qianhoupaizuoyianmo.trim();
    }
    public String getDierpaidulizuoyi() {
        return dierpaidulizuoyi;
    }
    public void setDierpaidulizuoyi(String dierpaidulizuoyi) {
        this.dierpaidulizuoyi = dierpaidulizuoyi == null ? null : dierpaidulizuoyi.trim();
    }
    public String getDisanpaizuoyi() {
        return disanpaizuoyi;
    }
    public void setDisanpaizuoyi(String disanpaizuoyi) {
        this.disanpaizuoyi = disanpaizuoyi == null ? null : disanpaizuoyi.trim();
    }
    public String getHoupaizuoyifabfshi() {
        return houpaizuoyifabfshi;
    }
    public void setHoupaizuoyifabfshi(String houpaizuoyifabfshi) {
        this.houpaizuoyifabfshi = houpaizuoyifabfshi == null ? null : houpaizuoyifabfshi.trim();
    }
    public String getQianhouzhongyangfushou() {
        return qianhouzhongyangfushou;
    }
    public void setQianhouzhongyangfushou(String qianhouzhongyangfushou) {
        this.qianhouzhongyangfushou = qianhouzhongyangfushou == null ? null : qianhouzhongyangfushou.trim();
    }
    public String getHoupaibeijia() {
        return houpaibeijia;
    }
    public void setHoupaibeijia(String houpaibeijia) {
        this.houpaibeijia = houpaibeijia == null ? null : houpaibeijia.trim();
    }
    public String getJiarezhilingbeijia() {
        return jiarezhilingbeijia;
    }
    public void setJiarezhilingbeijia(String jiarezhilingbeijia) {
        this.jiarezhilingbeijia = jiarezhilingbeijia == null ? null : jiarezhilingbeijia.trim();
    }
    public String getGPS() {
        return GPS;
    }
    public void setGPS(String GPS) {
        this.GPS = GPS == null ? null : GPS.trim();
    }
    public String getDingweihudongfuwu() {
        return dingweihudongfuwu;
    }
    public void setDingweihudongfuwu(String dingweihudongfuwu) {
        this.dingweihudongfuwu = dingweihudongfuwu == null ? null : dingweihudongfuwu.trim();
    }
    public String getZhongkongtai_daping() {
        return zhongkongtai_daping;
    }
    public void setZhongkongtai_daping(String zhongkongtai_daping) {
        this.zhongkongtai_daping = zhongkongtai_daping == null ? null : zhongkongtai_daping.trim();
    }
    public String getZhongkongtai_dapingchicun() {
        return zhongkongtai_dapingchicun;
    }
    public void setZhongkongtai_dapingchicun(String zhongkongtai_dapingchicun) {
        this.zhongkongtai_dapingchicun = zhongkongtai_dapingchicun == null ? null : zhongkongtai_dapingchicun.trim();
    }
    public String getZhongkongtai_xianshi() {
        return zhongkongtai_xianshi;
    }
    public void setZhongkongtai_xianshi(String zhongkongtai_xianshi) {
        this.zhongkongtai_xianshi = zhongkongtai_xianshi == null ? null : zhongkongtai_xianshi.trim();
    }
    public String getLanyachezaidianhu() {
        return lanyachezaidianhu;
    }
    public void setLanyachezaidianhu(String lanyachezaidianhu) {
        this.lanyachezaidianhu = lanyachezaidianhu == null ? null : lanyachezaidianhu.trim();
    }
    public String getShoujihulianyingshe() {
        return shoujihulianyingshe;
    }
    public void setShoujihulianyingshe(String shoujihulianyingshe) {
        this.shoujihulianyingshe = shoujihulianyingshe == null ? null : shoujihulianyingshe.trim();
    }
    public String getChelianwang() {
        return chelianwang;
    }
    public void setChelianwang(String chelianwang) {
        this.chelianwang = chelianwang == null ? null : chelianwang.trim();
    }
    public String getChezaidianshi() {
        return chezaidianshi;
    }
    public void setChezaidianshi(String chezaidianshi) {
        this.chezaidianshi = chezaidianshi == null ? null : chezaidianshi.trim();
    }
    public String getHoupaiyiejingping() {
        return houpaiyiejingping;
    }
    public void setHoupaiyiejingping(String houpaiyiejingping) {
        this.houpaiyiejingping = houpaiyiejingping == null ? null : houpaiyiejingping.trim();
    }
    public String getDianyuan() {
        return dianyuan;
    }
    public void setDianyuan(String dianyuan) {
        this.dianyuan = dianyuan == null ? null : dianyuan.trim();
    }
    public String getWaijieyinwuanjiekou() {
        return waijieyinwuanjiekou;
    }
    public void setWaijieyinwuanjiekou(String waijieyinwuanjiekou) {
        this.waijieyinwuanjiekou = waijieyinwuanjiekou == null ? null : waijieyinwuanjiekou.trim();
    }
    public String getCDDVD() {
        return CDDVD;
    }
    public void setCDDVD(String CDDVD) {
        this.CDDVD = CDDVD == null ? null : CDDVD.trim();
    }
    public String getYinxhangpinpai() {
        return yinxhangpinpai;
    }
    public void setYinxhangpinpai(String yinxhangpinpai) {
        this.yinxhangpinpai = yinxhangpinpai == null ? null : yinxhangpinpai.trim();
    }
    public String getYinxiangshuliang() {
        return yinxiangshuliang;
    }
    public void setYinxiangshuliang(String yinxiangshuliang) {
        this.yinxiangshuliang = yinxiangshuliang == null ? null : yinxiangshuliang.trim();
    }
    public String getJinguangdeng() {
        return jinguangdeng;
    }
    public void setJinguangdeng(String jinguangdeng) {
        this.jinguangdeng = jinguangdeng == null ? null : jinguangdeng.trim();
    }
    public String getYuanguangdeng() {
        return yuanguangdeng;
    }
    public void setYuanguangdeng(String yuanguangdeng) {
        this.yuanguangdeng = yuanguangdeng == null ? null : yuanguangdeng.trim();
    }
    public String getLED() {
        return LED;
    }
    public void setLED(String LED) {
        this.LED = LED == null ? null : LED.trim();
    }
    public String getZishiyingyuanjinguang() {
        return zishiyingyuanjinguang;
    }
    public void setZishiyingyuanjinguang(String zishiyingyuanjinguang) {
        this.zishiyingyuanjinguang = zishiyingyuanjinguang == null ? null : zishiyingyuanjinguang.trim();
    }
    public String getZidongtoudeng() {
        return zidongtoudeng;
    }
    public void setZidongtoudeng(String zidongtoudeng) {
        this.zidongtoudeng = zidongtoudeng == null ? null : zidongtoudeng.trim();
    }
    public String getZuangxhangfuzhudeng() {
        return zuangxhangfuzhudeng;
    }
    public void setZuangxhangfuzhudeng(String zuangxhangfuzhudeng) {
        this.zuangxhangfuzhudeng = zuangxhangfuzhudeng == null ? null : zuangxhangfuzhudeng.trim();
    }
    public String getZhuangxhangdeng() {
        return zhuangxhangdeng;
    }
    public void setZhuangxhangdeng(String zhuangxhangdeng) {
        this.zhuangxhangdeng = zhuangxhangdeng == null ? null : zhuangxhangdeng.trim();
    }
    public String getQianweding() {
        return qianweding;
    }
    public void setQianweding(String qianweding) {
        this.qianweding = qianweding == null ? null : qianweding.trim();
    }
    public String getDadenggaodutijie() {
        return dadenggaodutijie;
    }
    public void setDadenggaodutijie(String dadenggaodutijie) {
        this.dadenggaodutijie = dadenggaodutijie == null ? null : dadenggaodutijie.trim();
    }
    public String getDadengqingxizhuangzhi() {
        return dadengqingxizhuangzhi;
    }
    public void setDadengqingxizhuangzhi(String dadengqingxizhuangzhi) {
        this.dadengqingxizhuangzhi = dadengqingxizhuangzhi == null ? null : dadengqingxizhuangzhi.trim();
    }
    public String getChennengfenweideng() {
        return chennengfenweideng;
    }
    public void setChennengfenweideng(String chennengfenweideng) {
        this.chennengfenweideng = chennengfenweideng == null ? null : chennengfenweideng.trim();
    }
    public String getDiandongchechaung() {
        return diandongchechaung;
    }
    public void setDiandongchechaung(String diandongchechaung) {
        this.diandongchechaung = diandongchechaung == null ? null : diandongchechaung.trim();
    }
    public String getYijiangshangjiang() {
        return yijiangshangjiang;
    }
    public void setYijiangshangjiang(String yijiangshangjiang) {
        this.yijiangshangjiang = yijiangshangjiang == null ? null : yijiangshangjiang.trim();
    }
    public String getFangjiashou() {
        return fangjiashou;
    }
    public void setFangjiashou(String fangjiashou) {
        this.fangjiashou = fangjiashou == null ? null : fangjiashou.trim();
    }
    public String getGereboli() {
        return gereboli;
    }
    public void setGereboli(String gereboli) {
        this.gereboli = gereboli == null ? null : gereboli.trim();
    }
    public String getHoushijingdiandongtiaojie() {
        return houshijingdiandongtiaojie;
    }
    public void setHoushijingdiandongtiaojie(String houshijingdiandongtiaojie) {
        this.houshijingdiandongtiaojie = houshijingdiandongtiaojie == null ? null : houshijingdiandongtiaojie.trim();
    }
    public String getHoushijingjiare() {
        return houshijingjiare;
    }
    public void setHoushijingjiare(String houshijingjiare) {
        this.houshijingjiare = houshijingjiare == null ? null : houshijingjiare.trim();
    }
    public String getNenwaihoushijingfangxuanyun() {
        return nenwaihoushijingfangxuanyun;
    }
    public void setNenwaihoushijingfangxuanyun(String nenwaihoushijingfangxuanyun) {
        this.nenwaihoushijingfangxuanyun = nenwaihoushijingfangxuanyun == null ? null : nenwaihoushijingfangxuanyun.trim();
    }
    public String getJiumeitichenenghoushijing() {
        return jiumeitichenenghoushijing;
    }
    public void setJiumeitichenenghoushijing(String jiumeitichenenghoushijing) {
        this.jiumeitichenenghoushijing = jiumeitichenenghoushijing == null ? null : jiumeitichenenghoushijing.trim();
    }
    public String getHoushijingdiandongzhedie() {
        return houshijingdiandongzhedie;
    }
    public void setHoushijingdiandongzhedie(String houshijingdiandongzhedie) {
        this.houshijingdiandongzhedie = houshijingdiandongzhedie == null ? null : houshijingdiandongzhedie.trim();
    }
    public String getHoushijiangjiyi() {
        return houshijiangjiyi;
    }
    public void setHoushijiangjiyi(String houshijiangjiyi) {
        this.houshijiangjiyi = houshijiangjiyi == null ? null : houshijiangjiyi.trim();
    }
    public String getZheyanglian() {
        return zheyanglian;
    }
    public void setZheyanglian(String zheyanglian) {
        this.zheyanglian = zheyanglian == null ? null : zheyanglian.trim();
    }
    public String getHoupaizheyanglian() {
        return houpaizheyanglian;
    }
    public void setHoupaizheyanglian(String houpaizheyanglian) {
        this.houpaizheyanglian = houpaizheyanglian == null ? null : houpaizheyanglian.trim();
    }
    public String getHoupaiyinsiboli() {
        return houpaiyinsiboli;
    }
    public void setHoupaiyinsiboli(String houpaiyinsiboli) {
        this.houpaiyinsiboli = houpaiyinsiboli == null ? null : houpaiyinsiboli.trim();
    }
    public String getZheyangbanhuangzhuangjing() {
        return zheyangbanhuangzhuangjing;
    }
    public void setZheyangbanhuangzhuangjing(String zheyangbanhuangzhuangjing) {
        this.zheyangbanhuangzhuangjing = zheyangbanhuangzhuangjing == null ? null : zheyangbanhuangzhuangjing.trim();
    }
    public String getHouyvshua() {
        return houyvshua;
    }
    public void setHouyvshua(String houyvshua) {
        this.houyvshua = houyvshua == null ? null : houyvshua.trim();
    }
    public String getGanyingyvshu() {
        return ganyingyvshu;
    }
    public void setGanyingyvshu(String ganyingyvshu) {
        this.ganyingyvshu = ganyingyvshu == null ? null : ganyingyvshu.trim();
    }
    public String getKongtiaokongzhifangshi() {
        return kongtiaokongzhifangshi;
    }
    public void setKongtiaokongzhifangshi(String kongtiaokongzhifangshi) {
        this.kongtiaokongzhifangshi = kongtiaokongzhifangshi == null ? null : kongtiaokongzhifangshi.trim();
    }
    public String getHoupaidulikongtiao() {
        return houpaidulikongtiao;
    }
    public void setHoupaidulikongtiao(String houpaidulikongtiao) {
        this.houpaidulikongtiao = houpaidulikongtiao == null ? null : houpaidulikongtiao.trim();
    }
    public String getHoupaichufengkou() {
        return houpaichufengkou;
    }
    public void setHoupaichufengkou(String houpaichufengkou) {
        this.houpaichufengkou = houpaichufengkou == null ? null : houpaichufengkou.trim();
    }
    public String getWendufenqvkongzhi() {
        return wendufenqvkongzhi;
    }
    public void setWendufenqvkongzhi(String wendufenqvkongzhi) {
        this.wendufenqvkongzhi = wendufenqvkongzhi == null ? null : wendufenqvkongzhi.trim();
    }
    public String getHuafenguolv() {
        return huafenguolv;
    }
    public void setHuafenguolv(String huafenguolv) {
        this.huafenguolv = huafenguolv == null ? null : huafenguolv.trim();
    }
    public String getChezaijinghuaqi() {
        return chezaijinghuaqi;
    }
    public void setChezaijinghuaqi(String chezaijinghuaqi) {
        this.chezaijinghuaqi = chezaijinghuaqi == null ? null : chezaijinghuaqi.trim();
    }
    public String getChezaibingxiang() {
        return chezaibingxiang;
    }
    public void setChezaibingxiang(String chezaibingxiang) {
        this.chezaibingxiang = chezaibingxiang == null ? null : chezaibingxiang.trim();
    }
    public String getWaiguanyanse() {
        return waiguanyanse;
    }
    public void setWaiguanyanse(String waiguanyanse) {
        this.waiguanyanse = waiguanyanse == null ? null : waiguanyanse.trim();
    }
    public String getNeshiyansi() {
        return neshiyansi;
    }
    public void setNeshiyansi(String neshiyansi) {
        this.neshiyansi = neshiyansi == null ? null : neshiyansi.trim();
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ConfigCar other = (ConfigCar) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZm() == null ? other.getZm() == null : this.getZm().equals(other.getZm()))
            && (this.getPinpai() == null ? other.getPinpai() == null : this.getPinpai().equals(other.getPinpai()))
            && (this.getPinpai_id() == null ? other.getPinpai_id() == null : this.getPinpai_id().equals(other.getPinpai_id()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getChexi() == null ? other.getChexi() == null : this.getChexi().equals(other.getChexi()))
            && (this.getChexi_id() == null ? other.getChexi_id() == null : this.getChexi_id().equals(other.getChexi_id()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getCheming() == null ? other.getCheming() == null : this.getCheming().equals(other.getCheming()))
            && (this.getChexing_id() == null ? other.getChexing_id() == null : this.getChexing_id().equals(other.getChexing_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getChangjia() == null ? other.getChangjia() == null : this.getChangjia().equals(other.getChangjia()))
            && (this.getNiankuan() == null ? other.getNiankuan() == null : this.getNiankuan().equals(other.getNiankuan()))
            && (this.getGengxin_time() == null ? other.getGengxin_time() == null : this.getGengxin_time().equals(other.getGengxin_time()))
            && (this.getShangshi_time() == null ? other.getShangshi_time() == null : this.getShangshi_time().equals(other.getShangshi_time()))
            && (this.getZhidaojia() == null ? other.getZhidaojia() == null : this.getZhidaojia().equals(other.getZhidaojia()))
            && (this.getJibie() == null ? other.getJibie() == null : this.getJibie().equals(other.getJibie()))
            && (this.getFadongji() == null ? other.getFadongji() == null : this.getFadongji().equals(other.getFadongji()))
            && (this.getBiansuxiang() == null ? other.getBiansuxiang() == null : this.getBiansuxiang().equals(other.getBiansuxiang()))
            && (this.getChangkuanggao() == null ? other.getChangkuanggao() == null : this.getChangkuanggao().equals(other.getChangkuanggao()))
            && (this.getJiegou() == null ? other.getJiegou() == null : this.getJiegou().equals(other.getJiegou()))
            && (this.getZuigaochesu() == null ? other.getZuigaochesu() == null : this.getZuigaochesu().equals(other.getZuigaochesu()))
            && (this.getGuangfang_jiasu() == null ? other.getGuangfang_jiasu() == null : this.getGuangfang_jiasu().equals(other.getGuangfang_jiasu()))
            && (this.getShice__jiasu() == null ? other.getShice__jiasu() == null : this.getShice__jiasu().equals(other.getShice__jiasu()))
            && (this.getZhidong() == null ? other.getZhidong() == null : this.getZhidong().equals(other.getZhidong()))
            && (this.getLidijianxi() == null ? other.getLidijianxi() == null : this.getLidijianxi().equals(other.getLidijianxi()))
            && (this.getZonghe_youhao() == null ? other.getZonghe_youhao() == null : this.getZonghe_youhao().equals(other.getZonghe_youhao()))
            && (this.getShice__youhao() == null ? other.getShice__youhao() == null : this.getShice__youhao().equals(other.getShice__youhao()))
            && (this.getBaozhiqi() == null ? other.getBaozhiqi() == null : this.getBaozhiqi().equals(other.getBaozhiqi()))
            && (this.getChangdu() == null ? other.getChangdu() == null : this.getChangdu().equals(other.getChangdu()))
            && (this.getKuandu() == null ? other.getKuandu() == null : this.getKuandu().equals(other.getKuandu()))
            && (this.getGaodu() == null ? other.getGaodu() == null : this.getGaodu().equals(other.getGaodu()))
            && (this.getZhoujv() == null ? other.getZhoujv() == null : this.getZhoujv().equals(other.getZhoujv()))
            && (this.getQianlun_jv() == null ? other.getQianlun_jv() == null : this.getQianlun_jv().equals(other.getQianlun_jv()))
            && (this.getHoulun_jv() == null ? other.getHoulun_jv() == null : this.getHoulun_jv().equals(other.getHoulun_jv()))
            && (this.getLidi_jianxi() == null ? other.getLidi_jianxi() == null : this.getLidi_jianxi().equals(other.getLidi_jianxi()))
            && (this.getChemenshu() == null ? other.getChemenshu() == null : this.getChemenshu().equals(other.getChemenshu()))
            && (this.getZuoweishu() == null ? other.getZuoweishu() == null : this.getZuoweishu().equals(other.getZuoweishu()))
            && (this.getYouxiang() == null ? other.getYouxiang() == null : this.getYouxiang().equals(other.getYouxiang()))
            && (this.getHoubeixiang() == null ? other.getHoubeixiang() == null : this.getHoubeixiang().equals(other.getHoubeixiang()))
            && (this.getHoumenkaiqi() == null ? other.getHoumenkaiqi() == null : this.getHoumenkaiqi().equals(other.getHoumenkaiqi()))
            && (this.getHuoxiangchichun() == null ? other.getHuoxiangchichun() == null : this.getHuoxiangchichun().equals(other.getHuoxiangchichun()))
            && (this.getZhengbeizhiliang() == null ? other.getZhengbeizhiliang() == null : this.getZhengbeizhiliang().equals(other.getZhengbeizhiliang()))
            && (this.getFadongjiaxinghao() == null ? other.getFadongjiaxinghao() == null : this.getFadongjiaxinghao().equals(other.getFadongjiaxinghao()))
            && (this.getPailiang() == null ? other.getPailiang() == null : this.getPailiang().equals(other.getPailiang()))
            && (this.getJinqixiangshi() == null ? other.getJinqixiangshi() == null : this.getJinqixiangshi().equals(other.getJinqixiangshi()))
            && (this.getQigangpailiexingshi() == null ? other.getQigangpailiexingshi() == null : this.getQigangpailiexingshi().equals(other.getQigangpailiexingshi()))
            && (this.getQigang() == null ? other.getQigang() == null : this.getQigang().equals(other.getQigang()))
            && (this.getMeigangqimenshu() == null ? other.getMeigangqimenshu() == null : this.getMeigangqimenshu().equals(other.getMeigangqimenshu()))
            && (this.getYasuobi() == null ? other.getYasuobi() == null : this.getYasuobi().equals(other.getYasuobi()))
            && (this.getPeiqijigou() == null ? other.getPeiqijigou() == null : this.getPeiqijigou().equals(other.getPeiqijigou()))
            && (this.getGangjing() == null ? other.getGangjing() == null : this.getGangjing().equals(other.getGangjing()))
            && (this.getXingcheng() == null ? other.getXingcheng() == null : this.getXingcheng().equals(other.getXingcheng()))
            && (this.getZuida_mali() == null ? other.getZuida_mali() == null : this.getZuida_mali().equals(other.getZuida_mali()))
            && (this.getZuida_gonglv() == null ? other.getZuida_gonglv() == null : this.getZuida_gonglv().equals(other.getZuida_gonglv()))
            && (this.getZuida_zhuansu() == null ? other.getZuida_zhuansu() == null : this.getZuida_zhuansu().equals(other.getZuida_zhuansu()))
            && (this.getZuida_niujv() == null ? other.getZuida_niujv() == null : this.getZuida_niujv().equals(other.getZuida_niujv()))
            && (this.getZuida_nuijvzhuansu() == null ? other.getZuida_nuijvzhuansu() == null : this.getZuida_nuijvzhuansu().equals(other.getZuida_nuijvzhuansu()))
            && (this.getTeyoujishhu() == null ? other.getTeyoujishhu() == null : this.getTeyoujishhu().equals(other.getTeyoujishhu()))
            && (this.getRanliaoxingshi() == null ? other.getRanliaoxingshi() == null : this.getRanliaoxingshi().equals(other.getRanliaoxingshi()))
            && (this.getRanyoubiaohao() == null ? other.getRanyoubiaohao() == null : this.getRanyoubiaohao().equals(other.getRanyoubiaohao()))
            && (this.getGongyoufangshi() == null ? other.getGongyoufangshi() == null : this.getGongyoufangshi().equals(other.getGongyoufangshi()))
            && (this.getGanggaicailiao() == null ? other.getGanggaicailiao() == null : this.getGanggaicailiao().equals(other.getGanggaicailiao()))
            && (this.getGangticailiao() == null ? other.getGangticailiao() == null : this.getGangticailiao().equals(other.getGangticailiao()))
            && (this.getHuanbaobiaozhuan() == null ? other.getHuanbaobiaozhuan() == null : this.getHuanbaobiaozhuan().equals(other.getHuanbaobiaozhuan()))
            && (this.getDianjia_leixing() == null ? other.getDianjia_leixing() == null : this.getDianjia_leixing().equals(other.getDianjia_leixing()))
            && (this.getDainji_zongguonglv() == null ? other.getDainji_zongguonglv() == null : this.getDainji_zongguonglv().equals(other.getDainji_zongguonglv()))
            && (this.getDianji_zongniujv() == null ? other.getDianji_zongniujv() == null : this.getDianji_zongniujv().equals(other.getDianji_zongniujv()))
            && (this.getQiandainji_zuidadonglv() == null ? other.getQiandainji_zuidadonglv() == null : this.getQiandainji_zuidadonglv().equals(other.getQiandainji_zuidadonglv()))
            && (this.getQiandainji_zuidaniujv() == null ? other.getQiandainji_zuidaniujv() == null : this.getQiandainji_zuidaniujv().equals(other.getQiandainji_zuidaniujv()))
            && (this.getHoutianji_zuidagonglv() == null ? other.getHoutianji_zuidagonglv() == null : this.getHoutianji_zuidagonglv().equals(other.getHoutianji_zuidagonglv()))
            && (this.getHoudainjia_zuidaniujv() == null ? other.getHoudainjia_zuidaniujv() == null : this.getHoudainjia_zuidaniujv().equals(other.getHoudainjia_zuidaniujv()))
            && (this.getXitong_zonghegonglv() == null ? other.getXitong_zonghegonglv() == null : this.getXitong_zonghegonglv().equals(other.getXitong_zonghegonglv()))
            && (this.getXitong_zongheniujv() == null ? other.getXitong_zongheniujv() == null : this.getXitong_zongheniujv().equals(other.getXitong_zongheniujv()))
            && (this.getQvdongdianjishu() == null ? other.getQvdongdianjishu() == null : this.getQvdongdianjishu().equals(other.getQvdongdianjishu()))
            && (this.getDianjibuqv() == null ? other.getDianjibuqv() == null : this.getDianjibuqv().equals(other.getDianjibuqv()))
            && (this.getDianchileixing() == null ? other.getDianchileixing() == null : this.getDianchileixing().equals(other.getDianchileixing()))
            && (this.getNengyuanleixing() == null ? other.getNengyuanleixing() == null : this.getNengyuanleixing().equals(other.getNengyuanleixing()))
            && (this.getXvhuanglicheng() == null ? other.getXvhuanglicheng() == null : this.getXvhuanglicheng().equals(other.getXvhuanglicheng()))
            && (this.getBaiFenBi() == null ? other.getBaiFenBi() == null : this.getBaiFenBi().equals(other.getBaiFenBi()))
            && (this.getXvhanglicheng() == null ? other.getXvhanglicheng() == null : this.getXvhanglicheng().equals(other.getXvhanglicheng()))
            && (this.getDainchirongliang() == null ? other.getDainchirongliang() == null : this.getDainchirongliang().equals(other.getDainchirongliang()))
            && (this.getYouhao() == null ? other.getYouhao() == null : this.getYouhao().equals(other.getYouhao()))
            && (this.getKuaichnegdainliang() == null ? other.getKuaichnegdainliang() == null : this.getKuaichnegdainliang().equals(other.getKuaichnegdainliang()))
            && (this.getChengdianzhnagjiage() == null ? other.getChengdianzhnagjiage() == null : this.getChengdianzhnagjiage().equals(other.getChengdianzhnagjiage()))
            && (this.getDangweishu() == null ? other.getDangweishu() == null : this.getDangweishu().equals(other.getDangweishu()))
            && (this.getBiansuxiangleixing() == null ? other.getBiansuxiangleixing() == null : this.getBiansuxiangleixing().equals(other.getBiansuxiangleixing()))
            && (this.getJiancheng() == null ? other.getJiancheng() == null : this.getJiancheng().equals(other.getJiancheng()))
            && (this.getQvdongfangshi() == null ? other.getQvdongfangshi() == null : this.getQvdongfangshi().equals(other.getQvdongfangshi()))
            && (this.getQianxuan_jialeixing() == null ? other.getQianxuan_jialeixing() == null : this.getQianxuan_jialeixing().equals(other.getQianxuan_jialeixing()))
            && (this.getHouxuan_jialeixing() == null ? other.getHouxuan_jialeixing() == null : this.getHouxuan_jialeixing().equals(other.getHouxuan_jialeixing()))
            && (this.getZhulileixing() == null ? other.getZhulileixing() == null : this.getZhulileixing().equals(other.getZhulileixing()))
            && (this.getChetijiegou() == null ? other.getChetijiegou() == null : this.getChetijiegou().equals(other.getChetijiegou()))
            && (this.getHouzhidong() == null ? other.getHouzhidong() == null : this.getHouzhidong().equals(other.getHouzhidong()))
            && (this.getHouzhidongleixing() == null ? other.getHouzhidongleixing() == null : this.getHouzhidongleixing().equals(other.getHouzhidongleixing()))
            && (this.getZhuchezhidong() == null ? other.getZhuchezhidong() == null : this.getZhuchezhidong().equals(other.getZhuchezhidong()))
            && (this.getQianluantai() == null ? other.getQianluantai() == null : this.getQianluantai().equals(other.getQianluantai()))
            && (this.getHouluantai() == null ? other.getHouluantai() == null : this.getHouluantai().equals(other.getHouluantai()))
            && (this.getBeitai() == null ? other.getBeitai() == null : this.getBeitai().equals(other.getBeitai()))
            && (this.getZhufuqilang() == null ? other.getZhufuqilang() == null : this.getZhufuqilang().equals(other.getZhufuqilang()))
            && (this.getCepaiqinang() == null ? other.getCepaiqinang() == null : this.getCepaiqinang().equals(other.getCepaiqinang()))
            && (this.getToubuqinang() == null ? other.getToubuqinang() == null : this.getToubuqinang().equals(other.getToubuqinang()))
            && (this.getXibuqinang() == null ? other.getXibuqinang() == null : this.getXibuqinang().equals(other.getXibuqinang()))
            && (this.getTaiyajiance() == null ? other.getTaiyajiance() == null : this.getTaiyajiance().equals(other.getTaiyajiance()))
            && (this.getLiangtaiya() == null ? other.getLiangtaiya() == null : this.getLiangtaiya().equals(other.getLiangtaiya()))
            && (this.getAnquandaitishi() == null ? other.getAnquandaitishi() == null : this.getAnquandaitishi().equals(other.getAnquandaitishi()))
            && (this.getISOFIX() == null ? other.getISOFIX() == null : this.getISOFIX().equals(other.getISOFIX()))
            && (this.getABS() == null ? other.getABS() == null : this.getABS().equals(other.getABS()))
            && (this.getZhidongfanpei() == null ? other.getZhidongfanpei() == null : this.getZhidongfanpei().equals(other.getZhidongfanpei()))
            && (this.getShachefuzhu() == null ? other.getShachefuzhu() == null : this.getShachefuzhu().equals(other.getShachefuzhu()))
            && (this.getQianyinlikongzhi() == null ? other.getQianyinlikongzhi() == null : this.getQianyinlikongzhi().equals(other.getQianyinlikongzhi()))
            && (this.getCheshenwendingkongzhi() == null ? other.getCheshenwendingkongzhi() == null : this.getCheshenwendingkongzhi().equals(other.getCheshenwendingkongzhi()))
            && (this.getBingxianfuzhu() == null ? other.getBingxianfuzhu() == null : this.getBingxianfuzhu().equals(other.getBingxianfuzhu()))
            && (this.getPianliyvjing() == null ? other.getPianliyvjing() == null : this.getPianliyvjing().equals(other.getPianliyvjing()))
            && (this.getZhudongshanchu() == null ? other.getZhudongshanchu() == null : this.getZhudongshanchu().equals(other.getZhudongshanchu()))
            && (this.getYieshixitong() == null ? other.getYieshixitong() == null : this.getYieshixitong().equals(other.getYieshixitong()))
            && (this.getPilaojiashi() == null ? other.getPilaojiashi() == null : this.getPilaojiashi().equals(other.getPilaojiashi()))
            && (this.getZhuchelieda() == null ? other.getZhuchelieda() == null : this.getZhuchelieda().equals(other.getZhuchelieda()))
            && (this.getDaocheyangxiang() == null ? other.getDaocheyangxiang() == null : this.getDaocheyangxiang().equals(other.getDaocheyangxiang()))
            && (this.getQuanqingshexaingtoou() == null ? other.getQuanqingshexaingtoou() == null : this.getQuanqingshexaingtoou().equals(other.getQuanqingshexaingtoou()))
            && (this.getDingsuxunhang() == null ? other.getDingsuxunhang() == null : this.getDingsuxunhang().equals(other.getDingsuxunhang()))
            && (this.getZishiyingyunhang() == null ? other.getZishiyingyunhang() == null : this.getZishiyingyunhang().equals(other.getZishiyingyunhang()))
            && (this.getZidongbuoche() == null ? other.getZidongbuoche() == null : this.getZidongbuoche().equals(other.getZidongbuoche()))
            && (this.getFadongjizhanting() == null ? other.getFadongjizhanting() == null : this.getFadongjizhanting().equals(other.getFadongjizhanting()))
            && (this.getZhidongjiashi() == null ? other.getZhidongjiashi() == null : this.getZhidongjiashi().equals(other.getZhidongjiashi()))
            && (this.getShangbuofuzhu() == null ? other.getShangbuofuzhu() == null : this.getShangbuofuzhu().equals(other.getShangbuofuzhu()))
            && (this.getZhidongzhuche() == null ? other.getZhidongzhuche() == null : this.getZhidongzhuche().equals(other.getZhidongzhuche()))
            && (this.getDoupohuanjiang() == null ? other.getDoupohuanjiang() == null : this.getDoupohuanjiang().equals(other.getDoupohuanjiang()))
            && (this.getKebianxuanjia() == null ? other.getKebianxuanjia() == null : this.getKebianxuanjia().equals(other.getKebianxuanjia()))
            && (this.getKongqixuanjia() == null ? other.getKongqixuanjia() == null : this.getKongqixuanjia().equals(other.getKongqixuanjia()))
            && (this.getDainceganyingxuanjia() == null ? other.getDainceganyingxuanjia() == null : this.getDainceganyingxuanjia().equals(other.getDainceganyingxuanjia()))
            && (this.getKebianzhuanxiangbi() == null ? other.getKebianzhuanxiangbi() == null : this.getKebianzhuanxiangbi().equals(other.getKebianzhuanxiangbi()))
            && (this.getDiandongtianchuang() == null ? other.getDiandongtianchuang() == null : this.getDiandongtianchuang().equals(other.getDiandongtianchuang()))
            && (this.getQuanjingtianchuang() == null ? other.getQuanjingtianchuang() == null : this.getQuanjingtianchuang().equals(other.getQuanjingtianchuang()))
            && (this.getYundongwaiguan() == null ? other.getYundongwaiguan() == null : this.getYundongwaiguan().equals(other.getYundongwaiguan()))
            && (this.getLuhejinlunquan() == null ? other.getLuhejinlunquan() == null : this.getLuhejinlunquan().equals(other.getLuhejinlunquan()))
            && (this.getDaindongxihemen() == null ? other.getDaindongxihemen() == null : this.getDaindongxihemen().equals(other.getDaindongxihemen()))
            && (this.getCehuamen() == null ? other.getCehuamen() == null : this.getCehuamen().equals(other.getCehuamen()))
            && (this.getDiandonghuobeixiang() == null ? other.getDiandonghuobeixiang() == null : this.getDiandonghuobeixiang().equals(other.getDiandonghuobeixiang()))
            && (this.getGanyinghoubeixing() == null ? other.getGanyinghoubeixing() == null : this.getGanyinghoubeixing().equals(other.getGanyinghoubeixing()))
            && (this.getChedingxinglijia() == null ? other.getChedingxinglijia() == null : this.getChedingxinglijia().equals(other.getChedingxinglijia()))
            && (this.getFadongjiadianzifangdao() == null ? other.getFadongjiadianzifangdao() == null : this.getFadongjiadianzifangdao().equals(other.getFadongjiadianzifangdao()))
            && (this.getChenenzhongkongsuo() == null ? other.getChenenzhongkongsuo() == null : this.getChenenzhongkongsuo().equals(other.getChenenzhongkongsuo()))
            && (this.getYaokongyaoshi() == null ? other.getYaokongyaoshi() == null : this.getYaokongyaoshi().equals(other.getYaokongyaoshi()))
            && (this.getWuyaoshiqidongxitong() == null ? other.getWuyaoshiqidongxitong() == null : this.getWuyaoshiqidongxitong().equals(other.getWuyaoshiqidongxitong()))
            && (this.getWuyaoshijinruxitong() == null ? other.getWuyaoshijinruxitong() == null : this.getWuyaoshijinruxitong().equals(other.getWuyaoshijinruxitong()))
            && (this.getYuanchengqidong() == null ? other.getYuanchengqidong() == null : this.getYuanchengqidong().equals(other.getYuanchengqidong()))
            && (this.getPizhifangxiangpan() == null ? other.getPizhifangxiangpan() == null : this.getPizhifangxiangpan().equals(other.getPizhifangxiangpan()))
            && (this.getFangxiangpantiaojieqi() == null ? other.getFangxiangpantiaojieqi() == null : this.getFangxiangpantiaojieqi().equals(other.getFangxiangpantiaojieqi()))
            && (this.getFangxiangpandiandongtiaojie() == null ? other.getFangxiangpandiandongtiaojie() == null : this.getFangxiangpandiandongtiaojie().equals(other.getFangxiangpandiandongtiaojie()))
            && (this.getDuogongnnegfangxiangpan() == null ? other.getDuogongnnegfangxiangpan() == null : this.getDuogongnnegfangxiangpan().equals(other.getDuogongnnegfangxiangpan()))
            && (this.getFxp_huandang() == null ? other.getFxp_huandang() == null : this.getFxp_huandang().equals(other.getFxp_huandang()))
            && (this.getFxp_jiare() == null ? other.getFxp_jiare() == null : this.getFxp_jiare().equals(other.getFxp_jiare()))
            && (this.getFxp_jiyi() == null ? other.getFxp_jiyi() == null : this.getFxp_jiyi().equals(other.getFxp_jiyi()))
            && (this.getDainnaoxianshiping() == null ? other.getDainnaoxianshiping() == null : this.getDainnaoxianshiping().equals(other.getDainnaoxianshiping()))
            && (this.getYiejingyibiaopan() == null ? other.getYiejingyibiaopan() == null : this.getYiejingyibiaopan().equals(other.getYiejingyibiaopan()))
            && (this.getHUD() == null ? other.getHUD() == null : this.getHUD().equals(other.getHUD()))
            && (this.getNenzhixingchejiluyi() == null ? other.getNenzhixingchejiluyi() == null : this.getNenzhixingchejiluyi().equals(other.getNenzhixingchejiluyi()))
            && (this.getZhudongjiangzao() == null ? other.getZhudongjiangzao() == null : this.getZhudongjiangzao().equals(other.getZhudongjiangzao()))
            && (this.getShoujiwuxianchengdian() == null ? other.getShoujiwuxianchengdian() == null : this.getShoujiwuxianchengdian().equals(other.getShoujiwuxianchengdian()))
            && (this.getZuoyicaizhi() == null ? other.getZuoyicaizhi() == null : this.getZuoyicaizhi().equals(other.getZuoyicaizhi()))
            && (this.getYongdongfenggezuoyi() == null ? other.getYongdongfenggezuoyi() == null : this.getYongdongfenggezuoyi().equals(other.getYongdongfenggezuoyi()))
            && (this.getZuoyigaoditiaojie() == null ? other.getZuoyigaoditiaojie() == null : this.getZuoyigaoditiaojie().equals(other.getZuoyigaoditiaojie()))
            && (this.getYaobuzhichengtiaojie() == null ? other.getYaobuzhichengtiaojie() == null : this.getYaobuzhichengtiaojie().equals(other.getYaobuzhichengtiaojie()))
            && (this.getJianbuzhichengtiaojie() == null ? other.getJianbuzhichengtiaojie() == null : this.getJianbuzhichengtiaojie().equals(other.getJianbuzhichengtiaojie()))
            && (this.getDiandongzuoyitiaojie() == null ? other.getDiandongzuoyitiaojie() == null : this.getDiandongzuoyitiaojie().equals(other.getDiandongzuoyitiaojie()))
            && (this.getJiaodutiaojie() == null ? other.getJiaodutiaojie() == null : this.getJiaodutiaojie().equals(other.getJiaodutiaojie()))
            && (this.getDierpaizuoyiyidong() == null ? other.getDierpaizuoyiyidong() == null : this.getDierpaizuoyiyidong().equals(other.getDierpaizuoyiyidong()))
            && (this.getHoupaizuoyidiandongtiaojie() == null ? other.getHoupaizuoyidiandongtiaojie() == null : this.getHoupaizuoyidiandongtiaojie().equals(other.getHoupaizuoyidiandongtiaojie()))
            && (this.getFujiashiketiaojie() == null ? other.getFujiashiketiaojie() == null : this.getFujiashiketiaojie().equals(other.getFujiashiketiaojie()))
            && (this.getDiandongzuoyijiyi() == null ? other.getDiandongzuoyijiyi() == null : this.getDiandongzuoyijiyi().equals(other.getDiandongzuoyijiyi()))
            && (this.getQianhoupaizuoyijiare() == null ? other.getQianhoupaizuoyijiare() == null : this.getQianhoupaizuoyijiare().equals(other.getQianhoupaizuoyijiare()))
            && (this.getQianhoupaizuoyidongfeng() == null ? other.getQianhoupaizuoyidongfeng() == null : this.getQianhoupaizuoyidongfeng().equals(other.getQianhoupaizuoyidongfeng()))
            && (this.getQianhoupaizuoyianmo() == null ? other.getQianhoupaizuoyianmo() == null : this.getQianhoupaizuoyianmo().equals(other.getQianhoupaizuoyianmo()))
            && (this.getDierpaidulizuoyi() == null ? other.getDierpaidulizuoyi() == null : this.getDierpaidulizuoyi().equals(other.getDierpaidulizuoyi()))
            && (this.getDisanpaizuoyi() == null ? other.getDisanpaizuoyi() == null : this.getDisanpaizuoyi().equals(other.getDisanpaizuoyi()))
            && (this.getHoupaizuoyifabfshi() == null ? other.getHoupaizuoyifabfshi() == null : this.getHoupaizuoyifabfshi().equals(other.getHoupaizuoyifabfshi()))
            && (this.getQianhouzhongyangfushou() == null ? other.getQianhouzhongyangfushou() == null : this.getQianhouzhongyangfushou().equals(other.getQianhouzhongyangfushou()))
            && (this.getHoupaibeijia() == null ? other.getHoupaibeijia() == null : this.getHoupaibeijia().equals(other.getHoupaibeijia()))
            && (this.getJiarezhilingbeijia() == null ? other.getJiarezhilingbeijia() == null : this.getJiarezhilingbeijia().equals(other.getJiarezhilingbeijia()))
            && (this.getGPS() == null ? other.getGPS() == null : this.getGPS().equals(other.getGPS()))
            && (this.getDingweihudongfuwu() == null ? other.getDingweihudongfuwu() == null : this.getDingweihudongfuwu().equals(other.getDingweihudongfuwu()))
            && (this.getZhongkongtai_daping() == null ? other.getZhongkongtai_daping() == null : this.getZhongkongtai_daping().equals(other.getZhongkongtai_daping()))
            && (this.getZhongkongtai_dapingchicun() == null ? other.getZhongkongtai_dapingchicun() == null : this.getZhongkongtai_dapingchicun().equals(other.getZhongkongtai_dapingchicun()))
            && (this.getZhongkongtai_xianshi() == null ? other.getZhongkongtai_xianshi() == null : this.getZhongkongtai_xianshi().equals(other.getZhongkongtai_xianshi()))
            && (this.getLanyachezaidianhu() == null ? other.getLanyachezaidianhu() == null : this.getLanyachezaidianhu().equals(other.getLanyachezaidianhu()))
            && (this.getShoujihulianyingshe() == null ? other.getShoujihulianyingshe() == null : this.getShoujihulianyingshe().equals(other.getShoujihulianyingshe()))
            && (this.getChelianwang() == null ? other.getChelianwang() == null : this.getChelianwang().equals(other.getChelianwang()))
            && (this.getChezaidianshi() == null ? other.getChezaidianshi() == null : this.getChezaidianshi().equals(other.getChezaidianshi()))
            && (this.getHoupaiyiejingping() == null ? other.getHoupaiyiejingping() == null : this.getHoupaiyiejingping().equals(other.getHoupaiyiejingping()))
            && (this.getDianyuan() == null ? other.getDianyuan() == null : this.getDianyuan().equals(other.getDianyuan()))
            && (this.getWaijieyinwuanjiekou() == null ? other.getWaijieyinwuanjiekou() == null : this.getWaijieyinwuanjiekou().equals(other.getWaijieyinwuanjiekou()))
            && (this.getCDDVD() == null ? other.getCDDVD() == null : this.getCDDVD().equals(other.getCDDVD()))
            && (this.getYinxhangpinpai() == null ? other.getYinxhangpinpai() == null : this.getYinxhangpinpai().equals(other.getYinxhangpinpai()))
            && (this.getYinxiangshuliang() == null ? other.getYinxiangshuliang() == null : this.getYinxiangshuliang().equals(other.getYinxiangshuliang()))
            && (this.getJinguangdeng() == null ? other.getJinguangdeng() == null : this.getJinguangdeng().equals(other.getJinguangdeng()))
            && (this.getYuanguangdeng() == null ? other.getYuanguangdeng() == null : this.getYuanguangdeng().equals(other.getYuanguangdeng()))
            && (this.getLED() == null ? other.getLED() == null : this.getLED().equals(other.getLED()))
            && (this.getZishiyingyuanjinguang() == null ? other.getZishiyingyuanjinguang() == null : this.getZishiyingyuanjinguang().equals(other.getZishiyingyuanjinguang()))
            && (this.getZidongtoudeng() == null ? other.getZidongtoudeng() == null : this.getZidongtoudeng().equals(other.getZidongtoudeng()))
            && (this.getZuangxhangfuzhudeng() == null ? other.getZuangxhangfuzhudeng() == null : this.getZuangxhangfuzhudeng().equals(other.getZuangxhangfuzhudeng()))
            && (this.getZhuangxhangdeng() == null ? other.getZhuangxhangdeng() == null : this.getZhuangxhangdeng().equals(other.getZhuangxhangdeng()))
            && (this.getQianweding() == null ? other.getQianweding() == null : this.getQianweding().equals(other.getQianweding()))
            && (this.getDadenggaodutijie() == null ? other.getDadenggaodutijie() == null : this.getDadenggaodutijie().equals(other.getDadenggaodutijie()))
            && (this.getDadengqingxizhuangzhi() == null ? other.getDadengqingxizhuangzhi() == null : this.getDadengqingxizhuangzhi().equals(other.getDadengqingxizhuangzhi()))
            && (this.getChennengfenweideng() == null ? other.getChennengfenweideng() == null : this.getChennengfenweideng().equals(other.getChennengfenweideng()))
            && (this.getDiandongchechaung() == null ? other.getDiandongchechaung() == null : this.getDiandongchechaung().equals(other.getDiandongchechaung()))
            && (this.getYijiangshangjiang() == null ? other.getYijiangshangjiang() == null : this.getYijiangshangjiang().equals(other.getYijiangshangjiang()))
            && (this.getFangjiashou() == null ? other.getFangjiashou() == null : this.getFangjiashou().equals(other.getFangjiashou()))
            && (this.getGereboli() == null ? other.getGereboli() == null : this.getGereboli().equals(other.getGereboli()))
            && (this.getHoushijingdiandongtiaojie() == null ? other.getHoushijingdiandongtiaojie() == null : this.getHoushijingdiandongtiaojie().equals(other.getHoushijingdiandongtiaojie()))
            && (this.getHoushijingjiare() == null ? other.getHoushijingjiare() == null : this.getHoushijingjiare().equals(other.getHoushijingjiare()))
            && (this.getNenwaihoushijingfangxuanyun() == null ? other.getNenwaihoushijingfangxuanyun() == null : this.getNenwaihoushijingfangxuanyun().equals(other.getNenwaihoushijingfangxuanyun()))
            && (this.getJiumeitichenenghoushijing() == null ? other.getJiumeitichenenghoushijing() == null : this.getJiumeitichenenghoushijing().equals(other.getJiumeitichenenghoushijing()))
            && (this.getHoushijingdiandongzhedie() == null ? other.getHoushijingdiandongzhedie() == null : this.getHoushijingdiandongzhedie().equals(other.getHoushijingdiandongzhedie()))
            && (this.getHoushijiangjiyi() == null ? other.getHoushijiangjiyi() == null : this.getHoushijiangjiyi().equals(other.getHoushijiangjiyi()))
            && (this.getZheyanglian() == null ? other.getZheyanglian() == null : this.getZheyanglian().equals(other.getZheyanglian()))
            && (this.getHoupaizheyanglian() == null ? other.getHoupaizheyanglian() == null : this.getHoupaizheyanglian().equals(other.getHoupaizheyanglian()))
            && (this.getHoupaiyinsiboli() == null ? other.getHoupaiyinsiboli() == null : this.getHoupaiyinsiboli().equals(other.getHoupaiyinsiboli()))
            && (this.getZheyangbanhuangzhuangjing() == null ? other.getZheyangbanhuangzhuangjing() == null : this.getZheyangbanhuangzhuangjing().equals(other.getZheyangbanhuangzhuangjing()))
            && (this.getHouyvshua() == null ? other.getHouyvshua() == null : this.getHouyvshua().equals(other.getHouyvshua()))
            && (this.getGanyingyvshu() == null ? other.getGanyingyvshu() == null : this.getGanyingyvshu().equals(other.getGanyingyvshu()))
            && (this.getKongtiaokongzhifangshi() == null ? other.getKongtiaokongzhifangshi() == null : this.getKongtiaokongzhifangshi().equals(other.getKongtiaokongzhifangshi()))
            && (this.getHoupaidulikongtiao() == null ? other.getHoupaidulikongtiao() == null : this.getHoupaidulikongtiao().equals(other.getHoupaidulikongtiao()))
            && (this.getHoupaichufengkou() == null ? other.getHoupaichufengkou() == null : this.getHoupaichufengkou().equals(other.getHoupaichufengkou()))
            && (this.getWendufenqvkongzhi() == null ? other.getWendufenqvkongzhi() == null : this.getWendufenqvkongzhi().equals(other.getWendufenqvkongzhi()))
            && (this.getHuafenguolv() == null ? other.getHuafenguolv() == null : this.getHuafenguolv().equals(other.getHuafenguolv()))
            && (this.getChezaijinghuaqi() == null ? other.getChezaijinghuaqi() == null : this.getChezaijinghuaqi().equals(other.getChezaijinghuaqi()))
            && (this.getChezaibingxiang() == null ? other.getChezaibingxiang() == null : this.getChezaibingxiang().equals(other.getChezaibingxiang()))
            && (this.getWaiguanyanse() == null ? other.getWaiguanyanse() == null : this.getWaiguanyanse().equals(other.getWaiguanyanse()))
            && (this.getNeshiyansi() == null ? other.getNeshiyansi() == null : this.getNeshiyansi().equals(other.getNeshiyansi()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZm() == null) ? 0 : getZm().hashCode());
        result = prime * result + ((getPinpai() == null) ? 0 : getPinpai().hashCode());
        result = prime * result + ((getPinpai_id() == null) ? 0 : getPinpai_id().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getChexi() == null) ? 0 : getChexi().hashCode());
        result = prime * result + ((getChexi_id() == null) ? 0 : getChexi_id().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getCheming() == null) ? 0 : getCheming().hashCode());
        result = prime * result + ((getChexing_id() == null) ? 0 : getChexing_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getChangjia() == null) ? 0 : getChangjia().hashCode());
        result = prime * result + ((getNiankuan() == null) ? 0 : getNiankuan().hashCode());
        result = prime * result + ((getGengxin_time() == null) ? 0 : getGengxin_time().hashCode());
        result = prime * result + ((getShangshi_time() == null) ? 0 : getShangshi_time().hashCode());
        result = prime * result + ((getZhidaojia() == null) ? 0 : getZhidaojia().hashCode());
        result = prime * result + ((getJibie() == null) ? 0 : getJibie().hashCode());
        result = prime * result + ((getFadongji() == null) ? 0 : getFadongji().hashCode());
        result = prime * result + ((getBiansuxiang() == null) ? 0 : getBiansuxiang().hashCode());
        result = prime * result + ((getChangkuanggao() == null) ? 0 : getChangkuanggao().hashCode());
        result = prime * result + ((getJiegou() == null) ? 0 : getJiegou().hashCode());
        result = prime * result + ((getZuigaochesu() == null) ? 0 : getZuigaochesu().hashCode());
        result = prime * result + ((getGuangfang_jiasu() == null) ? 0 : getGuangfang_jiasu().hashCode());
        result = prime * result + ((getShice__jiasu() == null) ? 0 : getShice__jiasu().hashCode());
        result = prime * result + ((getZhidong() == null) ? 0 : getZhidong().hashCode());
        result = prime * result + ((getLidijianxi() == null) ? 0 : getLidijianxi().hashCode());
        result = prime * result + ((getZonghe_youhao() == null) ? 0 : getZonghe_youhao().hashCode());
        result = prime * result + ((getShice__youhao() == null) ? 0 : getShice__youhao().hashCode());
        result = prime * result + ((getBaozhiqi() == null) ? 0 : getBaozhiqi().hashCode());
        result = prime * result + ((getChangdu() == null) ? 0 : getChangdu().hashCode());
        result = prime * result + ((getKuandu() == null) ? 0 : getKuandu().hashCode());
        result = prime * result + ((getGaodu() == null) ? 0 : getGaodu().hashCode());
        result = prime * result + ((getZhoujv() == null) ? 0 : getZhoujv().hashCode());
        result = prime * result + ((getQianlun_jv() == null) ? 0 : getQianlun_jv().hashCode());
        result = prime * result + ((getHoulun_jv() == null) ? 0 : getHoulun_jv().hashCode());
        result = prime * result + ((getLidi_jianxi() == null) ? 0 : getLidi_jianxi().hashCode());
        result = prime * result + ((getChemenshu() == null) ? 0 : getChemenshu().hashCode());
        result = prime * result + ((getZuoweishu() == null) ? 0 : getZuoweishu().hashCode());
        result = prime * result + ((getYouxiang() == null) ? 0 : getYouxiang().hashCode());
        result = prime * result + ((getHoubeixiang() == null) ? 0 : getHoubeixiang().hashCode());
        result = prime * result + ((getHoumenkaiqi() == null) ? 0 : getHoumenkaiqi().hashCode());
        result = prime * result + ((getHuoxiangchichun() == null) ? 0 : getHuoxiangchichun().hashCode());
        result = prime * result + ((getZhengbeizhiliang() == null) ? 0 : getZhengbeizhiliang().hashCode());
        result = prime * result + ((getFadongjiaxinghao() == null) ? 0 : getFadongjiaxinghao().hashCode());
        result = prime * result + ((getPailiang() == null) ? 0 : getPailiang().hashCode());
        result = prime * result + ((getJinqixiangshi() == null) ? 0 : getJinqixiangshi().hashCode());
        result = prime * result + ((getQigangpailiexingshi() == null) ? 0 : getQigangpailiexingshi().hashCode());
        result = prime * result + ((getQigang() == null) ? 0 : getQigang().hashCode());
        result = prime * result + ((getMeigangqimenshu() == null) ? 0 : getMeigangqimenshu().hashCode());
        result = prime * result + ((getYasuobi() == null) ? 0 : getYasuobi().hashCode());
        result = prime * result + ((getPeiqijigou() == null) ? 0 : getPeiqijigou().hashCode());
        result = prime * result + ((getGangjing() == null) ? 0 : getGangjing().hashCode());
        result = prime * result + ((getXingcheng() == null) ? 0 : getXingcheng().hashCode());
        result = prime * result + ((getZuida_mali() == null) ? 0 : getZuida_mali().hashCode());
        result = prime * result + ((getZuida_gonglv() == null) ? 0 : getZuida_gonglv().hashCode());
        result = prime * result + ((getZuida_zhuansu() == null) ? 0 : getZuida_zhuansu().hashCode());
        result = prime * result + ((getZuida_niujv() == null) ? 0 : getZuida_niujv().hashCode());
        result = prime * result + ((getZuida_nuijvzhuansu() == null) ? 0 : getZuida_nuijvzhuansu().hashCode());
        result = prime * result + ((getTeyoujishhu() == null) ? 0 : getTeyoujishhu().hashCode());
        result = prime * result + ((getRanliaoxingshi() == null) ? 0 : getRanliaoxingshi().hashCode());
        result = prime * result + ((getRanyoubiaohao() == null) ? 0 : getRanyoubiaohao().hashCode());
        result = prime * result + ((getGongyoufangshi() == null) ? 0 : getGongyoufangshi().hashCode());
        result = prime * result + ((getGanggaicailiao() == null) ? 0 : getGanggaicailiao().hashCode());
        result = prime * result + ((getGangticailiao() == null) ? 0 : getGangticailiao().hashCode());
        result = prime * result + ((getHuanbaobiaozhuan() == null) ? 0 : getHuanbaobiaozhuan().hashCode());
        result = prime * result + ((getDianjia_leixing() == null) ? 0 : getDianjia_leixing().hashCode());
        result = prime * result + ((getDainji_zongguonglv() == null) ? 0 : getDainji_zongguonglv().hashCode());
        result = prime * result + ((getDianji_zongniujv() == null) ? 0 : getDianji_zongniujv().hashCode());
        result = prime * result + ((getQiandainji_zuidadonglv() == null) ? 0 : getQiandainji_zuidadonglv().hashCode());
        result = prime * result + ((getQiandainji_zuidaniujv() == null) ? 0 : getQiandainji_zuidaniujv().hashCode());
        result = prime * result + ((getHoutianji_zuidagonglv() == null) ? 0 : getHoutianji_zuidagonglv().hashCode());
        result = prime * result + ((getHoudainjia_zuidaniujv() == null) ? 0 : getHoudainjia_zuidaniujv().hashCode());
        result = prime * result + ((getXitong_zonghegonglv() == null) ? 0 : getXitong_zonghegonglv().hashCode());
        result = prime * result + ((getXitong_zongheniujv() == null) ? 0 : getXitong_zongheniujv().hashCode());
        result = prime * result + ((getQvdongdianjishu() == null) ? 0 : getQvdongdianjishu().hashCode());
        result = prime * result + ((getDianjibuqv() == null) ? 0 : getDianjibuqv().hashCode());
        result = prime * result + ((getDianchileixing() == null) ? 0 : getDianchileixing().hashCode());
        result = prime * result + ((getNengyuanleixing() == null) ? 0 : getNengyuanleixing().hashCode());
        result = prime * result + ((getXvhuanglicheng() == null) ? 0 : getXvhuanglicheng().hashCode());
        result = prime * result + ((getBaiFenBi() == null) ? 0 : getBaiFenBi().hashCode());
        result = prime * result + ((getXvhanglicheng() == null) ? 0 : getXvhanglicheng().hashCode());
        result = prime * result + ((getDainchirongliang() == null) ? 0 : getDainchirongliang().hashCode());
        result = prime * result + ((getYouhao() == null) ? 0 : getYouhao().hashCode());
        result = prime * result + ((getKuaichnegdainliang() == null) ? 0 : getKuaichnegdainliang().hashCode());
        result = prime * result + ((getChengdianzhnagjiage() == null) ? 0 : getChengdianzhnagjiage().hashCode());
        result = prime * result + ((getDangweishu() == null) ? 0 : getDangweishu().hashCode());
        result = prime * result + ((getBiansuxiangleixing() == null) ? 0 : getBiansuxiangleixing().hashCode());
        result = prime * result + ((getJiancheng() == null) ? 0 : getJiancheng().hashCode());
        result = prime * result + ((getQvdongfangshi() == null) ? 0 : getQvdongfangshi().hashCode());
        result = prime * result + ((getQianxuan_jialeixing() == null) ? 0 : getQianxuan_jialeixing().hashCode());
        result = prime * result + ((getHouxuan_jialeixing() == null) ? 0 : getHouxuan_jialeixing().hashCode());
        result = prime * result + ((getZhulileixing() == null) ? 0 : getZhulileixing().hashCode());
        result = prime * result + ((getChetijiegou() == null) ? 0 : getChetijiegou().hashCode());
        result = prime * result + ((getHouzhidong() == null) ? 0 : getHouzhidong().hashCode());
        result = prime * result + ((getHouzhidongleixing() == null) ? 0 : getHouzhidongleixing().hashCode());
        result = prime * result + ((getZhuchezhidong() == null) ? 0 : getZhuchezhidong().hashCode());
        result = prime * result + ((getQianluantai() == null) ? 0 : getQianluantai().hashCode());
        result = prime * result + ((getHouluantai() == null) ? 0 : getHouluantai().hashCode());
        result = prime * result + ((getBeitai() == null) ? 0 : getBeitai().hashCode());
        result = prime * result + ((getZhufuqilang() == null) ? 0 : getZhufuqilang().hashCode());
        result = prime * result + ((getCepaiqinang() == null) ? 0 : getCepaiqinang().hashCode());
        result = prime * result + ((getToubuqinang() == null) ? 0 : getToubuqinang().hashCode());
        result = prime * result + ((getXibuqinang() == null) ? 0 : getXibuqinang().hashCode());
        result = prime * result + ((getTaiyajiance() == null) ? 0 : getTaiyajiance().hashCode());
        result = prime * result + ((getLiangtaiya() == null) ? 0 : getLiangtaiya().hashCode());
        result = prime * result + ((getAnquandaitishi() == null) ? 0 : getAnquandaitishi().hashCode());
        result = prime * result + ((getISOFIX() == null) ? 0 : getISOFIX().hashCode());
        result = prime * result + ((getABS() == null) ? 0 : getABS().hashCode());
        result = prime * result + ((getZhidongfanpei() == null) ? 0 : getZhidongfanpei().hashCode());
        result = prime * result + ((getShachefuzhu() == null) ? 0 : getShachefuzhu().hashCode());
        result = prime * result + ((getQianyinlikongzhi() == null) ? 0 : getQianyinlikongzhi().hashCode());
        result = prime * result + ((getCheshenwendingkongzhi() == null) ? 0 : getCheshenwendingkongzhi().hashCode());
        result = prime * result + ((getBingxianfuzhu() == null) ? 0 : getBingxianfuzhu().hashCode());
        result = prime * result + ((getPianliyvjing() == null) ? 0 : getPianliyvjing().hashCode());
        result = prime * result + ((getZhudongshanchu() == null) ? 0 : getZhudongshanchu().hashCode());
        result = prime * result + ((getYieshixitong() == null) ? 0 : getYieshixitong().hashCode());
        result = prime * result + ((getPilaojiashi() == null) ? 0 : getPilaojiashi().hashCode());
        result = prime * result + ((getZhuchelieda() == null) ? 0 : getZhuchelieda().hashCode());
        result = prime * result + ((getDaocheyangxiang() == null) ? 0 : getDaocheyangxiang().hashCode());
        result = prime * result + ((getQuanqingshexaingtoou() == null) ? 0 : getQuanqingshexaingtoou().hashCode());
        result = prime * result + ((getDingsuxunhang() == null) ? 0 : getDingsuxunhang().hashCode());
        result = prime * result + ((getZishiyingyunhang() == null) ? 0 : getZishiyingyunhang().hashCode());
        result = prime * result + ((getZidongbuoche() == null) ? 0 : getZidongbuoche().hashCode());
        result = prime * result + ((getFadongjizhanting() == null) ? 0 : getFadongjizhanting().hashCode());
        result = prime * result + ((getZhidongjiashi() == null) ? 0 : getZhidongjiashi().hashCode());
        result = prime * result + ((getShangbuofuzhu() == null) ? 0 : getShangbuofuzhu().hashCode());
        result = prime * result + ((getZhidongzhuche() == null) ? 0 : getZhidongzhuche().hashCode());
        result = prime * result + ((getDoupohuanjiang() == null) ? 0 : getDoupohuanjiang().hashCode());
        result = prime * result + ((getKebianxuanjia() == null) ? 0 : getKebianxuanjia().hashCode());
        result = prime * result + ((getKongqixuanjia() == null) ? 0 : getKongqixuanjia().hashCode());
        result = prime * result + ((getDainceganyingxuanjia() == null) ? 0 : getDainceganyingxuanjia().hashCode());
        result = prime * result + ((getKebianzhuanxiangbi() == null) ? 0 : getKebianzhuanxiangbi().hashCode());
        result = prime * result + ((getDiandongtianchuang() == null) ? 0 : getDiandongtianchuang().hashCode());
        result = prime * result + ((getQuanjingtianchuang() == null) ? 0 : getQuanjingtianchuang().hashCode());
        result = prime * result + ((getYundongwaiguan() == null) ? 0 : getYundongwaiguan().hashCode());
        result = prime * result + ((getLuhejinlunquan() == null) ? 0 : getLuhejinlunquan().hashCode());
        result = prime * result + ((getDaindongxihemen() == null) ? 0 : getDaindongxihemen().hashCode());
        result = prime * result + ((getCehuamen() == null) ? 0 : getCehuamen().hashCode());
        result = prime * result + ((getDiandonghuobeixiang() == null) ? 0 : getDiandonghuobeixiang().hashCode());
        result = prime * result + ((getGanyinghoubeixing() == null) ? 0 : getGanyinghoubeixing().hashCode());
        result = prime * result + ((getChedingxinglijia() == null) ? 0 : getChedingxinglijia().hashCode());
        result = prime * result + ((getFadongjiadianzifangdao() == null) ? 0 : getFadongjiadianzifangdao().hashCode());
        result = prime * result + ((getChenenzhongkongsuo() == null) ? 0 : getChenenzhongkongsuo().hashCode());
        result = prime * result + ((getYaokongyaoshi() == null) ? 0 : getYaokongyaoshi().hashCode());
        result = prime * result + ((getWuyaoshiqidongxitong() == null) ? 0 : getWuyaoshiqidongxitong().hashCode());
        result = prime * result + ((getWuyaoshijinruxitong() == null) ? 0 : getWuyaoshijinruxitong().hashCode());
        result = prime * result + ((getYuanchengqidong() == null) ? 0 : getYuanchengqidong().hashCode());
        result = prime * result + ((getPizhifangxiangpan() == null) ? 0 : getPizhifangxiangpan().hashCode());
        result = prime * result + ((getFangxiangpantiaojieqi() == null) ? 0 : getFangxiangpantiaojieqi().hashCode());
        result = prime * result + ((getFangxiangpandiandongtiaojie() == null) ? 0 : getFangxiangpandiandongtiaojie().hashCode());
        result = prime * result + ((getDuogongnnegfangxiangpan() == null) ? 0 : getDuogongnnegfangxiangpan().hashCode());
        result = prime * result + ((getFxp_huandang() == null) ? 0 : getFxp_huandang().hashCode());
        result = prime * result + ((getFxp_jiare() == null) ? 0 : getFxp_jiare().hashCode());
        result = prime * result + ((getFxp_jiyi() == null) ? 0 : getFxp_jiyi().hashCode());
        result = prime * result + ((getDainnaoxianshiping() == null) ? 0 : getDainnaoxianshiping().hashCode());
        result = prime * result + ((getYiejingyibiaopan() == null) ? 0 : getYiejingyibiaopan().hashCode());
        result = prime * result + ((getHUD() == null) ? 0 : getHUD().hashCode());
        result = prime * result + ((getNenzhixingchejiluyi() == null) ? 0 : getNenzhixingchejiluyi().hashCode());
        result = prime * result + ((getZhudongjiangzao() == null) ? 0 : getZhudongjiangzao().hashCode());
        result = prime * result + ((getShoujiwuxianchengdian() == null) ? 0 : getShoujiwuxianchengdian().hashCode());
        result = prime * result + ((getZuoyicaizhi() == null) ? 0 : getZuoyicaizhi().hashCode());
        result = prime * result + ((getYongdongfenggezuoyi() == null) ? 0 : getYongdongfenggezuoyi().hashCode());
        result = prime * result + ((getZuoyigaoditiaojie() == null) ? 0 : getZuoyigaoditiaojie().hashCode());
        result = prime * result + ((getYaobuzhichengtiaojie() == null) ? 0 : getYaobuzhichengtiaojie().hashCode());
        result = prime * result + ((getJianbuzhichengtiaojie() == null) ? 0 : getJianbuzhichengtiaojie().hashCode());
        result = prime * result + ((getDiandongzuoyitiaojie() == null) ? 0 : getDiandongzuoyitiaojie().hashCode());
        result = prime * result + ((getJiaodutiaojie() == null) ? 0 : getJiaodutiaojie().hashCode());
        result = prime * result + ((getDierpaizuoyiyidong() == null) ? 0 : getDierpaizuoyiyidong().hashCode());
        result = prime * result + ((getHoupaizuoyidiandongtiaojie() == null) ? 0 : getHoupaizuoyidiandongtiaojie().hashCode());
        result = prime * result + ((getFujiashiketiaojie() == null) ? 0 : getFujiashiketiaojie().hashCode());
        result = prime * result + ((getDiandongzuoyijiyi() == null) ? 0 : getDiandongzuoyijiyi().hashCode());
        result = prime * result + ((getQianhoupaizuoyijiare() == null) ? 0 : getQianhoupaizuoyijiare().hashCode());
        result = prime * result + ((getQianhoupaizuoyidongfeng() == null) ? 0 : getQianhoupaizuoyidongfeng().hashCode());
        result = prime * result + ((getQianhoupaizuoyianmo() == null) ? 0 : getQianhoupaizuoyianmo().hashCode());
        result = prime * result + ((getDierpaidulizuoyi() == null) ? 0 : getDierpaidulizuoyi().hashCode());
        result = prime * result + ((getDisanpaizuoyi() == null) ? 0 : getDisanpaizuoyi().hashCode());
        result = prime * result + ((getHoupaizuoyifabfshi() == null) ? 0 : getHoupaizuoyifabfshi().hashCode());
        result = prime * result + ((getQianhouzhongyangfushou() == null) ? 0 : getQianhouzhongyangfushou().hashCode());
        result = prime * result + ((getHoupaibeijia() == null) ? 0 : getHoupaibeijia().hashCode());
        result = prime * result + ((getJiarezhilingbeijia() == null) ? 0 : getJiarezhilingbeijia().hashCode());
        result = prime * result + ((getGPS() == null) ? 0 : getGPS().hashCode());
        result = prime * result + ((getDingweihudongfuwu() == null) ? 0 : getDingweihudongfuwu().hashCode());
        result = prime * result + ((getZhongkongtai_daping() == null) ? 0 : getZhongkongtai_daping().hashCode());
        result = prime * result + ((getZhongkongtai_dapingchicun() == null) ? 0 : getZhongkongtai_dapingchicun().hashCode());
        result = prime * result + ((getZhongkongtai_xianshi() == null) ? 0 : getZhongkongtai_xianshi().hashCode());
        result = prime * result + ((getLanyachezaidianhu() == null) ? 0 : getLanyachezaidianhu().hashCode());
        result = prime * result + ((getShoujihulianyingshe() == null) ? 0 : getShoujihulianyingshe().hashCode());
        result = prime * result + ((getChelianwang() == null) ? 0 : getChelianwang().hashCode());
        result = prime * result + ((getChezaidianshi() == null) ? 0 : getChezaidianshi().hashCode());
        result = prime * result + ((getHoupaiyiejingping() == null) ? 0 : getHoupaiyiejingping().hashCode());
        result = prime * result + ((getDianyuan() == null) ? 0 : getDianyuan().hashCode());
        result = prime * result + ((getWaijieyinwuanjiekou() == null) ? 0 : getWaijieyinwuanjiekou().hashCode());
        result = prime * result + ((getCDDVD() == null) ? 0 : getCDDVD().hashCode());
        result = prime * result + ((getYinxhangpinpai() == null) ? 0 : getYinxhangpinpai().hashCode());
        result = prime * result + ((getYinxiangshuliang() == null) ? 0 : getYinxiangshuliang().hashCode());
        result = prime * result + ((getJinguangdeng() == null) ? 0 : getJinguangdeng().hashCode());
        result = prime * result + ((getYuanguangdeng() == null) ? 0 : getYuanguangdeng().hashCode());
        result = prime * result + ((getLED() == null) ? 0 : getLED().hashCode());
        result = prime * result + ((getZishiyingyuanjinguang() == null) ? 0 : getZishiyingyuanjinguang().hashCode());
        result = prime * result + ((getZidongtoudeng() == null) ? 0 : getZidongtoudeng().hashCode());
        result = prime * result + ((getZuangxhangfuzhudeng() == null) ? 0 : getZuangxhangfuzhudeng().hashCode());
        result = prime * result + ((getZhuangxhangdeng() == null) ? 0 : getZhuangxhangdeng().hashCode());
        result = prime * result + ((getQianweding() == null) ? 0 : getQianweding().hashCode());
        result = prime * result + ((getDadenggaodutijie() == null) ? 0 : getDadenggaodutijie().hashCode());
        result = prime * result + ((getDadengqingxizhuangzhi() == null) ? 0 : getDadengqingxizhuangzhi().hashCode());
        result = prime * result + ((getChennengfenweideng() == null) ? 0 : getChennengfenweideng().hashCode());
        result = prime * result + ((getDiandongchechaung() == null) ? 0 : getDiandongchechaung().hashCode());
        result = prime * result + ((getYijiangshangjiang() == null) ? 0 : getYijiangshangjiang().hashCode());
        result = prime * result + ((getFangjiashou() == null) ? 0 : getFangjiashou().hashCode());
        result = prime * result + ((getGereboli() == null) ? 0 : getGereboli().hashCode());
        result = prime * result + ((getHoushijingdiandongtiaojie() == null) ? 0 : getHoushijingdiandongtiaojie().hashCode());
        result = prime * result + ((getHoushijingjiare() == null) ? 0 : getHoushijingjiare().hashCode());
        result = prime * result + ((getNenwaihoushijingfangxuanyun() == null) ? 0 : getNenwaihoushijingfangxuanyun().hashCode());
        result = prime * result + ((getJiumeitichenenghoushijing() == null) ? 0 : getJiumeitichenenghoushijing().hashCode());
        result = prime * result + ((getHoushijingdiandongzhedie() == null) ? 0 : getHoushijingdiandongzhedie().hashCode());
        result = prime * result + ((getHoushijiangjiyi() == null) ? 0 : getHoushijiangjiyi().hashCode());
        result = prime * result + ((getZheyanglian() == null) ? 0 : getZheyanglian().hashCode());
        result = prime * result + ((getHoupaizheyanglian() == null) ? 0 : getHoupaizheyanglian().hashCode());
        result = prime * result + ((getHoupaiyinsiboli() == null) ? 0 : getHoupaiyinsiboli().hashCode());
        result = prime * result + ((getZheyangbanhuangzhuangjing() == null) ? 0 : getZheyangbanhuangzhuangjing().hashCode());
        result = prime * result + ((getHouyvshua() == null) ? 0 : getHouyvshua().hashCode());
        result = prime * result + ((getGanyingyvshu() == null) ? 0 : getGanyingyvshu().hashCode());
        result = prime * result + ((getKongtiaokongzhifangshi() == null) ? 0 : getKongtiaokongzhifangshi().hashCode());
        result = prime * result + ((getHoupaidulikongtiao() == null) ? 0 : getHoupaidulikongtiao().hashCode());
        result = prime * result + ((getHoupaichufengkou() == null) ? 0 : getHoupaichufengkou().hashCode());
        result = prime * result + ((getWendufenqvkongzhi() == null) ? 0 : getWendufenqvkongzhi().hashCode());
        result = prime * result + ((getHuafenguolv() == null) ? 0 : getHuafenguolv().hashCode());
        result = prime * result + ((getChezaijinghuaqi() == null) ? 0 : getChezaijinghuaqi().hashCode());
        result = prime * result + ((getChezaibingxiang() == null) ? 0 : getChezaibingxiang().hashCode());
        result = prime * result + ((getWaiguanyanse() == null) ? 0 : getWaiguanyanse().hashCode());
        result = prime * result + ((getNeshiyansi() == null) ? 0 : getNeshiyansi().hashCode());
        return result;
    }
}