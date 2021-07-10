package in.co.rays1;
import java.util.Scanner;
public class InputSum {

	public static void main(String[] args) {
		System.out.println("Taking Input From The User");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no 1 :");
		int a= sc.nextInt();
		System.out.println("Enter no 2 :");
		int b= sc.nextInt();
		int Sum=a+b;
		System.out.println("The Sum of These Numbers is "+Sum);
	}

}
