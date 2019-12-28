package com.code.autoconfig.zeasydemo.compent;

import com.code.autoconfig.repository.MyFirstLevelRepository;
import com.code.autoconfig.repository.MySecondLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName RepositoryBootStrap
 * @Description 从仓储引导类
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/14 0014 16:55
 * @Version 1.0.0
 **/
@ComponentScan(basePackages = "com.code.autoconfig.repository")
public class RepositoryBootStrap {

    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        MySecondLevelRepository mySecondLevelRepository = context.getBean("mySecondLevelRepository", MySecondLevelRepository.class);
        System.out.println("myFirstLevelRepository Bean:"+myFirstLevelRepository);
        System.out.println("mySecondLevelRepository Bean:"+mySecondLevelRepository);

        context.close();

    }

}
