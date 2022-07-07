package com.example.BFF.bff.service.utils.HttpRequests;

import com.example.BFF.bff.domaine.entities.Refinancing;
import com.example.BFF.bff.service.utils.ApiPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OAuth2HttpClient implements HttpClient {

    private final RestTemplate restTemplate;

    public OAuth2HttpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String postRequest(String refinancingService, ApiPath refinancingCreate, Refinancing refinancing) {

        //Request
        RequestEntity<Object> request = RequestEntity
                .post(refinancingCreate.getPath())
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .body(refinancing);

        //Response
        ResponseEntity<String> response = restTemplate.exchange(
                refinancingCreate.getPath(),
                HttpMethod.POST,
                request,
                String.class
        );
        return response.getBody();
    }
}


