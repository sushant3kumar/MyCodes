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
            int n= Integer.parseInt(sc.next());
            int m= Integer.parseInt(sc.next());
            int[][] arr= new int[n][m];
            //int count=0;
            HashSet<Integer> row= new HashSet<>();
            HashSet<Integer> col= new HashSet<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=Integer.parseInt(sc.next());
                    if(arr[i][j]==1)
                    {
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            int count= Math.min(n-row.size(),m-col.size());
            if(count%2==0)
            {
                System.out.println("Vivek");
            }
            else
            {
                System.out.println("Ashish");
            }
        }
    }
}
