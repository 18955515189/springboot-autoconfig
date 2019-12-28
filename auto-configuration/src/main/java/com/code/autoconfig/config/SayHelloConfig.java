package com.code.autoconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/22 0022 1:19
 * @Version 1.0.0
 **/
@Configuration
public class SayHelloConfig {

    @Bean
    public String sayHello(){
        return "hello 2020";
    }

    @Bean
    public String sayHi(){
        return "hi 2020";
    }
}
