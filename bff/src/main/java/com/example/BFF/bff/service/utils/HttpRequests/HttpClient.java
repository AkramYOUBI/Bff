package com.example.BFF.bff.service.utils.HttpRequests;

import com.example.BFF.bff.service.utils.ApiPath;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface HttpClient {

    String postRequest(String baseUrl, ApiPath url, Object payload);
}
