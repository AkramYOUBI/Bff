package com.example.BFF.bff.domaine.support.GenericService;

import com.example.BFF.bff.service.utils.ClientUrlProperties;
import com.example.BFF.bff.service.utils.HttpRequests.HttpClient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericService {

    private ClientUrlProperties clientUrlProperties;
    private HttpClient httpClient;

    public GenericService(ClientUrlProperties clientUrlProperties, HttpClient httpClient){
        this.clientUrlProperties=clientUrlProperties;
        this.httpClient=httpClient;
    }

}
