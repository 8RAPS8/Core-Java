package in.co.rays1;
import java.util.Scanner;
public class GradeInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your Percentage");
		float a=sc.nextFloat();
		if (a>=95) {
			System.out.println("A+ Grade");
		}
		else if (a>=90) {
			System.out.println("A Grade");
		}
		else if (a>=85) {
			System.out.println("B+ Grade");
		}
		else if (a>=80) {
			System.out.println("B Grade");
		}
		else if (a>=70) {
			System.out.println("C+ Grade");
		}
		else if (a>=60) {
			System.out.println("C Grade");
		}
		else if (a>=50) {
			System.out.println("D+ Grade");
		}
		else if (a>=40) {
			System.out.println("D Grade");
		}
		else if (a>=33) {
			System.out.println("E Grade");
		}
		else if (a<33) {
			System.out.println("Fail- Work Hard to Succeed");
		}
			
	}

}


