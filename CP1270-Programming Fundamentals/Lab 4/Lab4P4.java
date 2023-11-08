//Lab 4 - This program will take the speed and time of a vehicle to calculate the total distance.
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date:06-12-2022

import java.util.*;

public class Lab4P4 {
    public static int getDistance(int speed,int elapsed_time)
    {
        return speed*elapsed_time; 
    }
        public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int speed,hours;
        while(true) 
        {
            System.out.print("What is the speed of the vehicle in kph? ");
            speed=s.nextInt();
            if(speed>=0)
            break;
            System.out.println("negative values not accepted");
        }
        while(true) 
        {
            System.out.print("How many hours has it traveled? ");
            hours=s.nextInt(); 
            if(hours>=1)
            break;
            System.out.println("hours should be greater than or equal to 1");
        }
        System.out.println("Hours Distance Traveled");
        System.out.println("------------------------");
        for(int elapsed_time=1;elapsed_time<=hours;elapsed_time++)
        {
            int res=getDistance(speed,elapsed_time); 
            System.out.println(elapsed_time+" "+res); 
        }
        }
}