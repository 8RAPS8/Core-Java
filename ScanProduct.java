package Practice;

import java.util.Scanner;

public class ScanProduct {

	public static void main(String[] args) {
		// TO Input numbers and multiply them
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number :");
		float a = sc.nextFloat();
		System.out.print("Enter Second Number:");
		float b=sc.nextFloat();
		float c=  a*b;
		System.out.println("Product ="+c);

	}

}
