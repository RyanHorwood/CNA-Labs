//Lab 3 - This program will figure out if the number entereed is a perfect number
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 05-30-2022

import java.util.*;

public class Lab3P2 {
	public static void main(String[] args) {
		int i = 1, n, Sum = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		n = s.nextInt();
		
		while(i < n) {
			if(n % i == 0) {
				Sum = Sum + i;
			}
			i++;
		}
			if(Sum == n){
				System.out.print(n + " is a perfect number");
			}else{
				System.out.print(n + " is not a perfect number");
		}
	}
}