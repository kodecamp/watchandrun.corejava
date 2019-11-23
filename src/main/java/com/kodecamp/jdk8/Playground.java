
package com.kodecamp.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates the use of various collectors.
 */
public class Playground {

  public static void main(String args[]) {
    System.out.println("===Begin : Main ===");
    List<Person> people = createPeople();
    people.forEach(System.out::println);
  }

  private static List<Person> createPeople() {
    List<Person> people = new ArrayList<>();
    people.add(new Person("Chetan", "Chennai", 32));
    people.add(new Person("Chinmay Dd", "Chennai", 30));
    people.add(new Person("Dinesh D", "Delhi", 32));
    people.add(new Person("Durga P", "Delhi", 30));
    people.add(new Person("Lucky", "Lucknow", 32));
    people.add(new Person("Lakhan", "Lucknow", 30));
    return people;
  }

}
