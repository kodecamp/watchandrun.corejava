package com.kodecamp.demo;

/**
 * Address
 */
public class Address {

  private final String city;
  private final String state;
  private final String pinCode;

  protected Address(final String city, final String state, final String pinCode) {
    this.city = city;
    this.state = state;
    this.pinCode = pinCode;
  }

  public String city() {
    return this.city;
  }

  public String state() {
    return this.state;
  }

  public String pinCode() {
    return this.pinCode;
  }

  @Override
  public String toString() {
    return String.format("[State=%s, City=%s, Pincode=%s]", this.state, this.city, this.pinCode);
  }
}
