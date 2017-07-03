package com.oreilly.integration;

import org.springframework.messaging.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Monjur-E-Morshed on 03-Jul-17.
 */
public class CustomSplitter {
  public List<String> splitMessage(Message<?> message) {
    return new ArrayList<String>(Arrays.asList(message.getPayload().toString().split(" ")));
  }
}
