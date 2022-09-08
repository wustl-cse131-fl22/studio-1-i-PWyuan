package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		  System.out.println("Value for x?"); 
		  int x = scan.nextInt();
		  System.out.println("Value for y?"); 
		  int y = scan.nextInt();
		  System.out.println("Value for z?"); 
		  int z = scan.nextInt();
		 
		  boolean a = x > y ;		  
		  boolean b = y > z ;
		  boolean c = (x==z)|| (x==y)||(z==y);
		  boolean isOrdered = (a==b) && !c;
		  
		  //boolean e = x==z;
		  
		  
		  
		  System.out.println( isOrdered );

		

	}

}
