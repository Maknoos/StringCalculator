package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testSingleString(){
		assertEquals(3,Calculator.add("3"));
	}
	@Test
	public void testTwoStrings(){
		assertEquals(7,Calculator.add("4,3"));
	}
}