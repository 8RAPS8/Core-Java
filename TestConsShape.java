package OOP;

public class TestConsShape {

	public static void main(String[] args) {
		ConsShape cc=new ConsCircle(5);
		ConsShape s= new ConsShape("Blue", 6);
		ConsShape cr= new ConsRectangle(20,30);
		
		System.out.println(cc.area());
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		System.out.println(cr.area());
		

	}

}
