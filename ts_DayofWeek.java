package DOB;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;

public class ts_DayofWeek {

	public  String dayOfWeek(String user_dateOfBirth)  {
		String[] days = {"Invalid", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		try {
			SimpleDateFormat myformat = new SimpleDateFormat("MM/dd/yyyy");
			myformat.setLenient(false);			
			Date dt = myformat.parse(user_dateOfBirth);
			Calendar tj_calendar = Calendar.getInstance();
			tj_calendar.setTime(dt);
			int tj_day = tj_calendar.get(Calendar.DAY_OF_WEEK);
			String out = days[tj_day];
			return out;
			
		} catch (ParseException e) {
			String error = " Exception: Expected input mm/dd/yyyy ";
			return error;
		}
	}
}

