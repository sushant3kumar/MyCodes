import java.util.*;

//import jdk.internal.org.jline.utils.InputStreamReader;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] ab= br.readLine().split(" ");
            long a = Long.parseLong(ab[0]);
            long b = Long.parseLong(ab[1]);
            long c = Long.parseLong(ab[2]);
            long d = Long.parseLong(ab[3]);
            if(b>=a)
            {
                System.out.println(b);
                //continue;
            }
            else if(a-b>0 && c<=d)
            {
                System.out.println(-1);
                //continue;
            }
            else
            {
                a=a-b;
                long f=a;
                long count=0;
                if(a%(c-d)==0)
                {
                    count=a/(c-d);
                }
                else
                {
                    count=1+((a)/(c-d));
                }
                //System.out.println(count);
                f=b+(count*(c));
                System.out.println(f);
            }

        }
    }
}
