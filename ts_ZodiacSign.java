package DOB;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;


public class ts_ZodiacSign{
	String result ;
	public  String zodiacSign(String user_dateOfBirth)  {
		SimpleDateFormat myformat = new SimpleDateFormat("MM/dd/yyyy");
		myformat.setLenient(false);
		try {
		Date dt = myformat.parse(user_dateOfBirth);
		Calendar tj_calendar = Calendar.getInstance();
		tj_calendar.setTime(dt);
		int day = tj_calendar.get(Calendar.DAY_OF_MONTH);
		int month = tj_calendar.get(Calendar.MONTH);
		month = month +1;
		result = "";
	       if((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
	       {
	       		result = "Capricorn";
	       } 
	       else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
	       { 
	       		result = "Aquarius";
	       } 
	       else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
	       { 
	       		result = "Pisces";
	       }
	        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
	       { 
	        	result = "Aries";
	       }
	        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
	       {
	            result = "Taurus";
	       }
	       else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
	       { 
	        	 result = "Gemini";
	       }
	       else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
	       { 
	        	  result = "Cancer";
	       }
	       else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
	       {
	    	   	result = "Leo";
	       }
	       else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
	       {
	           		result = "Virgo";
	       }
	       else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
	       {
	           		result = "Libra";
	       }
	       else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
	       {	
	            	result = "scorpio";
	       }
	       else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
	       {
	            	result = "Sagittarius";
	       }
	       else 
	            	result = "Illegal date";
		
			} catch (ParseException e) {
			
			String error = " Exception: Expected input mm/dd/yyyy";
			return error;
				}
		return result;
	}
}
