import static org.junit.Assert.*;
import org.junit.Test;

public class TestCircleCalc {

	@Test
	public void testArea(){

		double expected = 12.56;
		assertEquals(expected, CircleCalc.areaCalc(2), 0.01);
	}

	@Test
	public void testCircumference(){
		double expected = 25.12;
		assertEquals(expected, CircleCalc.circumferenceCalc(4), 0.01);
	}

	public static void main(String... args) {
		jh61b.junit.TestRunner.runTests("all", TestCircleCalc.class);
	}
}
