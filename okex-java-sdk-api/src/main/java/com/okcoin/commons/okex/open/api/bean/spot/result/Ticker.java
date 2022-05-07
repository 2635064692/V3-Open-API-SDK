package com.okcoin.commons.okex.open.api.bean.spot.result;

import lombok.Data;

@Data
public class Ticker {
    private String instType;		//产品类型
    private String instId	;	//产品ID
    private String last	;	//最新成交价
    private String lastSz	;	//最新成交的数量
    private String askPx	;	//卖一价
    private String askSz	;	//卖一价对应的数量
    private String bidPx	;	//买一价
    private String bidSz	;	//买一价对应的数量
    private String open24h	;	//24小时开盘价
    private String high24h	;	//24小时最高价
    private String low24h	;	//24小时最低价
    private String volCcy24h;	//24小时成交量，以币为单位

    private String vol24h;		//24小时成交量，以张为单位

    private String sodUtc0;		//UTC 0 时开盘价
    private String sodUtc8;		//UTC+8 时开盘价
    private String ts;	        //ticker数据产生时间，Unix时间戳的毫秒数格式，如 1597026383085
}
