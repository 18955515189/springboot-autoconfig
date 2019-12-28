package com.code.autoconfig.bootstrap;

import com.code.autoconfig.condition.ConditionalOnSystemProperty;
import com.code.autoconfig.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Description 系统属性条件引导类
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 0:46
 * @Version 1.0.0
 **/
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "Administrator")
    public String helloWorld(){
        return "helloWorld";
    }

    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        String helloWorld = context.getBean("helloWorld",String.class);

       System.out.println(" helloWorld Bean"+helloWorld);

        context.close();

    }

}
