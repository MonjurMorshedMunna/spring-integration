package com.oreilly.integration;

/**
 * Created by Monjur-E-Morshed on 04-Jul-17.
 */
public class Person {
  private int id;

  private String firstName;

  private String lastName;


  public Person(int pId, String pFirstName, String pLastName) {
    id = pId;
    firstName = pFirstName;
    lastName = pLastName;
  }

  public int getId() {
    return id;
  }

  public void setId(int pId) {
    id = pId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String pFirstName) {
    firstName = pFirstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String pLastName) {
    lastName = pLastName;
  }


}
