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
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            long n = Long.parseLong(sc.next());
           // long k =Long.parseLong(sc.next());
            long sum=0;
            long x =3;
            for(long i =1;i<=n/2;i++)
            {
                sum=sum+(i*((2*x)+2*(x-2)));
                x=x+2;
            }
            System.out.println(sum);
        }
    }
}
