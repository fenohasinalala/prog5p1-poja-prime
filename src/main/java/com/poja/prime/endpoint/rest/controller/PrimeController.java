package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.PrimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrimeController {
    private final PrimeService service;

    @GetMapping(value = "/new-prime")
    public String generateNewPrime(){
        return service.generateNewPrime().toString();
    }
}
