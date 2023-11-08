//Lab 3 - This program will randomly generate a sum of two numbers from 1-10 and the user must input the correct answer to finish the program.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-30-2022

import java.util.*;

public class Lab3P3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int answer;
		int a = (int)(Math.floor(Math.random()*(10-1+1)+1));
		int b = (int)(Math.floor(Math.random()*(10-1+1)+1));
		int sum = a + b;

		do {
				System.out.println("A = " + a);
				System.out.println("B = " + b);
				System.out.print("Enter answer: ");
				answer = s.nextInt();
				
			if(answer == sum) {
				
					System.out.println(answer + " is correct");
					
			}else{
				
					System.out.println(answer + " is incorrect, try again");
			}
						
		} while(answer != sum);
	}
}