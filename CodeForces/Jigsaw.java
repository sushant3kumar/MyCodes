import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Jigsaw
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            long m = Long.parseLong(sc.next());
            long n = Long.parseLong(sc.next());
            long tabs= 3*m*n;
            long blank=m*n;
            long res=0;
            res=(n-1)*m+(m-1)*n;
            if(res>blank || res>tabs)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
