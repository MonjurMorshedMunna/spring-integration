package com.oreilly.integration;

import org.springframework.messaging.Message;

/**
 * Created by Monjur-E-Morshed on 02-Jul-17.
 */
public class UppercasePrintService {
  public void print(Message<String> message) {
    System.out.println(message.getPayload().toUpperCase());
  }
}
