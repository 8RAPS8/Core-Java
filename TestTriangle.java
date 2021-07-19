package OOP;

public class TestTriangle extends Triangle {

	public static void main(String[] args) {
		TestTriangle tt= new TestTriangle();
		
		tt.setColor("White");
		System.out.println("Color of the rectangle is "+tt.getColor());
		
		tt.setBorderWidth(3);
		System.out.println("borderWidth of the rectangle is "+tt.getBorderWidth());
		
		tt.setBase(6);
		System.out.println("Base length of the triangle is "+tt.getBase());
		
		tt.setHeight(7);
		System.out.println("Height of the traingle is "+tt.getHeight());
		
		System.out.println("Area of the given rectangle is "+tt.area());
	}

}
