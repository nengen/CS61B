import static org.junit.Assert.*;

import org.junit.Test;

public class maxValueTest {
	@Test
	public void testMax(){
		int [] initialArray = {1,15,2,99};
		int maxValueOfArray = 99;
		int testResult = maxValue.max(initialArray);
		assertEquals(testResult, maxValueOfArray);

	}
	public static void main(String... args) {
		jh61b.junit.textui.runClasses(maxValueTest.class);
	}
}
