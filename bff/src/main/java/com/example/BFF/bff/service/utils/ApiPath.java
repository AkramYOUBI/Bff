package com.example.BFF.bff.service.utils;

import lombok.Getter;

@Getter
public enum ApiPath {

    REFINANCING_CREATE("http://localhost:8080/api/refinancing/save", "REFINANCING");





    private String path;
    private String microServiceName;

    ApiPath(String path, String microServiceName){
        this.path=path;
        this.microServiceName=microServiceName;
    }
}
