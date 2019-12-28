package com.code.autoconfig.service.impl;

import com.code.autoconfig.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @Description Java8 实现多整数求和
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 0:21
 * @Version 1.0.0
 **/
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println(" Java8 实现多整数求和 ");
        int sum = Stream.of(values).reduce(0,Integer::sum);
        return sum;
    }

    public static void main(String[] args){
        Java8CalculateService service = new Java8CalculateService();
        System.out.print(service.sum(1,2,3,4,5));


    }
}
