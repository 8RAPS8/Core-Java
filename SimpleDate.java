package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDate {

	public static void main(String[] args) throws Exception {
		Date today= new Date();
				SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yyyy");
		String strDate= format1.format(today);
		System.out.println("Format#1:"+ strDate);
		
		String str="11-02-1993";
		Date d1=format1.parse(str);
		System.out.println(d1);
		System.err.println("Date entered is out of Range");
		
	}

}
