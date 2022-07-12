package com.example.BFF.bff.domaine.support.GenericService;

import com.example.BFF.bff.domaine.service.utils.ClientUrlProperties;
import com.example.BFF.bff.domaine.service.utils.HttpRequests.HttpClient;

public class GenericService {

    protected final ClientUrlProperties clientUrlProperties;
    protected final HttpClient httpClient;

    public GenericService(ClientUrlProperties clientUrlProperties, HttpClient httpClient) {
        this.clientUrlProperties = clientUrlProperties;
        this.httpClient = httpClient;
    }
}
