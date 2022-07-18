package com.example.BFF.bff.domaine.service.utils.HttpRequests;

import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingInput;
import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingOutput;
import com.example.BFF.bff.domaine.service.utils.ApiPath;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OAuth2HttpClient implements HttpClient {

    private final RestTemplate restTemplate;

    public OAuth2HttpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public RefinancingOutput postRequest(String refinancingService, ApiPath refinancingCreate, RefinancingInput refinancingInput) {

        //Request
        RequestEntity<Object> request = RequestEntity
                .post(refinancingCreate.getPath())
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .body(refinancingInput);

        //Response
        ResponseEntity<RefinancingOutput> response = restTemplate.exchange(
                refinancingCreate.getPath(),
                HttpMethod.POST,
                request,
                RefinancingOutput.class
        );
        return response.getBody();
    }

    @Override
    public RefinancingOutput getRequest(String refinancingService, ApiPath refinancingFind, String id) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //Request
        HttpEntity<Object> request = new HttpEntity<>(headers);


        //Response
        ResponseEntity<RefinancingOutput> response = restTemplate.exchange(
                refinancingFind.getPath()+id,
                HttpMethod.GET,
                request,
                RefinancingOutput.class
        );
        return response.getBody();
    }

    @Override
    public RefinancingOutput putRequest(String refinancingService, String id, ApiPath refinancingUpdate, RefinancingInput newRefinancing) {
        //Request
        RequestEntity<Object> request = RequestEntity
                .put(refinancingUpdate.getPath())
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .body(newRefinancing);

        //Response
        ResponseEntity<RefinancingOutput> response = restTemplate.exchange(
                refinancingUpdate.getPath()+id,
                HttpMethod.PUT,
                request,
                RefinancingOutput.class
        );
        return response.getBody();
    }
}


