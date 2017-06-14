import static org.junit.Assert.*;
import org.junit.Test;

public class TestClosestToZero {
	@Test
	public void testSorterOnPositiveInts(){
		int [] initialArray = {1,15,2,99};
		int answer = 1;
		int testResult = closestToZero.calculateClosest(initialArray);
		assertEquals(testResult, answer);

	}

	@Test
	public void testSorterOnNegativeInts(){
		int [] initialArray = {-1, -15, -2, -99};
		int answer = -1;
		int testResult = closestToZero.calculateClosest(initialArray);
		assertEquals(testResult, answer);
	}

	@Test
	public void testEqualIntegers(){
		int [] initialArray = {-1,1};
		int answer = 1;
		int testResult = closestToZero.calculateClosest(initialArray);
		assertEquals(testResult, answer);
	}

	@Test
	public void testZeroInput(){
		int [] initialArray = {};
		int answer = 0;
		int testResult = closestToZero.calculateClosest(initialArray);
		assertEquals(testResult, answer);
	}

	public static void main(String... args) {
		jh61b.junit.textui.runClasses(TestClosestToZero.class);
	}
}
