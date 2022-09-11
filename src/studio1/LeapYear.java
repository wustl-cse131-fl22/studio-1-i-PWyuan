package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("What year?"); 
		  int year = scan.nextInt();
		  
		  boolean a = (year % 4 == 0) && (year % 100 != 0);
		  boolean b = year % 400 == 0;
		  boolean leapYear= (a == true) || (b == true);
		  
		  System.out.println( leapYear );

	}

}
