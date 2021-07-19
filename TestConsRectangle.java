package OOP;

public class TestConsRectangle {

	public static void main(String[] args) {
		ConsShape cs=new ConsRectangle(2,5);
		ConsShape s= new ConsShape("Pink", 11);
		
		System.out.println(cs.area());
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		
	}

}
