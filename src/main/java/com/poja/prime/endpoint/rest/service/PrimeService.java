package com.poja.prime.endpoint.rest.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
@AllArgsConstructor
public class PrimeService {
    public BigInteger generateNewPrime() {
        int bitLength = 10_000;
        Random randomParameter = new Random();
        return BigInteger.probablePrime(bitLength,randomParameter);
    }
}
