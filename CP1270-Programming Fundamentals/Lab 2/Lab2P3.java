//Lab 1 - This program will convert a number grade to a letter grade
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-27-2022

import java.util.*;

public class Lab2P3 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
		
			System.out.print("Enter Grade: ");
			double Grade = s.nextDouble();
		
			if(Grade >= 90 && Grade <= 100) {
				System.out.println("A+");
			}
			else if(Grade >= 80 && Grade <= 89) {
				System.out.println("A");
			}
			else if(Grade >= 70 && Grade <= 79) {
				System.out.println("B");
			}
			else if(Grade >= 55 && Grade <= 69) { 
				System.out.println("C");
			}
			else if(Grade >= 50 && Grade <= 54) {
				System.out.println("D");
			}
			else if(Grade >= 0 && Grade <= 49) {
				System.out.println("F");
			}
	else{
			System.out.println("Invalid Grade");
    }
	    }
}