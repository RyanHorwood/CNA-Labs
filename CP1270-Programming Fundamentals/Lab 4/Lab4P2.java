//Lab 4 - This program will take two positive integers and calculate the least common multiple and greatest common divisor.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 06-12-2022

import java.util.*;

public class Lab4P2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter m: ");
		int m = s.nextInt();
		
		System.out.print("Enter n: ");
		int n = s.nextInt();
		
		System.out.println("the LCM is: "+ lcm(m,n));
	}
		
	
	public static int lcm(int m, int n) {
		int answer = ((m * n)/gcd(m,n));
		return answer;
	}
	
	public static int gcd(int m, int n) {
		int r = m % n;
		if (r == 0){
			return n;
		}
		else {
			return gcd(n,r);
		}
	}
}