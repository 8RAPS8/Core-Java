package Practice;

import java.util.Scanner;

public class Cgpa {

	public static void main(String[] args) {
		// To find CGPA of a  given number
		Scanner sc=new Scanner(System.in); //create a scanner object
		System.out.println("Enter Marks Sub1");
		float a = sc.nextFloat();
		System.out.println("Enter Marks Sub2");
		float b =sc.nextFloat();
		System.out.println("Enter Marks Sub3");
		float c= sc.nextFloat();
		System.out.println("Enter Marks Sub4");
		float d= sc.nextFloat();
		System.out.println("Enter Marks Sub5");
		float e= sc.nextFloat();
		float sum=a+b+c+d+e;
		float grade= sum/50;
		System.out.println(grade);
		}

	}


