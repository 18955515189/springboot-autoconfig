package com.code.autoconfig.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Description Java系统属性 条件判断
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 0:37
 * @Version 1.0.0
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {
    /**
     * 系统属性名称
     * @return
     */
    String name();

    /**
     * 系统属性值
     * @return
     */
    String value();
}
