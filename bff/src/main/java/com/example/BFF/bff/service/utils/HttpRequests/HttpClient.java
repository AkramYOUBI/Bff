package com.example.BFF.bff.service.utils.HttpRequests;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface HttpClient {

    String postRequest(String url, Object payload);
}
