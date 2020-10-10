package com.example.servicefeigntest.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author komiles@163.com
 * @date 2020-10-10 16:47
 */
@Component
@FeignClient(value = "service-hi")
public interface DemoFeign {

    @GetMapping("/hi")
    String getName(@RequestParam(value = "s") String name);
}
