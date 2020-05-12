import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class sps
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
            long m=n;
            long f =n;
            if((m-((k-1)*1))%2==1 && (m-((k-1)*1))>0)
            {
                System.out.println("YES");
                for(long d=0;d<k-1;d++)
                {
                    System.out.print(1+" ");
                }
                System.out.print(m-((k-1)*1));
                System.out.println("");
            } 
            else if((m-((k-1)*2))%2==0 && (m-((k-1)*2))>0)
            {
                System.out.println("YES");
                for(long d=0;d<k-1;d++)
                {
                    System.out.print(2+" ");
                }
                System.out.print(m-((k-1)*2));
                System.out.println("");
            }   
            else
            {
                System.out.println("NO");
            }  

        }
    }
}
