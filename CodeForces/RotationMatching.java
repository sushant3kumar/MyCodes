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
        int n= Integer.parseInt(sc.next());
        long[] a= new long[n+1];
        long[] b = new long[n+1];
        long[] pos= new long[n+1];
        long[] ans= new long[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=Long.parseLong(sc.next());
            pos[(int)a[i]]=i;
        }
        for(int i=0;i<n;i++)
        {
            b[i]=Long.parseLong(sc.next());
            
        }
        for(int j=0;j<n;j++)
        {
            long r=pos[(int)b[j]]-j;
            if(r<0)
            {
                r=r+n;
            }
            ans[(int)r]++;
        }
        int d=(int)ans[0];
        for(int i=0;i<n;i++)
        {
            d= (int)Math.max(d, ans[i]);
        }
        System.out.println(d);

    }
}
