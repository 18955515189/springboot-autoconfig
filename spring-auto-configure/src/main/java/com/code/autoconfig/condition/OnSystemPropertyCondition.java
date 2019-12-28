package com.code.autoconfig.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @Description 系统属性条件判断
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 0:40
 * @Version 1.0.0
 **/
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String propertyName = String.valueOf(attributes.get("name"));
        String propertyValue = String.valueOf(attributes.get("value"));

        String javaPropertyValue = System.getProperty(propertyName);

        return propertyValue.equals(javaPropertyValue);
    }
}
