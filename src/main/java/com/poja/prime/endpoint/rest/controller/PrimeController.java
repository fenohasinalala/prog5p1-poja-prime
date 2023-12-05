package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.repository.model.PrimeNumber;
import com.poja.prime.service.PrimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PrimeController {
    private final PrimeService service;

    @GetMapping(value = "/new-prime")
    public String generateNewPrime(){
        return service.generateNewPrime();
    }
    @GetMapping(value = "/generated-primes")
    public List<PrimeNumber> showGeneratedPrimes(){
        return service.get10LastGeneratedNumber();
    }
}
