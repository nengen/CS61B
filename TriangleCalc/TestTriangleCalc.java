import static org.junit.Assert.*;
import org.junit.Test;

public class TestTriangleCalc {

	@Test
	public void testFindSIde(){

		double expected = 5.0;
		assertEquals(expected, TriangleCalc.findSide(3.0,4.0,0.0), 0.001);
	}

	public static void main(String... args) {
		jh61b.junit.TestRunner.runTests("all", TestTriangleCalc.class);
	}
}
