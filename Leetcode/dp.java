import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class tc2
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine());
            String[] ab= br.readLine().split(" ");
            String[] ab2= br.readLine().split(" ");
            int[] hg= new int[n];
            int[] pw= new int[n];
            for(int i =0;i<n;i++)
            {
                hg[i]=Integer.parseInt(ab[i]);
                pw[i]=Integer.parseInt(ab2[i]);
            }
            if(n==1)
            {
                System.out.println(pw[0]);
                continue;
            }
            int i =0;
            long sum=0;
            int ft=0;
            int flag2=0;
            while(i<n-1)
            {
                 
                 ft=i;
                 int flag=0;
                while(i<n-1 && hg[i]==hg[i+1] )
                {
                    if(i+1==n-1)
                    {
                        flag2=1;
                    }
                    i++;
                    flag=1;
                    
                }
                if(flag==0)
                 {
                     sum+=pw[i];
                     i++;
                     continue;
                 }
                if(i-ft==1)
                {
                    sum+=Math.max(pw[ft],pw[ft+1]);
                    i++;
                    continue;
                }
                int[] dp = new int[i-ft+1];
                dp[0]=pw[ft];
                dp[1]=Math.max(pw[ft],pw[ft+1]);
                int ind=0;
                for(ind=2; ind<i-ft+1;ind++)
                {
                    dp[ind]=Math.max(pw[ind+ft]+dp[ind-2],dp[ind-1]);
                    
                }
               
                sum+=dp[ind-1];
                i++;
               
            }
            
            if(flag2==0)
            {
                sum+=pw[n-1];
            }
           System.out.println(sum);
        }
    }
}
