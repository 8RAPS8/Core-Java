package OOP;

public class TestConsCircle  {
			public static void main(String[] args) 
			{
				ConsCircle c = new ConsCircle(2);
				ConsShape s = new ConsShape("Red", 8);
						
				System.out.println(s.getBorderWidth());
				System.out.println(s.getColor());
				System.out.println(c.area());
			}

	
}
