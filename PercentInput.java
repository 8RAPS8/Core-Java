package in.co.rays1;
import java.util.Scanner;
public class PercentInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Maths Marks=");
		float a= sc.nextFloat();
		System.out.println("Hindi Marks=");
		float b= sc.nextFloat();
		System.out.println("English Marks=");
		float c=sc.nextFloat();
		System.out.println("Science Marks=");
		float d=sc.nextFloat();
		System.out.println("Social Marks=");
		float e=sc.nextFloat();
		float TotalMarks=a+b+c+d+e;
		float Percent= TotalMarks/5;
		System.out.println("Percent="+Percent);
	}

}
