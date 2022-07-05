package com.example.BFF.bff.service.Refinancing;

import com.example.BFF.bff.domaine.support.Refinancing;
import com.example.BFF.bff.service.utils.ApiPath;
import com.example.BFF.bff.service.utils.HttpRequests.HttpClient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Getter
@Setter
public class RefinancingService {

    private HttpClient httpClient;
    private RestTemplate restTemplate;


    public String createRefinancing(Refinancing refinancing) {
        String refinancingfromRefinancingService =
                httpClient.postRequest("http://localhost:8080/api/refinancing/save",refinancing);
        return refinancingfromRefinancingService;
    }
}
