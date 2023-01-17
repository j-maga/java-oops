package predefLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ArrList2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		Calendar cal = Calendar.getInstance();
		System.out.println("Current date:"+cal.getTime());
		String formattedDate = sdf.format(cal.getTime());
		System.out.println("Formatted date:" + formattedDate);
	}
}