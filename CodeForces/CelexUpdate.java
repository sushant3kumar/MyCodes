import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q3
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long t= Long.parseLong(sc.next());
        while(t-->0)
        {
            long x1= Long.parseLong(sc.next());
            long y1= Long.parseLong(sc.next());
            long x2= Long.parseLong(sc.next());
            long y2= Long.parseLong(sc.next());
            long row = (y2-y1);
            long col = (x2-x1);

            if(row==0 || col==0)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println((row*col)+1);
            }
            //System.out.println(dp[row][col]);
        }
    }
}
