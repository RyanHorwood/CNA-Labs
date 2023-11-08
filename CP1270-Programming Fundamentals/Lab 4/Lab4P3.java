//Lab 4 - This program will take in an array of 5 integers and then calculate the sum, average, and largest number of the array.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date:06-12-2022

import java.util.*;

public class Lab4P3 {
	public static int sum(int[] num) {
		
		int sum1 = 0;
		
		for(int i = 0; i < num.length; i++){
			sum1 += num[i];
		}
		return sum1;
	}
	public static float average(int[] num) {
		
		float average;
		float sum2 = sum(num);
		average = sum2 / num.length;
		return average;
	}
	public static int findLargest(int[] num) {
		
		int largest = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(largest < num[i]) largest = num[i];
		}
		return largest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		System.out.println("Enter the Array of numbers:");
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("Sum of Array: " + sum(num));
		System.out.println("Average of Array: " + average(num));
		System.out.println("Largest number of Array: " + findLargest(num));
	}
}
