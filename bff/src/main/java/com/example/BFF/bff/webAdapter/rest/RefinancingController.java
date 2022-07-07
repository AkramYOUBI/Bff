package com.example.BFF.bff.webAdapter.rest;

import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingInput;
import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingOutput;
import com.example.BFF.bff.domaine.entities.Refinancing;
import com.example.BFF.bff.service.Refinancing.RefinancingService;
import com.example.BFF.bff.web.RefinancingAPI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/refinancing")
public class RefinancingController extends RefinancingAPI {


    public RefinancingController(RefinancingService refinancingService) {
        super(refinancingService);
    }

    @PostMapping("/save")
    public RefinancingOutput createRefinancing(@RequestBody RefinancingInput refinancingInput){
        RefinancingOutput refinancingOutput = super.createRefinancing(refinancingInput);
        return refinancingOutput;
    }
}
