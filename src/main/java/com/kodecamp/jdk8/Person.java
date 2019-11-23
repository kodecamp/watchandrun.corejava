package com.kodecamp.jdk8;

final class Person {

  private final String name;
  private final String city;
  private final int age;

  Person(String name, String city, int age) {
    this.name = name;
    this.city = city;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("[ Name = %s, city = %s, Age = %d ]", this.name, this.city, this.age);
  }

  // default methods
  String city() {
    return this.city;
  }

  String name() {
    return this.name;
  }

  int age() {
    return this.age;
  }

}
