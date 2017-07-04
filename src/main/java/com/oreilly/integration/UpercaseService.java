package com.oreilly.integration;

/**
 * Created by Monjur-E-Morshed on 04-Jul-17.
 */
public class UpercaseService {
  public String execute(Person person) {
    return (person.getFirstName() + " " + person.getLastName()).toUpperCase();
  }
}
