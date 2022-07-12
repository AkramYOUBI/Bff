package com.example.BFF.bff.domaine.service.utils;

import lombok.Getter;

@Getter
public enum ApiPath {

    REFINANCING_CREATE("http://localhost:8888/api/refinancing/save", "REFINANCING"),
    REFINANCING_FIND("http://localhost:8888/api/refinancing/find/{id}", "REFINANCING");





    private String path;
    private String microServiceName;

    ApiPath(String path, String microServiceName){
        this.path=path;
        this.microServiceName=microServiceName;
    }
}
