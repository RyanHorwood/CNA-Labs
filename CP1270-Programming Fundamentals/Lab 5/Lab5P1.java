//Lab 5 - This program will take a word and tell you how many vowels exist inside that word.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 06-13-2022

import java.util.*;


public class Lab5P1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter a word to check how many vowels it has: ");
		String str = input.nextLine();
  
		char array[]=new char[str.length()];
  
		for(int i = 0;i < str.length();i++)
			array[i] = str.charAt(i);  
  
			int count = countVowels(array);
			
			System.out.println();
			System.out.println("Number of vowels in the word: " + count);
	}
	public static int countVowels(char array[]) {
	
		int count = 0;

		for(int i = 0;i < array.length;i++) {
		
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u') {
		
				count++;
		}
	}  
		return count;
	}
}