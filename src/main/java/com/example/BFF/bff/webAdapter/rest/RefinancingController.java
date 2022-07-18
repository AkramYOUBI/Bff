package com.example.BFF.bff.webAdapter.rest;

import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingInput;
import com.example.BFF.bff.domaine.RefinancingDTOs.RefinancingOutput;
import com.example.BFF.bff.domaine.service.Refinancing.RefinancingService;
import com.example.BFF.bff.web.RefinancingAPI;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/find/{id}")
    public RefinancingOutput findRefinancing(@PathVariable String id){
        RefinancingOutput refinancingOutput = super.findRefinancing(id);
        return refinancingOutput;
    }
    @PutMapping("/update/{id}")
    public RefinancingOutput updateRefinancing(@PathVariable String id, @RequestBody RefinancingInput refinancingInput ){
        RefinancingOutput refinancingOutput = super.updateRefinancing(id, refinancingInput);
        return  refinancingOutput;
    }
}
