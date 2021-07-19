package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestConsPerson {

	public static void main(String[] args) throws ParseException {
		ConsPerson cp=new ConsPerson("My","Father","Rays Tech Indore","12-10-2019");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Name is "+cp.getFirstName()+" "+cp.getLastName());
		System.out.println("First name is "+cp.getFirstName());
		System.out.println("Last name is "+cp.getLastName());
		System.out.println("Address is "+cp.getAddress());
		System.out.println("Date of Birth is "+sdf.format(cp.getDob()));
		
		
		
		
		
		

	}

}
