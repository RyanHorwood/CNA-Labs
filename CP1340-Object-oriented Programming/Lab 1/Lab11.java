//Lab 11 - This program will tell you the prime numbers from 1-1000 in an array.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 09-13-2022

public class Lab11 {
	public static void main(String[] args) {
	    int[] a = new int[1000];
	    init(a);
	    findPrimes(a);
		printPrimes(a);
	}
	public static void init(int[] a) {
	    for(int i=2;i<1000;i++)
            a[i] =1;
	}
	public static void findPrimes(int[] a) {
	   for(int p = 2; p*p <=999; p++) {

            if(a[p] ==1)
            {
                for(int i = p*p; i <= 999; i += p)
                    a[i] = 0;
            }
        }
	}
	public static void printPrimes(int[] a) {
        for(int i = 2; i <= 999; i++) {
            
			if(a[i] ==1)
                System.out.println(i + " is prime");
        } 
	}
}
		