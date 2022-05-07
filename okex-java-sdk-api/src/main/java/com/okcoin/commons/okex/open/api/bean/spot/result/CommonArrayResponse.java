package com.okcoin.commons.okex.open.api.bean.spot.result;

import com.alibaba.fastjson.JSONArray;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin_z by 2022/5/7
 * @ClassName CommonResponse
 */
public class CommonArrayResponse extends CommonResponse<JSONArray>{

    public <T> List<T> getArrayData(Class<T> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        List<JSONArray> data = getData();

        Field[] fields = clazz.getDeclaredFields();
        Class<?>[] classes = new Class[fields.length];
        for (int i = 0; i < fields.length; i++) {
            classes[i] = fields[i].getType();
        }

        List<T> results = new ArrayList<>();
        for (JSONArray item : data) {
            Object[] values = new Object[item.size()];
            for (int i = 0; i < item.size(); i++) {
                values[i] = item.get(i);
            }
            T s = clazz.getConstructor(classes).newInstance(values);
            results.add(s);
        }
        return results;
    }

}
