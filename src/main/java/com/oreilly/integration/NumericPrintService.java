package com.oreilly.integration;

import org.springframework.messaging.Message;

/**
 * Created by Monjur-E-Morshed on 03-Jul-17.
 */
public class NumericPrintService {
  public void print(Message<?> message) {
    System.out.println("Printing the numeric:" + message.getPayload());
  }
}
