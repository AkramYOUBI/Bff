package com.example.BFF.bff.service.Refinancing;

import com.example.BFF.bff.domaine.entities.Refinancing;
import com.example.BFF.bff.domaine.support.GenericService.GenericService;
import com.example.BFF.bff.service.utils.ApiPath;
import com.example.BFF.bff.service.utils.ClientUrlProperties;
import com.example.BFF.bff.service.utils.HttpRequests.HttpClient;


public class RefinancingService extends GenericService{

    public RefinancingService(ClientUrlProperties clientUrlProperties, HttpClient httpClient) {
        super(clientUrlProperties, httpClient);
    }

    public String createRefinancing(Refinancing refinancing) {
        String refinancingfromRefinancingService =
                httpClient.postRequest( "refinancingService",ApiPath.REFINANCING_CREATE ,refinancing);
        return refinancingfromRefinancingService;
    }
}
