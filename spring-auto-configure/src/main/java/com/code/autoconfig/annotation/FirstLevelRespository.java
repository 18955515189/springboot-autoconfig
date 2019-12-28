package com.code.autoconfig.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 一级 {@link Repository @Repository}
 * @ClassName FirstLevelRespository
 * @Description 测试元标注的派生性 第一级Repository
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/14 16:49
 * @Version 1.0.0
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRespository {
    String value() default "";
}
