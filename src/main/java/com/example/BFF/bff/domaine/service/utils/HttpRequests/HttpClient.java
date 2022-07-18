package com.example.BFF.bff.domaine.service.utils.HttpRequests;

import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingInput;
import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingOutput;
import com.example.BFF.bff.domaine.service.utils.ApiPath;

public interface HttpClient {

    RefinancingOutput postRequest(String refinancingService, ApiPath refinancingCreate, RefinancingInput refinancingInput);

    RefinancingOutput getRequest(String refinancingService, ApiPath refinancingFind, String id);

    RefinancingOutput putRequest(String refinancingService, String id, ApiPath refinancingUPDATE, RefinancingInput newRefinancing);
}
