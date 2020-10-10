package com.example.servicefeign.Feign;

import org.springframework.stereotype.Component;

/**
 * @author komiles@163.com
 * @date 2020-10-10 17:33
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry，"+name;
    }
}
