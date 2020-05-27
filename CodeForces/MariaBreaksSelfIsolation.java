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
        long t= Long.parseLong(sc.next());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.next());
            long[] arr = new long[n];
            for(int i=0;i<(int)n;i++)
            {
                arr[i]=Long.parseLong(sc.next());
            }
            Arrays.sort(arr);
            long ans=0;
            long count=0;
            
                for(int  i=0;i<(int)n;i++)
                {
                    if(arr[i]<=i+1)
                    {
                        ans=i+1;
                    }
                    
                }
                System.out.println(ans+1);
            
        }
    }
}
