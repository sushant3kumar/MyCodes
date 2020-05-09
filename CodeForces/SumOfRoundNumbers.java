/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class sorn
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.next());
            int  h =n;
            int arr[]= new int[6];
            int i=0;
            while(h!=0)
            {
                arr[i]=h%10;
                h=h/10;
                i++;
            }
            ArrayList<Integer> a1= new ArrayList<>();
            for(int j =0;j<6;j++)
            {
                if(Math.pow(10,j)*arr[j]!=0)
                {
                    a1.add(arr[j]*(int)Math.pow(10,j));
                }
            } 
            System.out.println(a1.size());
            for(int k=0;k<a1.size();k++)
            {
                System.out.print(a1.get(k)+" ");
            }
            System.out.println("");
        }
	}
}
