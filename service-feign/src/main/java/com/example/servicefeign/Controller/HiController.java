package com.example.servicefeign.Controller;

import com.example.servicefeign.Feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-10-10 16:20
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        System.out.println("service-feign start");
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
