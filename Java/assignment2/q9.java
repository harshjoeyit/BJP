import java.lang.*;
import java.time.Month;
import java.util.*;


class MonthDays
{
    private int month;
    private int year;

    public MonthDays( int month , int year )
    {
        this.month = month;
        this.year = year;
    }

    public int getNumberOfDays()
    {
        int leap = 0;
        int days;
        if( year % 4 == 0 && year % 100 != 0  || year % 400 == 0 )
            leap = 1;
        
        switch(month)
        {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:    days = 31;  break;      

            case 2:     days = 28+leap;     break;
            
            case 4:
            case 6:
            case 9:
            case 11:    days = 30; break;

            default:    days = 0;
        }

        return days;
    }

}


class q9
{
    public static void main( String args[] )
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("month: ");
        int month = enter.nextInt();
        
        System.out.print("year: ");
        int year = enter.nextInt();

        MonthDays MD = new MonthDays(month, year);

        System.out.println( MD.getNumberOfDays() + " days");
    }
}