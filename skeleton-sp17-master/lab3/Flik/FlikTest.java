import jh61b.junit.TestRunner;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FlikTest{

    @Test(timeout = 1000)
    public void testHorribleSteve(){
        int A = 128;
        int B = 128;

        boolean expA = Flik.isSameNumber(A,B);

        assertTrue(expA);

    }
    public static void main(String... args) {
        jh61b.junit.TestRunner.runTests("all", FlikTest.class);
    }

}