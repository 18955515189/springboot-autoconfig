package com.code.autoconfig.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @ClassName HelloWorldConfigration
 * @Description HelloWorld配置
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/14 0014 23:32
 * @Version 1.0.0
 **/
public class HiWorldConfigration {

    @Bean
    public String hiWorld(){
        return "hiWorld配置2019";
    }
}
