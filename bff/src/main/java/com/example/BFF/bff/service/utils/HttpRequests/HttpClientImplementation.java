package com.example.BFF.bff.service.utils.HttpRequests;

import com.example.BFF.bff.domaine.support.Refinancing;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.Map;

public class HttpClientImplementation implements HttpClient{

    private final RestTemplate restTemplate;

    public HttpClientImplementation(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String postRequest(String url, Object payload) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Refinancing> entity = new HttpEntity<Refinancing>((Refinancing) payload,headers);

        String response = restTemplate.exchange(
                "http://localhost:8080/api/refinancing/save", HttpMethod.POST, entity, String.class).getBody();
        return response;
    }
}
