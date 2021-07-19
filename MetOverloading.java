package OOP;

public class MetOverloading {
	
	public double div(float i, float j) {
		return i/j;
		
	}
	public double div(int i, int j) {
		return i/j;
	}
	public double div(int i, float j) {
		return i/j;
	}
	public double div(double i, int j) {
		return i/j;
	}
	public double div(float i, double j) {
		return i/j;
	}
	

}
