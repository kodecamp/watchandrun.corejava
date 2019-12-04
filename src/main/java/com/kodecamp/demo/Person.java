package com.kodecamp.demo;

final class Person {

  private final String name;
  private final Address address;
  private final int age;

  Person(String name, Address address, int age) {

    this.name = name;
    this.address = address;
    this.age = age;
  }

  // default methods
  Address address() {
    return this.address;
  }

  String name() {
    return this.name;
  }

  int age() {
    return this.age;
  }

  @Override
  public String toString() {
    return String.format("[Name=%s, address=%s, Age=%d]", this.name, this.address, this.age);
  }

}
