package OOP;

public class TestCircle extends Circle{

	public static void main(String[] args) {
		TestCircle tc=new TestCircle();
		tc.setColor("Blue");
		tc.setBorderWidth(3);
		tc.setRadius(10);
		System.out.println("Area of Circle is "+tc.area());
		System.out.println("Color of circle is "+tc.getColor());
		System.out.println("borderWidth of circle is "+tc.getBorderWidth());
		System.out.println("radius of circle is "+tc.getRadius());

	}

}
