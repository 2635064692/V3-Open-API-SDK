package com.okcoin.commons.okex.open.api.bean.spot.result;

import lombok.Data;

import java.util.List;

/**
 * @author admin_z by 2022/5/7
 * @ClassName CommonResponse
 */
@Data
public class CommonResponse<T> {

    private String code;

    private String msg;

    private List<T> data;

    public List<T> getResult(){
        return data;
    };

    public boolean isOk() {
        return "0".equals(code);
    }
}
