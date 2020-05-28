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
            int m = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            String[] ab = new String[m];
            for(int i=0;i<m;i++)
            {
                ab[i]=sc.next();
            }
            long ans =0;
            for(int i =0;i<m;i++)
            {
                String a = ab[i];
                int j=0;
                for( j=0;j<n;j++)
                {
                    //String a= ab[i]
                    if(j!= n-1 && a.charAt(j)=='.' && a.charAt(j+1)=='.')
                    {
                        ans+=Math.min(y,2*x);
                        j++;
                        
                    }
                    else if(a.charAt(j)=='.')
                    {
                        ans+=x;
                        
                    }

                }
               
            }
            System.out.println(ans);
        }
    }
}
