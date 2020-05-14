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
            int n =Integer.parseInt(sc.next());
            long k = Long.parseLong(sc.next());
            if(n==1)
            {
                System.out.println(0);
                continue;
            }
            if(n==2)
            {
                System.out.println(k);
                continue;
            }
            if(n>2)
            {
                System.out.println(2*k);
                continue;
            }
            
            
            //System.out.println(res);
        }
    }
}
