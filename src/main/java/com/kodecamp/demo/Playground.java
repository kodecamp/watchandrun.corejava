
package com.kodecamp.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates the use of various collectors.
 */
public class Playground {

  public static void main(String args[]) {
    System.out.println("Begin : Main");
    List<Person> people = createPeople();
    people.forEach(System.out::println);
    System.out.println("End : Main");
  }

  private static List<Person> createPeople() {
    List<Person> people = new ArrayList<>();
    people.add(new Person("Chetan", new Address("Chennai", "Madras", "044001"), 32));
    return people;
  }

}
