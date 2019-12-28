package com.code.autoconfig.annotation;

import com.code.autoconfig.configuration.HelloWorldConfigration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfigration.class)
//@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
