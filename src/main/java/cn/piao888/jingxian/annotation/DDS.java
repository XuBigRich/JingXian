package cn.piao888.jingxian.annotation;

import cn.piao888.jingxian.enums.DataSourceType;

import java.lang.annotation.*;

/**
 * @Author： hongzhi.xu
 * @Date: 2020/7/28 7:05 下午
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface DDS {
    DataSourceType value() default  DataSourceType.MASTER;
}
