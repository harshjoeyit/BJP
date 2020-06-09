import java.lang.*;
import java.util.*;

class TestScores
{
    int ts1;
    int ts2;
    int ts3;

    TestScores() {}             // default constructor with empty body

    TestScores( int ts1 , int ts2 , int ts3 )
    {
        this.ts1 = ts1;
        this.ts2 = ts2;
        this.ts3 = ts3;
    }

    float average()
    {
        return (float)( ts1 + ts2 + ts3 ) / 3;        
    }

    void get()
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("value for ts1 : " );
        ts1 = enter.nextInt();
        System.out.print("value for ts2 : " );
        ts2 = enter.nextInt();
        System.out.print("value for ts3 : " );
        ts3 = enter.nextInt();
    }
}

class q6
{
	public static void main( String args[] )
	{
        TestScores test = new TestScores(0,0,0);
        test.get();
        System.out.println("average : " + test.average() );
    }
};
