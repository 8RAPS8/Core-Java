package in.co.rays1;

public class NameLength {

	public static void main(String[] args) {
		
		  String name= "Shubham Bairagi "; 
		  System.out.println("Characters in name="+name.length()); 
		  System.out.println("8th character:" +name.charAt(7));
		  System.out.println("Index of Bairagi:" +name.indexOf("Bairagi"));
		  System.out.println("Index of a:" +name.indexOf("a"));
		  System.out.println("Last Index of a:" +name.lastIndexOf("a"));
		  System.out.println("a is replaced by b:"+name.replace("a","b"));
		  System.out.println("LowerCase:"+name.toLowerCase());
		  System.out.println("UpperCase:"+name.toUpperCase());
		  System.out.println("b Replace a"+name.replace("b","a"));
		  System.out.println("No space:"+name.trim());
		  System.out.println("Starts with Shubham:"+name.startsWith("Shubham"));
		  System.out.println("Substring:"+name.substring(11));
		  System.out.println("Substring:"+name.substring(0,5));
		 
	}

}
