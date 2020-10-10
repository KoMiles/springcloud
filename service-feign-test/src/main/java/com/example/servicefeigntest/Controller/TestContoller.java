package com.example.servicefeigntest.Controller;

import com.example.servicefeigntest.Feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-10-10 16:51
 */
@RestController
public class TestContoller {

    @Autowired
    private DemoFeign demoFeign;

    @GetMapping("/demo")
    public String testDemo(@RequestParam String name){
        return demoFeign.getName(name);
    }
}
