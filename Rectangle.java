package OOP;

public class Rectangle extends Shape {
	private double length=0.00;
	private double width=0.00;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double Area() {
		double ar= length*width;
		return ar;
	}

}
