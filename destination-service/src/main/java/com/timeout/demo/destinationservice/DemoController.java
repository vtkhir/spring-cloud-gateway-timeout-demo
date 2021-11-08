package com.timeout.demo.destinationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.apache.commons.lang3.StringUtils.repeat;

@RestController
@RequestMapping("/test")
public class DemoController {

    @GetMapping
    Map<String, Object> testEndpoint() throws InterruptedException {
        // Sleep to simulate some work
        Thread.sleep(200);
        var body = repeat("Z", 11000);
        return Map.of("test", body);
    }
}
