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
            long a = Long.parseLong(sc.next());
            long b= Long.parseLong(sc.next());
            if(a==b)
            {
                System.out.println(0);
                continue;
            }
            long gr= a>b?a:b;
            long sm= a<b?a:b;
            long count=0;
            //int flag1=0,flag2=0,flag3=0;
            if(gr%sm==0)
            {
                long div= gr/sm;
                if(div%2==0 || div%4==0 || div%8==0)
                {
                    
                    while(div%8==0)
                    {
                        count++;
                        div=div/8;

                    }
                    while(div%4==0)
                    {
                        count++;
                        div=div/4;
                    }
                    while(div%2==0)
                    {
                        count++;
                        div=div/2;
                    }
                    if(div==1)
                    {
                        System.out.println(count);
                    }
                    else
                    {
                        System.out.println(-1);
                    }
                }
                else
                {
                    System.out.println(-1);
                }
            }
            else
            {
                System.out.println(-1);
            }

        }
    }
}
