package DOB;
import junit.framework.TestCase;

public class Ts_ZodiacSignTest extends TestCase{

	public void test_Capricorn() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Capricorn";
		String result = zodiacSign.zodiacSign("01/19/1990");
		assertEquals(expectedresult, result);
	}
	
	public void test_Aquarius() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Aquarius";
		String result = zodiacSign.zodiacSign("01/20/1990");
		assertEquals(expectedresult, result);
	}

	public void test_Pisces() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Pisces";
		String result = zodiacSign.zodiacSign("02/19/1990");
		assertEquals(expectedresult, result);
	}

	
	public void test_Aries() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Aries";
		String result = zodiacSign.zodiacSign("03/21/1990");
		assertEquals(expectedresult, result);
	}

	
	public void test_Taurus() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Taurus";
		String result = zodiacSign.zodiacSign("04/20/1990");
		assertEquals(expectedresult, result);
	}

	
	public void test_Gemini() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Gemini";
		String result = zodiacSign.zodiacSign("05/21/1990");
		assertEquals(expectedresult, result);
	}

	
	public void test_Cancer() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Cancer";
		String result = zodiacSign.zodiacSign("06/21/1990");
		assertEquals(expectedresult, result);
	}

	
	public void test_Leo() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Leo";
		String result = zodiacSign.zodiacSign("07/23/1990");
		assertEquals(expectedresult, result);
	}

	public void test_Virgo() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Virgo";
		String result = zodiacSign.zodiacSign("08/23/1990");
		assertEquals(expectedresult, result);
	}
	
	
	public void test_Libra() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Libra";
		String result = zodiacSign.zodiacSign("09/23/1990");
		assertEquals(expectedresult, result);
	}
	
	public void test_Scorpio() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "scorpio";
		String result = zodiacSign.zodiacSign("10/23/1990");
		assertEquals(expectedresult, result);
	}
	
	public void test_Sagittarius() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = "Sagittarius";
		String result = zodiacSign.zodiacSign("11/22/1990");
		assertEquals(expectedresult, result);
	}
	
	public void test_Invalid() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = " Exception: Expected input mm/dd/yyyy";
		String result = zodiacSign.zodiacSign("13/22/2016");
		assertEquals(expectedresult, result);
	}
	
	public void test_Unknowninput() {
		ts_ZodiacSign zodiacSign = new ts_ZodiacSign();
		String expectedresult = " Exception: Expected input mm/dd/yyyy";
		String result = zodiacSign.zodiacSign("xyz");
		assertEquals(expectedresult, result);
	}


}
