package Array;

public class ArrayTable {

	public static void main(String[] args) {
		int[] table;
		table= new int[10];
		table[0]=2;
		table[1]=4;
		table[2]=6;
		System.out.println(table[2]);
		System.out.println(table[4]);
		int size=table.length;
		System.out.println("Size is "+size);
		System.out.println(table[0]+table[1]);
		System.out.println(""+table[0]+table[1]);
	}

}
