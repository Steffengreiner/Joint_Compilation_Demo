package life.qbic

/**
 * Senseless groovy class just to test for roovydocs joint compilation
 *
 * @author: Steffen Greiner
 */
class DummyGroovy {
    /** dummy string to save input into */
    private static String dummy = ""

    /** constructor calling business logic
     *
     * @param input input string to be passed to createOutput method
     */

    protected DummyGroovy(String input) {
        createOutput(input);
    }
    /**
    * Saves Input as internal string and throws error if input is not a string
    *
    * @param input the input string to be stored
    * @return console string output informing user of success or failure
    */
    private void createOutput(String input) {
        if (!(input.asType(String))) {
            throw new IllegalArgumentException("Please provide a String as Input!")
        } else {
            print("You did it!, The current saved string is: ", dummy, " and will be changed to ", input)
            dummy = input
        }
    }
}