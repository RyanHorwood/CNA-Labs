//Lab 1 - This program will decide if an integer is greater than, less than, or equal to zero
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-27-2022

import java.util.*;

public class Lab2P2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = s.nextInt();
	
		if(n > 0)
				System.out.println(n + " is greater than zero");
		if(n < 0)
				System.out.println(n + " is less than zero");
		if(n == 0)
				System.out.println(n + " is equal to zero");
	}
}