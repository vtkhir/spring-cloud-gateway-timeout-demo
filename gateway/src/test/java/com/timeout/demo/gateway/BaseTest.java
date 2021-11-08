package com.timeout.demo.gateway;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.UUID;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@SpringBootTest(webEnvironment = DEFINED_PORT)
@AutoConfigureWebTestClient
public abstract class BaseTest {

    @Autowired
    WebTestClient webTestClient;
    String id;

    @BeforeEach
    void setUp() {
        id = UUID.randomUUID().toString();
    }
}
