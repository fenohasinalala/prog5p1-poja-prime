package com.poja.prime.service;

import com.poja.prime.repository.PrimeNumberRepository;
import com.poja.prime.repository.model.PrimeNumber;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimeService {

  private final PrimeNumberRepository repository;

  public String generateNewPrime() {
    int bitLength = 1_000;
    Random randomParameter = new Random();
    String generated = BigInteger.probablePrime(bitLength, randomParameter).toString();
    return save(generated).getValue();
  }

  public List<String> get10LastGeneratedNumber() {
    List<PrimeNumber> last10 = repository.findAllByOrderByGenerationDatetimeDesc().subList(0, 10);
    return last10.stream().map(PrimeNumber::getValue).toList();
  }

  public PrimeNumber save(String primeNumber) {
    PrimeNumber toSave = PrimeNumber.builder().value(primeNumber).build();
    return repository.save(toSave);
  }
}
