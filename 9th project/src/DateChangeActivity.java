import java.util.Date;
import java.text.DateFormat;
//import java.util.*;

public class DateChangeActivity {

	public static void main(String[] args) {
		
		Date now = new Date();
		//System.out.println(now.toString());
		//System.out.println(now.getTime());
	
		DateFormat dateFormat =  DateFormat.getDateInstance(DateFormat.LONG);
		String formattedDate = dateFormat.format(now);
		System.out.println(formattedDate);
		
		DateFormat shortTime =  DateFormat.getTimeInstance(DateFormat.SHORT);
		String ftime = shortTime.format(now);
		System.out.println(ftime);
		
		
		
		
	}

}