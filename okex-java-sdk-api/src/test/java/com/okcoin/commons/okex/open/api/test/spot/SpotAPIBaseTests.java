package com.okcoin.commons.okex.open.api.test.spot;

import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.enums.I18nEnum;
import com.okcoin.commons.okex.open.api.test.BaseTests;

public class SpotAPIBaseTests extends BaseTests {

    public APIConfiguration config() {
        final APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.okx.com/");

        //d77a65ab-54eb-4794-a0e9-eb2ae702591e
        config.setApiKey("d77a65ab-54eb-4794-a0e9-eb2ae702591e");
        config.setSecretKey("20EC29F68F6C4449BE01E820DA796625");
        config.setPassphrase("zhangHAI413.14");

        config.setPrint(true);
        /*config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);*/
        config.setI18n(I18nEnum.ENGLISH);

        return config;
    }

}
