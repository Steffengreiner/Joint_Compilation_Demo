package life.qbic

/**
 * Senseless groovy class just to test for roovydocs joint compilation
 *
 * @author: Steffen Greiner
 */
class DummyGroovy {

    private static String dummy = ""

    protected DummyGroovy() {}

    protected DummyGroovy(String input) {
        createOutput(input);
    }

    private void createOutput(String input) {
        if (!(input.asType(String))) {
            throw new IllegalArgumentException("Please provide a String as Input!")
        } else {
            print("You did it!, The current saved string is: ", dummy, " and will be changed to ", input)
            dummy = input
        }
    }
}