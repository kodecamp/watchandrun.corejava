package in.kodecamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test
  public void testApp() {
    System.out.println("Hello World");
    System.out.println("Done Hello World");
    assertEquals(5, 6, "");
  }
}
