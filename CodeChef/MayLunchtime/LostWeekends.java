import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        
        while(t-->0)
        {
            int[] arr = new int[5];
            int sum=0;
            for(int i=0;i<5;i++)
            {
                arr[i]=Integer.parseInt(sc.next());
                sum+=arr[i];
            }
        
        int p =Integer.parseInt(sc.next());
        if(p*sum>120)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        } 
    }
}
