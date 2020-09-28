package com.blxt.qjava.properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: Zhang.Jialei
 * @Date: 2020/9/28 20:09
 */
public class PropertiesDefault extends Properties {

    public PropertiesDefault(File file) throws IOException {
        checkNotNull(file, "包含属性的文件不能为空");

        FileReader in = new FileReader(file);
        load(in);
    }

    public String getStr(final String key) {
        final String value = getProperty(key);
        return value;
    }

    public Integer getInt(final String key) {
        checkNotNull(key, "获取属性的键不能为null");
        final String value = getProperty(key);
        return Integer.parseInt(value);
    }

    public Boolean getBoolean(final String key) {
        checkNotNull(key, "获取属性的键不能为null");
        final String value = getProperty(key);
        return "true".equals(value) || "TRUE".equals(value);
    }

    public Float getFloat(final String key) {
        checkNotNull(key, "获取属性的键不能为null");
        final String value = getProperty(key);

        return Float.parseFloat(value);
    }

    public Double getDouble(final String key) {
        checkNotNull(key, "获取属性的键不能为null");
        final String value = getProperty(key);
        return Double.parseDouble(value);
    }

    public Short getShort(final String key) {
        checkNotNull(key, "获取属性的键不能为null");
        final String value = getProperty(key);
        return Short.parseShort(value);
    }

    /**
     * 空值检查
     *
     * @param reference
     * @param errorMessage
     * @param <T>
     * @return
     */
    public static <T> T checkNotNull(T reference, java.lang.Object errorMessage) {
        if (reference == null) {
            throw new NullPointerException(String.valueOf(errorMessage));
        } else {
            return reference;
        }
    }

}
