//Lab 5 - This program will take a line of text and tell you what characters are in an even position and what ones are in an odd position.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 06-13-2022

import java.util.*;

public class Lab5P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			String characters;

			Text obj = new Text();
			
			System.out.println();
			System.out.print("Enter the line of text: ");
			characters = sc.nextLine();
			String s[] = new String [30];

			s = obj.divideText(characters); 
	}
}
class Text {	
	static String[] a = new String[20];
	static String[] b = new String[20];
	public static String[] divideText(String characters) {   

			int j = 0,k = 0;

		for(int i = 0;i < characters.length();i++) {

			if(i % 2 == 0) { 
				char ct1 = characters.charAt(i);
				a[j] = String.valueOf(ct1);
				j++;

			}else{
				char ct2 = characters.charAt(i);
				b[k] = String.valueOf(ct2);
				k++;
			}
		}
			System.out.println();
			System.out.println("The characters at even places in the line of text entered: ");

		for(int i = 0;i < j;i++) {
			System.out.println(a[i]);
		}
			System.out.println();
			System.out.println("The characters at odd places in the line of text entered: ");

		for(int i = 0;i < k;i++) {
			System.out.println(b[i]);
		}
			return a;
	}
}