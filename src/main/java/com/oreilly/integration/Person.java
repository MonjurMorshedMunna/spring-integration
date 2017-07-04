package com.oreilly.integration;

/**
 * Created by Monjur-E-Morshed on 04-Jul-17.
 */
public class Person {
  private String firstName;

  private String lastName;

  private String phoneNumber;

  public Person(String pFirstName, String pLastName) {
    firstName = pFirstName;
    lastName = pLastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String pPhoneNumber) {
    phoneNumber = pPhoneNumber;
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

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
