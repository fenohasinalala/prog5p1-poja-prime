package com.poja.prime.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.poja.prime.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {

  @Autowired PrimeController primeController;

  @Test
  void can_read_from_dummy_table() {
    String tempResult = primeController.generateNewPrime();
    BigInteger actual = new BigInteger(tempResult);
    int certainty = 70;
    assertTrue(actual.isProbablePrime(certainty));
  }
}
