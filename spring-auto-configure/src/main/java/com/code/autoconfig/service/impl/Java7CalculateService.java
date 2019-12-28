package com.code.autoconfig.service.impl;

import com.code.autoconfig.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Description Java7 实现多整数求和
 * @Author 飞翔的胖哥
 * @SINCE 2019/12/17 0017 0:21
 * @Version 1.0.0
 **/
@Profile("Java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println(" Java7 实现多整数求和 ");
        Integer sum =0;
        for(Integer integer : values){
            sum+=integer;
        }
        return sum;
    }

    public static void main(String[] args){
        Java7CalculateService service = new Java7CalculateService();
        System.out.print(service.sum(1,2,3,4,5));


    }
}
