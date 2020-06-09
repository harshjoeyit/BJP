import java.lang.*;
import java.util.*;

class FBpoints
{
    private int ethylAlchohol_f = -173;
    private int ethylAlchohol_b = 172;
    private int oxygen_f = -362;
    private int oxygen_b = -306;
    private int water_f = 32;
    private int water_b = 212;


    public void setValues( int etf , int etb , int of , int ob , int wf , int wb )
    {
        ethylAlchohol_b = etb;
        ethylAlchohol_f = etf;
        oxygen_b = ob;
        oxygen_f = of;  
        water_b = wb;
        water_f = wf;
    }

    public void getValues()
    {
        System.out.println("Material\t Boiling Point\t Freezing Point\n");
        System.out.println("ethyl alchohal\t" + ethylAlchohol_b + "\t " + ethylAlchohol_f+" \n");
        System.out.println("oxygen \t "+ oxygen_b + "\t" + oxygen_f + "\n");
        System.out.println("water\t " + water_b + "\t" + water_f+ "\n");

    }


    public boolean isEthylFreezing( int temp )
    {
        if( ethylAlchohol_f >= temp )
            return true;
        else
            return false;
    }

    public boolean isEthylBoiling(int temp)
    {
        if( ethylAlchohol_b <= temp )
            return true;
        else
            return false;
    }

    public boolean isOxygenFreezing(int temp)
    {
        if( oxygen_f >= temp )
            return true;
        else
            return false;
    }

    public boolean isOxygenBoiling(int temp)
    {
        if( oxygen_b <= temp )
            return true;
        else
            return false;
    }

    public boolean isWaterFreezing(int temp)
    {
        if( water_f >= temp )
            return true;
        else
            return false;
    }

    public boolean isWaterBoiling(int temp)
    {
        if( ethylAlchohol_f <= temp )
            return true;
        else
            return false;
    }
}

class q11
{
    public static void main( String args[] )
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("temp: ");
        int temp = enter.nextInt();

        FBpoints FB = new FBpoints();

        if( FB.isEthylBoiling(temp) )
            System.out.println("ethyl alcohal is boiling");
        
        if( FB.isEthylFreezing(temp) )
            System.out.println("ethyl alcohal is freezing");
        
        if( FB.isOxygenBoiling(temp) )
            System.out.println(" oxygen is boiling");
        
        if( FB.isOxygenFreezing(temp) )
            System.out.println(" oxygen is freezing");
        
        if( FB.isWaterFreezing(temp) )
            System.out.println(" water is freezing");
        
        if( FB.isWaterBoiling(temp) )
            System.out.println(" water is boiling");
    }
}