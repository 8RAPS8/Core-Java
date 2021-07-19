package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException  {
		Person p= new Person();
		p.setName("Rahul");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d1= sdf.parse("22-10-2019");
		p.setDob(d1);
		Date ds=p.getDob();
		p.setAddress("Rays Tech Indore");
		System.out.println("Name : "+p.getName());
		System.out.println("DOB : "+sdf.format(ds));
		System.out.println("Address : "+p.getAddress());
		
	}

}
