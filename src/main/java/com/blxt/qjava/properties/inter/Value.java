package com.blxt.qjava.properties.inter;

import java.lang.annotation.*;

/**
 * 变量注释
 * @Author: Zhang.Jialei
 * @Date: 2020/9/25 16:44
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Value {
    String key() default "";
    boolean need() default false;
}
