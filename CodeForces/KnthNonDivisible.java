import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class knd
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            long n =Long.parseLong(sc.next());
            long k = Long.parseLong(sc.next());
            if(k<=n-1)
            {
                System.out.println(k);
                continue;
            }
            else
            {
               long d= k/(n-1);
               long r= k%(n-1);
               long fres=0;
               if(r==0)
               {
                    fres= (n*d)-1;
               }
               else{
                   fres=(n*d)+r;
               }
                System.out.println(fres);
                
            }
        }
    }
}
 
