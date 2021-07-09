package in.co.rays1;

public class OE100sum {

	public static void main(String[] args) {
		int SumE=0, SumO=0;
		for (int i=0; i<=5;i++) {
		 if(i%2==0) {
			 SumE=i+SumE; 
			 
		 			}
		 else{ SumO=SumO+i;
		 
		}
		 

	  } 
		System.out.println("Odd no Sum="+SumO);
		System.out.println("Even no Sum="+SumE);
    }
	
	
}
