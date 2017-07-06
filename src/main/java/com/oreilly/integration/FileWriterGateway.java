package com.oreilly.integration;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * Created by Monjur-E-Morshed on 06-Jul-17.
 */
public interface FileWriterGateway {

  public void write(@Header("fileName") String fileName, @Payload String message);

}
