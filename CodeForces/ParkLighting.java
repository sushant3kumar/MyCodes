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
        long t= Long.parseLong(sc.next());
        while(t-->0)
        {
            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());
            long ans= 0;
            long even = n/2;
            long odd= n%2;
            ans= m*even;
            long ba= m%2;
            if(odd!=0)
            {
                if(ba!=0)
                  {

                    ans+=(m/2)+1;
                  }
                    else{
                        ans+=m/2;
                    }
            }
            System.out.println(ans);
        }
    }
}
