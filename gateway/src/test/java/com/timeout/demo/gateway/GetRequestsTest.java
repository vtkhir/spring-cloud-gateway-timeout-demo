package com.timeout.demo.gateway;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.http.MediaType;

class GetRequestsTest extends BaseTest {

    @RepeatedTest(value = 200)
    void executeGet() {
        webTestClient.get()
            .uri("/api/timeout-scg/test?id={id}", id)
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk();
	}

}
