import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            long n = Long.parseLong(sc.next());
            long x = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());
            long c1=x;long c2=x; 
            long count=0;
            int flag=0;
            long ans1=0;
            long ans2=0;
            for(long i=0;i<m;i++)
            {
                long a = Long.parseLong(sc.next());
                long b =Long.parseLong(sc.next());

                if(x<=b && x>=a && flag==0)
                {
                    c1=a;
                    c2=b;
                    flag=1;
                    count=(b-a+1);
                }
                if((( b>=c2 && a<=c2)||(a<=c1 && b>=c1))&& flag==1)
                {
                    //ans1= Math.max(b,c2)-Math.min(a,c1)+1;
                    ans2= Math.max(b,c2)-Math.min(a,c1)+1;
                    c1=Math.min(a,c1);
                    c2= Math.max(b,c2);
                    //System.out.println(c1+" "+c2);
                }

            }
            System.out.println(c2-c1+1);
           // System.out.println(count>ans2?count:ans2);
        }
    }
}
