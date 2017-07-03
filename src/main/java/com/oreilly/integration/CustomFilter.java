package com.oreilly.integration;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

/**
 * Created by Monjur-E-Morshed on 03-Jul-17.
 */
public class CustomFilter implements MessageSelector {
  @Override
  public boolean accept(Message<?> message) {

    return message.getPayload().equals(7);
  }
}
