package OOP;

public class ConsCircle extends ConsShape {
	private int radius=0;
	
	public ConsCircle() {
		System.out.println("This is default constructor");
	}
	
	public ConsCircle(int r) {
		radius=r;	
	}
	
	public double area()
	{
		double ar = ConsShape.PI*radius*radius; 
		return ar;
	}
	
}
