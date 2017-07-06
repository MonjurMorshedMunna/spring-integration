package com.oreilly.integration;

import org.springframework.messaging.Message;

/**
 * Created by Monjur-E-Morshed on 06-Jul-17.
 */
public class MessagePrinter {

  public void print(Message<?> pMessage) {
    System.out.println("Printing the message:");
    System.out.println(pMessage);
  }
}
