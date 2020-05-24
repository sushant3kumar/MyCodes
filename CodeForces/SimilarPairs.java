import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q3
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
            /*if(even.size()%2==0 && odd.size()%2==0)
            {
                System.out.println("YES");
            }
            */
            Arrays.sort(arr);
            int j=0;
            int even=0,odd=0;
            String ans="NO";
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            if(even%2==0 && odd%2==0)
            {
                ans="YES";
                
            }
            
            else if(even%2==1 && odd%2==1)
           {
          
                while(j<n-1)
                {
                    if(arr[j+1]-arr[j]==1)
                    {
                       
                        ans=("YES");
                        break;
                    }
                    j++;
                 }
                 
            }
            else
            {
                ans="NO";
            }
            System.out.println(ans);
            

        }
    }
}
