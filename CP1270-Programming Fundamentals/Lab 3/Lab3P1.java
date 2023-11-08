//Lab 3 - This program will ask how many numbers you are adding and will then get the sum of those numbers.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-30-2022

import java.util.*;

public class Lab3P1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println();
		System.out.print("Enter the amount of numbers to be summed: ");
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter number: ");
			int x = s.nextInt();
			
			sum = sum + x;
		}
			System.out.println("Sum = " + sum);
	}
}