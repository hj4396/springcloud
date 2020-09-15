package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author huj
 * @create 2020-09-08 16:34
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello(String name){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name="+name,String.class);
    }

}
