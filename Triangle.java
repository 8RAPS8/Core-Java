package OOP;

public class Triangle extends Shape{
		private double base=0.00;
		private double height=0.00;
		public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		public double area() {
			double ar=base*height/2 ;
			return ar;
		}

}
