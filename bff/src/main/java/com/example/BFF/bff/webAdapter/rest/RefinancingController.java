package com.example.BFF.bff.webAdapter.rest;

import com.example.BFF.bff.domaine.support.Refinancing;
import com.example.BFF.bff.service.Refinancing.RefinancingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/refinancing")
public class RefinancingController {

    private RefinancingService refinancingService;

    public RefinancingController(RefinancingService refinancingService) {
        this.refinancingService = refinancingService;
    }

    @PostMapping("/save")
    public String createRefinancing(@RequestBody Refinancing refinancing){
        String refinancingdb = refinancingService.createRefinancing(refinancing);
        return refinancingdb;
    }
}
