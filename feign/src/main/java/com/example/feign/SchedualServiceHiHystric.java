package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * @author huj
 * @create 2020-09-15 16:06
 */
@Component
public class SchedualServiceHiHystric implements GetHello {
    @Override
    public String sayHello(String name) {
        return "sorry"+name;
    }
}
