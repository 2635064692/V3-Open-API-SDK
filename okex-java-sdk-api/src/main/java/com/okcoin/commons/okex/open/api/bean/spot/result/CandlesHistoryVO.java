package com.okcoin.commons.okex.open.api.bean.spot.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author admin_z by 2022/5/7
 * @ClassName CandlesHistoryVO
 */
@Data
@AllArgsConstructor
public class CandlesHistoryVO {

    private String ts	;	//数据生成的时间，Unix时间戳的毫秒数格式，如 1597026383085
    private String o	;	//开盘价格
    private String h	;	//最高价格
    private String l	;	//最低价格
    private String c	;	//收盘价格
    private String vol	;	//交易量，以张为单位
    private String volCcy;		//交易量，以币为单位
}
