package DOB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class ts_processInput {
	
	String  out1;                         
	String  out2;
	String error;
	public  String parseInput(String user_dateOfBirth)
	{
					
	try {		
		SimpleDateFormat myformat = new SimpleDateFormat("MM/dd/yyyy");
		myformat.setLenient(false);		
		Date dt = myformat.parse(user_dateOfBirth);
		Calendar tj_calendar = new GregorianCalendar();//Calendar.getInstance();
		tj_calendar.setTime(dt);		
	}
 catch (ParseException e) {
	String error = " Exception: Invalid date entered, Expected input mm/dd/yyyy ";	
	if(user_dateOfBirth == null || user_dateOfBirth == ""){
		error = "No date of birth entered";
		return error;
	}
	return error;
}
	ts_DayofWeek tj_dayOfWeek = new ts_DayofWeek();
	out1 = tj_dayOfWeek.dayOfWeek(user_dateOfBirth);
	
	ts_ZodiacSign tj_ZodiacSign = new ts_ZodiacSign();
  	 out2 = tj_ZodiacSign.zodiacSign(user_dateOfBirth);
  	 
	return ("Day:" + out1 + ", zodiac sign:" + out2);	
}
}