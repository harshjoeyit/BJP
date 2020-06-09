import java.lang.*;
import java.util.*;

class Payroll
{
    String name;
    String IDnumber;
    int hourlyPayRate;
    int workingHours;

    Payroll(){}             // default constructor with empty body

    Payroll( String name , String IDnumber )
    {
        this.name = name;
        this.IDnumber = IDnumber;
    }

    int grossPay()
    {
        return ( workingHours * hourlyPayRate );        
    }

    void get()
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("enter the hourly par rate for " + this.name + " [" + this.IDnumber + "] : " );
        hourlyPayRate = enter.nextInt();
        System.out.print("enter the working hours for " + this.name + " [" + this.IDnumber + "] : " );
        workingHours = enter.nextInt();
    }
}

class q5
{
	public static void main( String args[] )
	{
        Payroll E1 = new Payroll("ramesh kumar" , "JPMC12345" );
        E1.get();
        int GrossPay = E1.grossPay();
        System.out.println("Gross pay for " + E1.name + " [" + E1.IDnumber + "] : " + GrossPay );
    }
};
