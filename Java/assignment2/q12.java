import java.lang.*;
import java.util.*;

class SavingsAccount
{
    double interestRateAnnual;
    int balance;

    public SavingsAccount() { }

    public SavingsAccount( int balance , double interestRateAnnual)
    {
        this.interestRateAnnual = interestRateAnnual;
        this.balance = balance;
    }

    public int withdrawal( int amount )
    {   
        balance -= amount;
        return amount;
    }

    public int deposit( int amount )
    {
        balance += amount;
        return amount;
    }

    public int addMonthlyInterest()
    {
        double interestMonthly = balance*interestRateAnnual/12;
        balance += interestMonthly;
        return (int)interestMonthly; 
    }
}



class q12
{
    public static void main( String args[] )
    {
        Scanner enter = new Scanner(System.in);

        int initBalance;
        System.out.print("initial balance: ");
        initBalance = enter.nextInt();

        double AIR;        // annual interest rate
        System.out.print("annual interest rate : ");
        AIR = enter.nextDouble();

        double months;        // annual interest rate
        System.out.print("months since the account opening : ");
        months = enter.nextInt();

        SavingsAccount Ac1 = new SavingsAccount( initBalance , AIR );

        int Dep=0, With=0 , Int=0;

        for( int i = 0; i < months; i++ )
        {
            int deposit;        // annual interest rate
            System.out.print("amount deposited in " + (i+1) + " month: ");
            deposit = enter.nextInt();

            Dep += Ac1.deposit(deposit);

            int withdraw;        // annual interest rate
            System.out.print("amount withdrawn in " + (i+1) + " month: ");
            withdraw = enter.nextInt();

            With += Ac1.withdrawal(withdraw);

            Int += Ac1.addMonthlyInterest();
        }

        System.out.println("total amount deposited: " + Dep );
        System.out.println("total withdrawal: " + With );
        System.out.println("total interest earned: " + Int );
    }
}