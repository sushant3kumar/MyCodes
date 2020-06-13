import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            long a= Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            if(a==0||b==0)
            {
                System.out.println(0);
                continue;
            }
            long min= a<=b?a:b;
            long max= a>=b?a:b;
            if(max>=2*min)
            {
                System.out.println(min);
                continue;
            }
            else
            {
                System.out.println((a+b)/3);
            }

        }
    }
}
