import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.next());
            int[] arr= new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(sc.next());
            }
            Arrays.sort(arr);
            int j=0;
            int min= Integer.MAX_VALUE;
            while(j<n-1)
            {
                if((int)(Math.abs(arr[j+1]-arr[j]))<min)
                {
                    min=arr[j+1]-arr[j];
                }
                j++;
            }
            System.out.println(min);
           

        }
    }
}
