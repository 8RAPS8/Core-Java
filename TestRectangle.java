package OOP;

public class TestRectangle extends Rectangle {

	public static void main(String[] args) {
		TestRectangle tr=new TestRectangle();
		
		tr.setBorderWidth(2);;
		tr.setColor("Yellow");
		tr.setLength(20);
		tr.setWidth(30);
		
		System.out.println("BorderWidth of the rectangle is "+tr.getBorderWidth());
		System.out.println("Color of the rectangle is "+tr.getColor());
		System.out.println("Length of the rectangle is "+tr.getLength());
		System.out.println("Width of the rectangle is "+tr.getWidth());
		System.out.println("Area of rectangle is "+tr.Area());
		
	}

}
