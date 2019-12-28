package com.code.autoconfig;

import com.code.autoconfig.annotation.EnableSayHello;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description TODO
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/22 0022 1:16
 * @Version 1.0.0
 **/
@EnableSayHello
public class Bootstrap {

    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Bootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String sayHi = context.getBean("sayHi", String.class);
        System.out.println(" sayHi Bean :"+sayHi);

        context.close();

    }

}
