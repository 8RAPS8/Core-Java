package OOP;

public class ConsRectangle extends ConsShape{
	private int length=0;
	private int width=0;
	
	
	public ConsRectangle() {
		System.out.println("This is default constructor");
	}
	public ConsRectangle(int l, int w) {
		length=l;
		width=w;
	}
	public double area() {
		double ar =length*width;
		return ar;
	}
	
}
