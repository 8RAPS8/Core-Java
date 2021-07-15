package in.co.rays1;

public class MixOp_1 {

	public static void main(String[] args) {
		double fv1,fv2;
		int iv1=123;
		fv1=iv1/50;
		//lower precedence to higher precedence does not need type casting
		fv2=iv1/50.0;
		System.out.println("fv1="+fv1);
		System.out.println("fv2="+fv2);

	}

}
