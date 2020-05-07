import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CC
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long t= Long.parseLong(sc.next());
        while(t-->0)
        {
            long n =Long.parseLong(sc.next());
            long ht=1;
            long pnum=0;
            long num=0;
            long rem= n;
            long count=0;
            while(rem>1)
            {
                while(num<=rem)
                {
               
                pnum=num;
                num=num+(ht-1)*3+2;
                ht++;
                

                }
                count++;
                rem=rem-pnum;
                num=0;ht=1;
            }
            System.out.println(count);
            
        }
    }
   
}
