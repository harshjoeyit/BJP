import java.lang.*;
import java.util.*;


class Temperature
{
    private double ftemp;

    public Temperature( double ftemp )
    {
        this.ftemp = ftemp;
    }

    public void setFahrenheit( double ftemp )
    {
        this.ftemp = ftemp;
    }

    public double getFahrenheit()
    {
        return ftemp;
    }

    public double getCelsius()
    {
        double ctemp = (ftemp - 32)*5/9;
        return ctemp;
    }

    public double getKelvin()
    {
        double ktemp = (ftemp - 32)*5/9 + 273.15 ;
        return ktemp;
    }
    
}


class q8
{
    public static void main( String args[] )
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("fahrenheit temp: ");
        double ftemp = enter.nextDouble();

        Temperature today = new Temperature(ftemp);
        System.out.println( "is " + today.getCelsius() + " degree celcius");
        System.out.println( "is " + today.getKelvin() + " kelvin");
    }
}