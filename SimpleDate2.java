package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate2 {

	public static void main(String[] args) throws ParseException {
		// Simple date Format-2
		Date today= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MMMMMMM/yyyy");
		String newsdf = sdf.format(today);
		System.out.println("Format-2 :"+newsdf);
		
		Date pDate= sdf.parse("24/March/2020");
		System.out.println(pDate);
				
		

	}

}
