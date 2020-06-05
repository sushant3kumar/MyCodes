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
		    int ans=0;
		    String str= sc.next();
		    for(int i=0;i<str.length()-1;i++)
		    {
		        if((str.charAt(i)=='x' && str.charAt(i+1)=='y')||(str.charAt(i)=='y' && str.charAt(i+1)=='x'))
		        {
		            ans++;
		            i++;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
