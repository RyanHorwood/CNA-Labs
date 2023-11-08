//Lab 1 - This program will print my name, student number, and class number to the screen
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-20-2022

import java.util.*;

public class Lab1P4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = s.nextInt();
		System.out.print("Enter b: ");
		int b = s.nextInt();
		
		int sum = a + b;
		int dif = a - b;
		int pro = a * b;
		double quo = (double) a / b;
		int rem = a % b;
	
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + dif);
		System.out.println("Product: " + pro);
		System.out.println("Quotient: " + quo);
		System.out.println("Reminder: " + rem);
	}
}