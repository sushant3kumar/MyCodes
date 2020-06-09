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
            int[] a= new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(sc.next());
                c[i]=a[i];

            }
            for(int i=0;i<n;i++)
            {
                b[i]=Integer.parseInt(sc.next());
                hs.add(b[i]);
                
            }
            Arrays.sort(c);
            if(hs.size()==2)
            {
                System.out.println("Yes");
            }
            else
            {
                if(Arrays.equals(a,c))
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
}
