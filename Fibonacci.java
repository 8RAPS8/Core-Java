package in.co.rays1;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0, b=1, c;
		System.out.print(""+a);
		System.out.print(","+b);
		for(int i=3;i<=n;i++) {
			 c=a+b;	
			 System.out.print(","+c);
			 a=b;
			 b=c;	
		}
		
	}

}