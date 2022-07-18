package com.example.BFF.bff.domaine.service.Refinancing;

import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingInput;
import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingOutput;
import com.example.BFF.bff.domaine.service.utils.ApiPath;
import com.example.BFF.bff.domaine.service.utils.HttpRequests.HttpClient;
import com.example.BFF.bff.domaine.support.GenericService.GenericService;
import com.example.BFF.bff.domaine.service.utils.ClientUrlProperties;

public class RefinancingService extends GenericService{

    public RefinancingService(ClientUrlProperties clientUrlProperties, HttpClient httpClient) {
        super(clientUrlProperties, httpClient);
    }


    public RefinancingOutput createRefinancing(RefinancingInput refinancingInput) {
        RefinancingOutput refinancingfromRefinancingService =
                httpClient.postRequest( "refinancingService", ApiPath.REFINANCING_CREATE ,refinancingInput);
        return refinancingfromRefinancingService;
    }

    public RefinancingOutput findRefinancing(String id) {
        RefinancingOutput refinancingfromRefinancingService =
                httpClient.getRequest( "refinancingService", ApiPath.REFINANCING_FIND ,id);
        return refinancingfromRefinancingService;
    }

    public RefinancingOutput updateRefinancing(String id, RefinancingInput newRefinancing) {
        RefinancingOutput refinancingOutputResults = null;
        RefinancingOutput refinancingfromRefinancingService =
                httpClient.getRequest( "refinancingService", ApiPath.REFINANCING_FIND ,id);
        if(refinancingfromRefinancingService != null){
            RefinancingOutput refinancingOutput =
                    httpClient.putRequest( "refinancingService", id, ApiPath.REFINANCING_UPDATE ,newRefinancing);
            refinancingOutputResults = refinancingOutput;
        }
        return refinancingOutputResults;
    }
}
