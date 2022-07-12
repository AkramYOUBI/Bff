package com.example.BFF.bff.serviceAdapter;

import com.example.BFF.bff.domaine.service.Refinancing.RefinancingService;
import com.example.BFF.bff.domaine.service.utils.ClientUrlProperties;
import com.example.BFF.bff.domaine.service.utils.HttpRequests.HttpClient;
import org.springframework.stereotype.Service;

@Service
public class RefinancingServiceAdapter extends RefinancingService {

    public RefinancingServiceAdapter(ClientUrlProperties clientUrlProperties, HttpClient httpClient) {
        super(clientUrlProperties, httpClient);
    }
}