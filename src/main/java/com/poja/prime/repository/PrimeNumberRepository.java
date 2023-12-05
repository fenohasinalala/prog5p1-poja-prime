package com.poja.prime.repository;

import com.poja.prime.repository.model.PrimeNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimeNumberRepository extends JpaRepository<PrimeNumber, String> {

  @Override
  List<PrimeNumber> findAll();
}
