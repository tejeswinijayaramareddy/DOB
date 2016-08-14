package DOB;
import junit.framework.TestCase;

public class Ts_ProcessInputTest extends TestCase {
		
	public static void test_positive() {
	ts_processInput input = new ts_processInput();	
		String result;
		result = input.parseInput("01/20/1990");//.parseInput("01/20/1990");
		String expectedResult = "Day:Saturday, zodiac sign:Aquarius";
		assertEquals(expectedResult, result);
		
	}
	
	public static void test_invalidMonth() {
	ts_processInput input = new ts_processInput();	
		String result;
		result = input.parseInput("13/21/1990");
		String expectedResult = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";
		assertEquals(expectedResult, result);
}
	
	public static void test_invalidDate() {
	ts_processInput input = new ts_processInput();	
		String result;
		result = input.parseInput("13/32/1990");
		String expectedResult = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";
		assertEquals(expectedResult, result);
}
	
	public static void test_invalidYear() {
	ts_processInput input = new ts_processInput();	
		String result;
		result = input.parseInput("13/30/10000");
		String expectedResult = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";
		assertEquals(expectedResult, result);
}
	public static void test_MaxYear() {
		ts_processInput input = new ts_processInput();	
			String result;
			result = input.parseInput("13/30/9999");
			String expectedResult = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";
			assertEquals(expectedResult, result);
	}

	public static void test_leapyeardate() {
		ts_processInput input = new ts_processInput();	
			String result;
			result = input.parseInput("02/29/2000");
			String expectedResult = "Day:Tuesday, zodiac sign:Pisces";
			assertEquals(expectedResult, result);
	}
	
	public static void test_Nonleapyeardate() {
		ts_processInput input = new ts_processInput();	
			String result;
			result = input.parseInput("02/29/2001");
			String expectedResult = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";
			assertEquals(expectedResult, result);
	}
	
	public static void test_NonFormattedInput() {
		ts_processInput input = new ts_processInput();	
			String result;
			result = input.parseInput("02-28-2001");
			String expectedResult = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";
			assertEquals(expectedResult, result);
	}
}
