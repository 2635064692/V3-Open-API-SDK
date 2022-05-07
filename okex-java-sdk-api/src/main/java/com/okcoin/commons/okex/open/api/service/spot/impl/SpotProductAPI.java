package com.okcoin.commons.okex.open.api.service.spot.impl;

import com.alibaba.fastjson.JSONArray;
import com.okcoin.commons.okex.open.api.bean.spot.result.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface SpotProductAPI {

    //公共-获取币对信息
    @GET("/api/spot/v3/instruments")
    Call<List<Product>> getInstruments();

    //公共-获取深度数据
    @GET("/api/spot/v3/instruments/{instrument_id}/book")
    Call<Book> bookProductsByInstrumentId(@Path("instrument_id") String instrument_id,
                                          @Query("size") String size,
                                          @Query("depth") String depth);

    //公共-获取全部ticker信息
    /**
     * 产品类型
     * SPOT：币币
     * SWAP：永续合约
     * FUTURES：交割合约
     * OPTION：期权
     */
    @GET("/api/v5/market/tickers")
    Call<CommonResponse<Ticker>> getTickers(@Query("instType") String instType);

    //公共-获取某个ticker信息
    @GET("/api/v5/market/ticker")
    Call<CommonResponse<Ticker>> getTickerByInstrumentId(@Query("instId") String instId);

    //公共-获取成交数据
    @GET("/api/v5/market/history-candles?instId={instrument_id}")
    Call<List<Trade>> getTradesByInstrumentId(@Path("instrument_id") String instrument_id,
                                @Query("limit") String limit);

    //公共-获取K线数据
    @GET("/api/v5/market/history-candles")
    Call<CommonArrayResponse> getCandlesByInstrumentId(@Query("instId") String instrument_id,
                                          @Query("after") String end,
                                          @Query("before") String start,
                                          @Query("bar") String bar,
                                          @Query("limit") String limit);

    //公共-获取历史K线数据
    @GET("/api/spot/v3/instruments/{instrument_id}/history/candles")
    Call<JSONArray> getHistoryCandlesByInstrumentId(@Path("instrument_id") String instrument_id,
                                      @Query("start") String start,
                                      @Query("end") String end,
                                      @Query("granularity") String granularity,
                                      @Query("limit") String limit);

}
