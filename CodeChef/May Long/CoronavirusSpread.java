/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CorornaVirusSpread
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int sz= Integer.parseInt(sc.next());
            int[] arr= new int[sz];
            for(int i=0;i<sz;i++)
            {
                arr[i]=Integer.parseInt(sc.next());
            }
            int min= Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int sp=0,fp=1;
            int count1=1;int count2=1,i=0;
           while(i+1<sz)
           {
               count1=1;
               while( i+1<sz && arr[i+1]-arr[i]<=2 )
               {
                   count1++;
                   i++;

               }
               if(count1<min)
               {
                   min=count1;
               }
               if(count1>max)
               {
                   max=count1;
               }
               i++;

            }
            if(arr[sz-1]-arr[sz-2]>2)
            {
                min=1;
            }
           
            System.out.println(min+" "+max);
           
        }
	}
}
