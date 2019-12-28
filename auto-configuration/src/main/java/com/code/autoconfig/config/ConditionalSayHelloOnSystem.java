package com.code.autoconfig.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Description TODO
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/22 0022 1:25
 * @Version 1.0.0
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SayHelloOnSystem.class)
public @interface ConditionalSayHelloOnSystem {

    String name();

    String value();
}
