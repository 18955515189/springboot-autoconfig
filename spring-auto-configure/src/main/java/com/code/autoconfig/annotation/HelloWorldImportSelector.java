package com.code.autoconfig.annotation;

import com.code.autoconfig.configuration.HelloWorldConfigration;
import com.code.autoconfig.configuration.HiWorldConfigration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description HelloWorld 实现
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/14 0014 23:48
 * @Version 1.0.0
 **/
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfigration.class.getName(),HiWorldConfigration.class.getName()};
    }
}
