package com.tdp.ms.recruitmentservice.expose;

import java.util.HashMap;
import java.util.Map;

import com.tdp.ms.recruitmentservice.model.RecruitmentserviceRequest;
import com.tdp.ms.recruitmentservice.model.RecruitmentserviceResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@SpringBootTest
@AutoConfigureWebTestClient(timeout = "20000")
public class RecruitmentserviceControllerTest {

    @Autowired
    private WebTestClient webClient;

    private static Map<String, RecruitmentserviceResponse> recruitmentserviceResponseMap = new HashMap<>();
    private static Map<String, RecruitmentserviceRequest> recruitmentserviceRequestMap = new HashMap<>();

    @BeforeAll
    public static void setup() {
        recruitmentserviceResponseMap.put("get", new RecruitmentserviceResponse("Hello world!"));
        recruitmentserviceResponseMap.put("post", new RecruitmentserviceResponse("User created!"));
        recruitmentserviceRequestMap.put("post", new RecruitmentserviceRequest("User"));
        recruitmentserviceRequestMap.put("empty", new RecruitmentserviceRequest(""));
    }

    @Test
    public void indexGetTest() {
        webClient.get()
            .uri("/recruitmentservice/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header("request-id","550e8400-e29b-41d4-a716-446655440000")
            .header("request-date","2019-08-01T17:15:20.509-0400")
            .exchange()
            .expectStatus().isOk()
            .expectBody(RecruitmentserviceResponse.class)
            .isEqualTo(recruitmentserviceResponseMap.get("get"));
    }

    @Test
    public void indexPostTest() {
        webClient.post()
            .uri("/recruitmentservice/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header("request-id","550e8400-e29b-41d4-a716-446655440000")
            .header("request-date","2019-08-01T17:15:20.509-0400")
            .body(BodyInserters.fromValue(recruitmentserviceRequestMap.get("post")))
            .exchange()
            .expectStatus().isEqualTo(HttpStatus.CREATED)
            .expectBody(RecruitmentserviceResponse.class)
            .isEqualTo(recruitmentserviceResponseMap.get("post"));
    }

    @Test
    public void validationRequestTest() {
        webClient.post()
            .uri("/recruitmentservice/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header("request-id","550e8400-e29b-41d4-a716-446655440000")
            .header("request-date","2019-08-01T17:15:20.509-0400")
            .body(BodyInserters.fromValue(recruitmentserviceRequestMap.get("empty")))
            .exchange()
            .expectStatus().isBadRequest()
            .expectBody()
                .jsonPath("$.code").isEqualTo("TL9999")
                .jsonPath("$.description").isEqualTo("Sin descripcion configurada.")
                .jsonPath("$.errorType").isEqualTo("Technical")
                .jsonPath("$.exceptionDetails[0].component").isEqualTo("recruitmentservice")
                .jsonPath("$.exceptionDetails[0].description")
                    .isEqualTo("name " + RecruitmentserviceRequest.MSG_NOT_EMPTY);
    }
}
