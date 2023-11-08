//Lab 5 - This program will take in five words from the user and print any repeated words back to the screen.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 06-13-2022

import java.util.*;

public class Lab5P3 {
	public static void main(String[] args) {
	
	System.out.println();
    System.out.println("Please enter 5 words below: ");
    Scanner sc = new Scanner(System.in);
        
		String words[] = new String[5];
		
		for(int i = 0;i < 5;i++) {
            words[i] = sc.next(); 
		}
		
		System.out.println();
		System.out.println("You have entered the following words multiple times: ");
		System.out.println();
        
		for(int i = 0;i < 5;i++) {
                for(int w = i + 1;w < 5;w++){
                  if(words[i].equals(words[w]))
                          System.out.println(words[i]);
				}
		}
        
	}
}