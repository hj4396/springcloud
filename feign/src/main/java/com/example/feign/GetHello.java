package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huj
 * @create 2020-09-08 16:50
 */
@FeignClient(value = "service-hello",fallback = SchedualServiceHiHystric.class)
public interface GetHello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name);
}
