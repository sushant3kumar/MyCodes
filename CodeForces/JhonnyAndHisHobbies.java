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
            int n= Integer.parseInt(sc.next());
            int[] arr=new int[n];
            int[] incount=new int[1025];
            int[] ocount=new int[1025];
            int flag=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(sc.next());
                incount[arr[i]]++;
            }
            for(int i=1;i<=1024;i++)
            {
                Arrays.fill(ocount,0);
                for(int j=0;j<n;j++)
                {
                    int k= arr[j]^i;
                    if(k>=1024)
                    {
                        
                        break;
                    }
                    ocount[k]++;
                }

                if(Arrays.equals(incount,ocount))
                {
                    System.out.println(i);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                continue;
            }
            System.out.println(-1);

        }
    }
}
