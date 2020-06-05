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
		    int n = Integer.parseInt(sc.next());
		    int[] arr = new int[n];
		    int ans=0;
		    int flag=0;int fc=0,tc=0,ftc=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(sc.next());
		        
		    }
		   
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==5)
		        {
		            fc++;
		        }
		        if(arr[i]==10)
		        {
		            tc++;
		            if(fc>=1)
		            {
		                fc--;
		            }
		            else
		            {
		                System.out.println("NO");
		                flag=1;
		                break;
		            }
		        }
		        if(arr[i]==15)
		        {
		            ftc++;
		            if(tc>=1 ||fc>=2)
		            {
		                if(tc>=1)
		                {
		                    tc--;
		                    //ftc--;
		                }
		                else if(fc>=2)
		                {
		                    fc=fc-2;
		                    //ftc--;
		                }
		                else
		                {
		                    System.out.println("NO");
		                    flag=1;
		                    break;
		                    
		                }
		            }
		            else
		            {
		                System.out.println("NO");
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==1)
		    {
		        continue;
		    }
		    
		    else
		    {
		        System.out.println("YES");
		    }
		    
		    
		}
	}
}
