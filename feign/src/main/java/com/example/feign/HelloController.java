package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huj
 * @create 2020-09-08 16:55
 */
@RestController
public class HelloController {
    @Autowired
    private GetHello getHello;

    @GetMapping("/hello")
    public String getHello(String name){
        return getHello.sayHello(name);
    }
}
