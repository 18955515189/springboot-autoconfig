package com.code.autoconfig.bootstrap;

import com.code.autoconfig.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description 计算服务
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 0:28
 * @Version 1.0.0
 **/
@SpringBootApplication(scanBasePackages = "com.code.autoconfig.service.impl")
public class CalculateServiceBootstrap {

    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println(" calculateService sum(1,2,3,4,5)="+calculateService.sum(1,2,3,4,5));

        context.close();

    }
}
