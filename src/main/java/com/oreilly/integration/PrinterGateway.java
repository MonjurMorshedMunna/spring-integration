package com.oreilly.integration;

import org.springframework.messaging.Message;

import java.util.concurrent.Future;

/**
 * Created by Monjur-E-Morshed on 02-Jul-17.
 */
public interface PrinterGateway {
  public Future<Message<String>> print(Message<?> pMessage);
}
