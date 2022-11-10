package com.okcoin.commons.okex.open.api.test.spot;

import com.alibaba.fastjson.JSON;
import com.okcoin.commons.okex.open.api.bean.spot.result.*;
import com.okcoin.commons.okex.open.api.service.spot.SpotProductAPIService;
import com.okcoin.commons.okex.open.api.service.spot.impl.SpotProductAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class SpotProductAPITest extends SpotAPIBaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(SpotProductAPITest.class);

    private SpotProductAPIService spotProductAPIService;

    @Before
    public void before() {
        this.config = this.config();
        this.spotProductAPIService = new SpotProductAPIServiceImpl(this.config);
    }

    /**
     * 公共-获取币对信息
     * GET /api/spot/v3/instruments
     */
    @Test
    public void getInstruments() {
        final List<Product> products = this.spotProductAPIService.getInstruments();
        this.toResultString(SpotProductAPITest.LOG, "products", products);
    }

    /**
     * 公共-获取深度数据
     * GET /api/spot/v3/instruments/<instrument_id>/book
     */
    @Test
    public void bookProductsByProductId() {
        final Book book = this.spotProductAPIService.bookProductsByInstrumentId("BTC-USDT", "100", "0.1");
        this.toResultString(SpotProductAPITest.LOG, "book", book);

    }

    /**
     * 公共-获取全部ticker信息
     * GET /api/spot/v3/instruments/ticker
     */
    @Test
    public void getTickers() {
        List<Ticker> tickers = this.spotProductAPIService.getTickers();

        System.out.println(JSON.toJSONString(tickers));
    }

    /**
     * 公共-获取某个ticker信息
     * GET /api/spot/v3/instruments/<instrument-id>/ticker
     */
    @Test
    public void getTickerByInstrumentId() {
        final List<Ticker> ticker = this.spotProductAPIService.getTickerByInstrumentId("GALA-USDT");
        this.toResultString(SpotProductAPITest.LOG, "ticker", ticker);
    }

    /**
     * 公共-获取成交数据
     * GET /api/spot/v3/instruments/<instrument_id>/trades
     */
    @Test
    public void getTradesByInstrumentId() {
        final List<Trade> trades = this.spotProductAPIService.getTradesByInstrumentId("XRP-USDT", "20");
        this.toResultString(SpotProductAPITest.LOG, "trades", trades);
    }

    /**
     * 公共-获取K线数据
     * GET /api/spot/v3/instruments/<instrument_id>/candles
     */
    @Test
    public void getCandlesByInstrumentId() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        String start = "1653957164000";
        String end = "1653962514000";
//        String start = null;
//        String end = null;
        final List<CandlesHistoryVO> klines = this.spotProductAPIService.getCandlesByInstrumentId("GALA-USDT", end, null, "30m","1");
        this.toResultString(SpotProductAPITest.LOG, "klines", klines);
    }


    /**
     * 公共-获取历史K线数据
     * GET /api/spot/v3/instruments/<instrument_id>/history/candles
     */
    @Test
    public void getHistoryCandlesByInstrumentId() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
            String start = "2020-04-26T14:14:00.000Z";
            String end = "2020-04-25T14:13:00.000Z";
//        String start = null;
//        String end = null;
            final List<CandlesHistoryVO> klines = this.spotProductAPIService.getHistoryCandlesByInstrumentId("BTC-USDT", start, end, "900", null);
            this.toResultString(SpotProductAPITest.LOG, "HistoryCandles", klines);
    }



}
