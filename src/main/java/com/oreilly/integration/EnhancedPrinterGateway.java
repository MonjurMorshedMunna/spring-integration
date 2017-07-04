package com.oreilly.integration;

import org.springframework.util.concurrent.ListenableFuture;

/**
 * Created by Monjur-E-Morshed on 04-Jul-17.
 */
public interface EnhancedPrinterGateway {
  public void print(Person person);

  public ListenableFuture<String> uppercase(Person person);
}
