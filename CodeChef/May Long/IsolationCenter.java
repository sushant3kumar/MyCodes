
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class IsolationCenter {

	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int[] arr= new int[26];
            Arrays.fill(arr,0);
            int n= Integer.parseInt(sc.next());
            int q= Integer.parseInt(sc.next());
            String str= sc.next();
            int[] q1= new int[q];
            for(int i=0;i<q;i++)
            {
                q1[i]=Integer.parseInt(sc.next());
            }
            for(int i=0; i<str.length();i++)
            {
                arr[str.charAt(i)-'a']=arr[str.charAt(i)-'a']+1;
            }
            ArrayList<Integer> a1= new ArrayList<>();
            for(int i=0;i<26;i++)
            {
                if(arr[i]>=1)
                {
                    a1.add(arr[i]);
                }
            }
            for(int i=0;i<q;i++)
            {
                int fsum=0;
                for(int j=0;j<a1.size();j++)
                {
                    if(q1[i]<a1.get(j))
                    {
                        fsum+=(a1.get(j)-q1[i]);
                    }
                    
                }
                System.out.println(fsum);
            }
           
        }
	}
}
