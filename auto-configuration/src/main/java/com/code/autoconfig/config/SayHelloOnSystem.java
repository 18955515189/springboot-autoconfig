package com.code.autoconfig.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @Description TODO
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/22 0022 1:29
 * @Version 1.0.0
 **/
public class SayHelloOnSystem implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalSayHelloOnSystem.class.getName());

        String propertyName = String.valueOf(attributes.get("name"));
        String propertyValue = String.valueOf(attributes.get("value"));

        String javaPropertyValue = System.getProperty(propertyName);

        return propertyValue.equals(javaPropertyValue);
    }
}
