/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= Integer.parseInt(sc.next());
		while(t-->0)
		{
		    long ts = Long.parseLong(sc.next());
		    if(ts%2!=0)
		    {
	           System.out.println(ts/2);
		    }
		    else
		    {
		        while(ts%2==0)
		        {
		            ts=ts/2;
		        }
		        System.out.println(ts/2);
		    }
		}
	}
}
