//Lab 1 - This program will take an angle in degrees and print the sine and cosine of that angle to the screen
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-27-2022

import java.util.*;

public class Lab2P1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Degree: ");
		double Degree = s.nextDouble();
		
		double radians = Degree * Math.PI/180;
		
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		
		System.out.println("Sine: " + sine);
		System.out.println("Cosine: " + cosine);
	}
}