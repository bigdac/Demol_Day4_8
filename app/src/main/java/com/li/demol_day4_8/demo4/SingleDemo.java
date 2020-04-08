package com.li.demol_day4_8.demo4;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ${Li}
 * 版本：1.0
 * 创建日期：2020/4/8 22
 * 描述：单例模式内部容器
 */
public class SingleDemo {
    private static Map<String, Object> objectMap = new HashMap<>();

    static {
        objectMap.put("mDemo", new SingleDemo());
    }

    private SingleDemo() {

    }

    public static Object getObjectMap(String key) {
        return objectMap.get(key);
    }
}

