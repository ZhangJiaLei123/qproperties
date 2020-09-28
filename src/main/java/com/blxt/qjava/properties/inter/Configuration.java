package com.blxt.qjava.properties.inter;

import java.lang.annotation.*;

/**
 * 类注释
 * @Author: Zhang.Jialei
 * @Date: 2020/9/25 17:33
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Configuration {

    String value() default "";

    boolean proxyBeanMethods() default true;
}
