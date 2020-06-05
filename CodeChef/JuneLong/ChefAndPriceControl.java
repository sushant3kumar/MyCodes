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
		int t = Integer.parseInt(sc.next());
		while(t-->0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    int[] arr =new int[n];
		    int ans=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(sc.next());
		        if(arr[i]>k)
		        {
		            ans+=(arr[i]-k);
		        }
		    }
		    System.out.println(ans);
		    
		}
	}
}
