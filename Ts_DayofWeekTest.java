package DOB;
import junit.framework.TestCase;

public class Ts_DayofWeekTest extends TestCase { 

	public static void test_Sunday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Sunday";
		resultday = day.dayOfWeek("07/17/2016") ;
		assertEquals(expectedresult, resultday);
		
	}

	public static void test_Monday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Monday";
		resultday = day.dayOfWeek("07/18/2016") ;
		assertEquals(expectedresult, resultday);
		
	}
	
	public static void test_Tuesday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Tuesday";
		resultday = day.dayOfWeek("07/19/2016") ;
		assertEquals(expectedresult, resultday);
		
	}
	
	public static void test_Wednesday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Wednesday";
		resultday = day.dayOfWeek("07/20/2016") ;
		assertEquals(expectedresult, resultday);
		
	}
	
	public static void test_Thursday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Thursday";
		resultday = day.dayOfWeek("07/21/2016") ;
		assertEquals(expectedresult, resultday);
		
	}

	public static void test_Friday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Friday";
		resultday = day.dayOfWeek("07/22/2016") ;
		assertEquals(expectedresult, resultday);
		
	}
	
	public static void test_Saturday() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = "Saturday";
		resultday = day.dayOfWeek("07/23/2016") ;
		assertEquals(expectedresult, resultday);
		
	}
	
	public static void test_Negativetest() {
		ts_DayofWeek day = new ts_DayofWeek();
		String resultday;
		String expectedresult = " Exception: Expected input mm/dd/yyyy ";
		resultday = day.dayOfWeek("07/32/2016") ;
		assertEquals(expectedresult, resultday);
		
	}
	
}
	
