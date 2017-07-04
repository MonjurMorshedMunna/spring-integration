package com.oreilly.integration;

import org.springframework.messaging.Message;

/**
 * Created by Monjur-E-Morshed on 04-Jul-17.
 */
public class CustomTransformer {
  public String transform(Message<String> message) {
    String[] tokens = message.getPayload().split(" ");
    return tokens[1] + ", " + tokens[0];
  }
}
