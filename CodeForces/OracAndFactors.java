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
            long n = Long.parseLong(sc.next());
            long k = Long.parseLong(sc.next());
            while(k-->0)
            {
                n= n+findf(n);
                if(n%2==0)
                {
                    break;
                }
            }
            n=n+k*2;
            System.out.println(n);

        }
    }
    public static long findf(long n)
    {
        if(isPrime(n))
        {
            return n;
        }
        long j= (long)Math.sqrt(n);
        long res=0;
        int flag=0;
        for(long i =2;i<=j;i++)
        {
            if(n%i==0)
            {
                flag=1;
                res= i;
                break;
            }
        }
        if(flag==1)
        {
            return res;
        }
        return n;
    }

    public static boolean isPrime(long n) 
    { 
       
        if (n <= 1) return false; 
        if (n <= 3) return true; 
      
     
        if (n % 2 == 0 || n % 3 == 0) return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
    } 
}
