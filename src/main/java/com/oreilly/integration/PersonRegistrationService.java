package com.oreilly.integration;

/**
 * Created by Monjur-E-Morshed on 04-Jul-17.
 */
public class PersonRegistrationService {
  public void registerEmail(Person person) {
    System.out.println("Email created for: " + person.getFirstName());
  }
}
