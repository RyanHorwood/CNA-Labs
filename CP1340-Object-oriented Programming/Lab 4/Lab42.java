//Lab 42
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 11-12-2022

public class Lab42 {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];

        accounts[0] = new Checking();
        accounts[1] = new Saving();

        accounts[0].deposit(1000);
        accounts[0].withdraw(200);
        accounts[1].deposit(1000);
        accounts[1].withdraw(300);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1));
            accounts[i].show();
            System.out.println("Interest: " + accounts[i].dailyInterest());
            System.out.println();
        }
    }
}
abstract class Account {

    protected double amount;

    public Account() {
        amount = 0.0;
    }

    public void deposit(double m) {
        amount += m;
    }

    public void withdraw(double m) {
        if (m <= amount)
            amount -= m;
    }

    public abstract void show();
    public abstract double dailyInterest();
}
class Saving extends Account {

    public void show() {
        System.out.println("Balance of Savings account is " + amount);
    }

    public double dailyInterest() {
        return 0.06 * amount;
    }
}
class Checking extends Account {

    public void show() {
        System.out.println("Balance of Checking account is " + amount);
    }

    public double dailyInterest() {
        return 0.03 * amount;
    }
}