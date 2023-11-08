//Lab 4 - This program will take a positive integer and tell you if it is odd or even.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 06-12-2022

import java.util.*;

public class Lab4P1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = s.nextInt();
		isOdd(n);
		
		if (isOdd(n)) {
			System.out.println(n + " is an odd integer");
		 
	    }else{
			System.out.println(n + " is an even integer");
		}
	}
	
	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}		
}	
