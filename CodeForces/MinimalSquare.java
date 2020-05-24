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
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int ans=0;
            int min= Math.min(a,b);
            int max= Math.max(a,b);
            if(2*min>=max)
            {
                ans=4*min*min;
            }
            else
            {
               ans= max*max;
            }
            System.out.println(ans);

        }
    }
}
