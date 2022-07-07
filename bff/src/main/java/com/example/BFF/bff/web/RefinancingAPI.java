package com.example.BFF.bff.web;

import com.example.BFF.bff.domaine.entities.Refinancing;
import com.example.BFF.bff.service.Refinancing.RefinancingService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RefinancingAPI {

    private final RefinancingService refinancingService;

    public String createRefinancing(Refinancing refinancing) {
        return refinancingService.createRefinancing(refinancing);
    }
}
