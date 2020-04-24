package in.kodecamp;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

  private final String name = "Hello";

  public static void main(String[] args) {
    String[] names = { "Sunil", "Sushil", "Rakesh", "Dinesh" };
    System.out.println("Hello");
    for (String string : names) {
      System.out.println("Hello World");
      System.out.prin
    }
    // @formatter:off
    Arrays.stream(names)
      .map(s -> s.toUpperCase())
      .forEach(System.out::println);
    if(true) {
      return;
    }
  }

  /**
   * Sample
   */
  public class Sample {


  }
}
