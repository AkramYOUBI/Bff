package com.example.BFF.bff.service.utils;

public enum ApiPath {

    REFINANCING_CREATE("/api/refinancing/save", "REFINANCING");

    String path;
    String microServiceName;

    ApiPath(String path, String microServiceName){
        this.path=path;
        this.microServiceName=microServiceName;
    }
}
