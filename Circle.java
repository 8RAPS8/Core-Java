package OOP;

public class Circle extends Shape {

		 private double radius=0.00;
		
		public double area() {
			double ar= Shape.PI*radius*radius;
			return ar;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		
		
}
