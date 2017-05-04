/**
 *  Tests the Planet constructor.
 */
public class TestPlanetConstructor {

    /**
     *  Tests the Planet constructor to make sure it's working correctly.
     */
    public static void main(String[] args) {
        checkPlanetConstructor();
    }

    /**
     *  Checks whether or not two Doubles are equal and prints the result.
     *
     *  @param  expected    Expected double
     *  @param  actual      Double received
     *  @param  label   Label for the 'test' case
     */
    private static void checkEquals(double expected, double actual, String label) {
        if (expected == actual) {
            System.out.println("PASS: " + label + ": Expected " + expected + " and you gave " + actual);
        } else {
            System.out.println("FAIL: " + label + ": Expected " + expected + " and you gave " + actual);
        }
    }

    /**
     *  Checks whether or not two Strings are equal and prints the result.
     *  @param  expected    Expected String
     *  @param  actual      String received
     *  @param  label   Label for the 'test' case
     */
    private static void checkStringEquals(String expected, String actual, String label) {
        if (expected.equals(actual)) {
            System.out.println("PASS: " + label + ": Expected " + expected + " and you gave " + actual);
        } else {
            System.out.println("FAIL: " + label + ": Expected " + expected + " and you gave " + actual);
        }
    }

    /**
     *  Checks Planet constructors to make sure they are setting instance
     *  variables correctly.
     */
    private static void checkPlanetConstructor() {
        System.out.println("Checking Planet constructor...");

        double x = 1.0,
               y = 2.0,
               xVelocity = 3.0,
               yVelocity = 4.0,
               mass = 5.0;

        String img = "jupiter.gif";

        Planet p = new Planet(x, y, xVelocity, yVelocity, mass, img);

        checkEquals(x, p.x, "x");
        checkEquals(y, p.y, "y");
        checkEquals(xVelocity ,p.xVelocity, "xVelocity");
        checkEquals(yVelocity, p.yVelocity, "yVelocity");
        checkEquals(mass, p.mass, "mass");
        checkStringEquals(img, p.img, "path to image");

        Planet pCopy = new Planet(p);
        checkEquals(p.x, pCopy.x, "x");
        checkEquals(p.y, pCopy.y, "y");
        checkEquals(p.xVelocity, pCopy.xVelocity, "xVelocity");
        checkEquals(p.yVelocity, pCopy.yVelocity, "yVelocity");
        checkEquals(p.mass, pCopy.mass, "mass");
        checkStringEquals(p.img, pCopy.img, "path to image");
    }
}
