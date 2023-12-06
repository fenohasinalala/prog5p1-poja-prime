package com.poja.prime.repository;

import com.poja.prime.repository.model.PrimeNumber;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimeNumberRepository extends JpaRepository<PrimeNumber, String> {

  @Override
  List<PrimeNumber> findAll();

  List<PrimeNumber> findAllByOrderByGenerationDatetimeDesc();

  List<PrimeNumber> findPrimeNumbersBy();
}
