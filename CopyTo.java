package Array;

public class CopyTo {

	public static void main(String[] args) {
		char[] copyFrom= {'R','A','H','U','L'};
		char[] copyto= new char[3];
		System.arraycopy(copyFrom, 3, copyto, 1, 2);
		System.out.println(copyto);
		

	}

}
