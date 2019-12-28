package com.code.autoconfig.bootstrap;

import com.code.autoconfig.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description EnableHelloWorld 引导类
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/14 0014 23:34
 * @Version 1.0.0
 **/
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String hiWorld = context.getBean("hiWorld",String.class);

        System.out.println("hiWorld Bean:"+hiWorld);

        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean:"+helloWorld);

        context.close();

    }
}
