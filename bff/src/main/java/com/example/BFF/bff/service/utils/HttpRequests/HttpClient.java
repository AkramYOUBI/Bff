package com.example.BFF.bff.service.utils.HttpRequests;

import com.example.BFF.bff.domaine.entities.Refinancing;
import com.example.BFF.bff.service.utils.ApiPath;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface HttpClient {

    String postRequest(String refinancingService, ApiPath refinancingCreate, Refinancing refinancing);
}
