package com.code.autoconfig.configuration;

import com.code.autoconfig.annotation.EnableHelloWorld;
import com.code.autoconfig.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloWorld自动装配
 * @Description HelloWorld配置
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/14 0014 23:32
 * @Version 1.0.0
 **/
@Configuration //Spring模式注解
@EnableHelloWorld //Spring Enable模块装配
@ConditionalOnSystemProperty(name = "user.name",value = "Administrator") //条件装配
public class HelloWorldAutoConfigration {
}
