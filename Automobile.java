package OOP;

public class Automobile {
	
	private String color=null;
	private String make=null;
	private int speed=20;
		
	
		public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	
		public int changeGear(String str) {
			
		speed=speed+30;
		return this.speed;
		}
		public int accelerator() {
		speed=speed+10;
		
		return this.speed;
		}
		public int breaak() {
			speed=speed-30;
		
		return this.speed;
	
		}
	
}