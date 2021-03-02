package com.kilopo.storefrontservice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
@RefreshScope
public class HealthCheckController {

    @Value("${my.test.value}")
    private String test;

    @GetMapping
    public Boolean healthCheck(){
        return true;
    }

    @GetMapping("/test")
    public String test() {
        return test;
    }
}
