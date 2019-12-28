package com.code.autoconfig.annotation;

import com.code.autoconfig.config.SayHelloConfig;
import com.code.autoconfig.config.SayHelloSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Description TODO
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/22 0022 1:17
 * @Version 1.0.0
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SayHelloSelector.class)
public @interface EnableSayHello {
}
