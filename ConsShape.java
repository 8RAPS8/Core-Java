package OOP;

public class ConsShape  {
	private String color=null;
	private int borderWidth=0 ;
	public static final double PI=3.14;
	public ConsShape() {
		System.out.println("This is default constructor");
	}
	public ConsShape(String c,int bw) {
		color=c;
		borderWidth=bw;
	}
	 
	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}
	
	public double area() {
		return 0.0;
	}
	
}

