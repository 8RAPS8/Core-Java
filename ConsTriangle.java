package OOP;

public class ConsTriangle extends ConsShape{
	 	private int height=0;
	 	private int base=0;
	 	
	 	public ConsTriangle() {
	 		System.out.println("This is default constructor");
	 	}
	 	
	 	public ConsTriangle(int h, int b) {
	 		height=h;
	 		base=b;
	 	}
	 	public double area() {
	 		double ar=base*height/2;
	 		return ar;
	 		
	 	}

}
