package com.example.BFF.bff.service.utils.HttpRequests;

import com.example.BFF.bff.service.utils.ApiPath;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

public class HttpClientImplementation implements HttpClient {

    private final RestTemplate restTemplate;
    private final ApiPath apiPath;

    public HttpClientImplementation(RestTemplate restTemplate, ApiPath apiPath) {
        this.restTemplate = restTemplate;
        this.apiPath = apiPath;
    }


    @Override
    public String postRequest(String baseUrl, ApiPath url, Object payload) {

        //Request
        RequestEntity<Object> request = RequestEntity
                .post(url.getPath())
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .body(payload);

        //Response
        ResponseEntity<String> response = restTemplate.exchange(
                url.getPath(),
                HttpMethod.POST,
                request,
                String.class
        );
        return response.getBody();
    }
}


