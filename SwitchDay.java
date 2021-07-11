package in.co.rays1;

public class SwitchDay {

	public static void main(String[] args) {
		int day=5;
		String dayString=null;
		switch (day) {
		case 1:
			dayString= "Sunday";
			break;
		case 2:
			dayString="Monday";
			break;
		case 3:
			dayString="Tuesday";
			break;
		case 4:
			dayString="Wednesday";
			break;
		case 5:
			dayString="Thursday";
			break;
		case 6:
			dayString="Friday";
			break;
		case 7:
			dayString="Saturday";
			break;
		default:
			dayString="This day does not Exist,please enter a valid day";
		}
		System.out.println(dayString);
	}

}
