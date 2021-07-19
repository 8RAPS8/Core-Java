package OOP;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile a= new Automobile();
		a.setColor("Grey");
		a.setMake("Honda");
		System.out.println("Color of Vehicle is "+a.getColor());
		System.out.println("Make of the vehicle is "+a.getMake());
		System.out.println("Speed after gear change is "+a.getSpeed());
		System.out.println("Gear of Vehicle is "+a.changeGear("Gear 1"));
		System.out.println("Speed after accelerating is "+a.accelerator());
		System.out.println("Speed after applying breaaks is "+a.breaak());

	}

}
