package life.qbic;

/**
 * Senseless Java class to test for javadocs joint compilation
 *
 * @author: Steffen Greiner
 */
public class DummyJava {
  /** dummy string to save input into */
  private static String dummy = "";

  protected DummyJava() {
  }

  /** constructor calling business logic
   *
   * @param input input string to be passed to createOutput method
   */

  protected DummyJava(String input) {
    createOutput(input);
  }
  /**
   * Saves Input as internal string and throws error if input is not a string
   *
   * @param input the input string to be stored
   * @return console string output informing user of success or failure
   */

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
