package classPercentage;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner a = new Scanner(System.in);
		double x = a.nextInt();
		System.out.println("the scanned item is " + x);
		
		System.out.println("ENTER THE SECOND ");
		Scanner b= new Scanner(System.in);
		double y = b.nextInt();
		System.out.println("Second term is " + y);
		
		double z = ((x+y)/200 )* 100;
	
		System.out.print("the cgpa is" + z );
		

	}

}
