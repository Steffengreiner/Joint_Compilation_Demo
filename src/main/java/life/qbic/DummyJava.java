package life.qbic;

/**
 * Senseless Java class to test for javadocs joint compilation
 *
 * @author: Steffen Greiner
 */
public class DummyJava {

  private static String dummy = "";

  protected DummyJava() {
  }

  protected DummyJava(String input) {
    createOutput(input);
  }

  private void createOutput(String input) {
    if (!(input instanceof String)) {
      throw new IllegalArgumentException("Please provide a String as Input!");
    } else {
      System.out.println(
          "You did it! The current saved string is: " + dummy + " and will be changed to " + input);
      dummy = input;
    }
  }
}
