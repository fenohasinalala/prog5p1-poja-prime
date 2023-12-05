package com.poja.prime.service;

import com.poja.prime.repository.PrimeNumberRepository;
import com.poja.prime.repository.model.PrimeNumber;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class PrimeService {

    private final PrimeNumberRepository repository;
    public String generateNewPrime() {
        int bitLength = 3_750;
        Random randomParameter = new Random();
        String generated = BigInteger.probablePrime(bitLength, randomParameter).toString();
        return save(generated).getValue();
    }

    public List<PrimeNumber> get10LastGeneratedNumber(){
        return repository.findAll();
    }

    public PrimeNumber save(String primeNumber){
        PrimeNumber toSave = PrimeNumber.builder()
                .value(primeNumber).build();
        return repository.save(toSave);
    }
}
