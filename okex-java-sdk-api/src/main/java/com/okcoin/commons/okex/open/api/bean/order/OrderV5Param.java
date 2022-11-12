package com.okcoin.commons.okex.open.api.bean.order;

public class OrderV5Param {

//    {
//        "instId":"BTC-USDT",
//            "tdMode":"cash",
//            "clOrdId":"b15",
//            "side":"buy",
//            "ordType":"limit",
//            "px":"2.15",
//            "sz":"2"
//    }

    //产品ID，如 BTC-USD-190927-5000-C
    private String instId;
    //交易模式
    //保证金模式：isolated：逐仓 ；cross：全仓
    //非保证金模式：cash：非保证金
    private String tdMode;
    //客户自定义订单ID
    private String clOrdId;
    //订单方向
    //buy：买， sell：卖
    private String side;
    //订单类型
    //market：市价单
    //limit：限价单
    //post_only：只做maker单
    //fok：全部成交或立即取消
    //ioc：立即成交并取消剩余
    //optimal_limit_ioc：市价委托立即成交并取消剩余（仅适用交割、永续）
    private String ordType;
    //委托价格，仅适用于limit、post_only、fok、ioc类型的订单
    private String px;
    //委托数量
    private String sz;

    public static OrderV5Param initTest() {
        OrderV5Param orderV5Param = new OrderV5Param();
        orderV5Param.setInstId("BTC-USDT");
        orderV5Param.setTdMode("cash");
        orderV5Param.setClOrdId("b15");
        orderV5Param.setSide("buy");
        orderV5Param.setOrdType("limit");
        orderV5Param.setPx("2.15");
        orderV5Param.setSz("2");
        return orderV5Param;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getTdMode() {
        return tdMode;
    }

    public void setTdMode(String tdMode) {
        this.tdMode = tdMode;
    }

    public String getClOrdId() {
        return clOrdId;
    }

    public void setClOrdId(String clOrdId) {
        this.clOrdId = clOrdId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }
}
