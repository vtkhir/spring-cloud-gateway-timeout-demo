package com.timeout.demo.gateway;

import org.springframework.boot.test.web.reactive.server.WebTestClientBuilderCustomizer;
import org.springframework.stereotype.Component;
import org.springframework.test.web.reactive.server.WebTestClient.Builder;

import java.time.Duration;

@Component
public class WebTestClientCustomizer implements WebTestClientBuilderCustomizer {

    @Override
    public void customize(Builder builder) {
        builder.responseTimeout(Duration.ofSeconds(70));
    }

}
