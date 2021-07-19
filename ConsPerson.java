package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsPerson {
	private String firstName=null;
	private String lastName=null;
	private String address=null;
	private Date dob=null;
	
	public ConsPerson(){
		System.out.println("This is default constructor");
		}
	public ConsPerson(String fn,String ln, String add, String d) throws ParseException  {
		firstName=fn;
		lastName=ln;
		address=add;
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date d1= sdf.parse(d);
		dob=d1;		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public Date getDob() {
		return dob;
	}
	

	
}
