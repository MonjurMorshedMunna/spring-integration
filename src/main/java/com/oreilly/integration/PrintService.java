package com.oreilly.integration;

import org.springframework.messaging.Message;

import java.util.Map;

/**
 * Created by Monjur-E-Morshed on 02-Jul-17.
 */
public class PrintService {

  public void print(Message<?> pMessage) {/*
    MessageHeaders headers = pMessage.getHeaders();
    for (Map.Entry<String, Object> entry : headers.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }*/

    System.out.println(pMessage.getPayload());
    for (Map.Entry<String, Object> entry : pMessage.getHeaders().entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

}
