package com.code.autoconfig.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description EnableAutoConfiguration引导类
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 21:25
 * @Version 1.0.0
 **/
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean:"+helloWorld);

        context.close();
    }

}
