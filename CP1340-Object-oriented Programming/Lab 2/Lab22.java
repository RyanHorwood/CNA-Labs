//Lab 22 - 
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 10-04-2022

public class Lab22 {
    public static void main(String[] args){
	
        MyInteger myInteger = new MyInteger(196);
        System.out.println("String representation of Number: " + myInteger.toString());
        System.out.println("Number is even: " + myInteger.isEven());
        System.out.println("Number is odd: " + myInteger.isOdd());
        System.out.println("Number is prime: " + myInteger.isPrime());
        System.out.println("Number is perfect number: " + myInteger.isPerfect());
        System.out.println("Numeber is perfect square: " + myInteger.isPerfectSquare());
        System.out.println("Prime factors of number: ");
        myInteger.primeFactors();
    }
}

class MyInteger {
    int number;
    MyInteger(){
	
        number = 0;
    }

    public MyInteger(int number) {
        this.number = number;
    }
    public String toString() {
        return Integer.toString(number);
    }
	
    public boolean isEven() {
	
        if(number%2==0)
            return true;
        return false;
    }
	
    public boolean isOdd() {
	
        if(number%2!=0)
            return  true;
        return false;
    }
	
    public boolean isPrime() {
	
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }

    public boolean isPerfect() {
	
		int sum = 0;
        for(int i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if(sum == number)
            return true;

        return false;
    }

    public boolean isPerfectSquare() {
	
        double getRoot = Math.sqrt(number);
        return (getRoot - Math.floor(getRoot) == 0);
    }
	
    public void primeFactors() {
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.print(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}