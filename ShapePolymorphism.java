package OOP;

import java.awt.Rectangle;

public class ShapePolymorphism {
	
	public static void main (String[] args)
	{
	ConsShape s[]=new ConsShape[3] ;
	
	s[0]=new ConsRectangle(20,30);
	s[1]=new ConsCircle(10);
	s[2]=new ConsTriangle(7,3);
	double totalArea=calArea(s);
	System.out.println("Total area of the three shapes with the given information "+totalArea);
	}
	public static double calArea(ConsShape[] s) {
		double totalArea =0;
	for(int i=1;i<s.length;i++) {
		totalArea += s[i].area();
		
	}
		return totalArea;
		
	}
	
}
	
