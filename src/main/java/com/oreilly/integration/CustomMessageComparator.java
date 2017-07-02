package com.oreilly.integration;

import org.springframework.messaging.Message;

import java.util.Comparator;

/**
 * Created by Monjur-E-Morshed on 02-Jul-17.
 */
public class CustomMessageComparator implements Comparator<Message<String>> {
  @Override
  public int compare(Message<String> o1, Message<String> o2) {
    String payload1 = o1.getPayload();
    String payload2 = o2.getPayload();

    boolean isPayLoadEven = Integer.valueOf(payload1.substring(payload1.length() - 1)) % 2 == 0;
    boolean isPayLoad2Even = Integer.valueOf(payload2.substring(payload2.length() - 1)) % 2 == 0;
    if ((isPayLoadEven && isPayLoad2Even) || (!isPayLoad2Even && !isPayLoadEven))
      return 0;
    else if (isPayLoadEven)
      return -1;
    else
      return 1;
  }
}
