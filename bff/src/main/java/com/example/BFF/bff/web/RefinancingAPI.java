package com.example.BFF.bff.web;

import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingInput;
import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingOutput;
import com.example.BFF.bff.domaine.entities.Refinancing;
import com.example.BFF.bff.service.Refinancing.RefinancingService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RefinancingAPI {

    private final RefinancingService refinancingService;


    public RefinancingOutput createRefinancing(RefinancingInput refinancingInput) {
        RefinancingOutput refinancingOutput = refinancingService.createRefinancing(refinancingInput);
        return refinancingOutput;
    }
}
