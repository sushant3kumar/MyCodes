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
            int k = Integer.parseInt(sc.next());
            ArrayList<Integer> a1= new ArrayList<>();
            ArrayList<Integer> a2= new ArrayList<>();
            for(int i =0;i<n;i++)
            {
                a1.add(Integer.parseInt(sc.next()));
            }
            for(int i =0;i<n;i++)
            {
                a2.add(Integer.parseInt(sc.next()));
            }
            Collections.sort(a1);
            Collections.sort(a2,Collections.reverseOrder());
            int index=0;
            while(index<n && k>0)
            {
                if(a1.get(index)<a2.get(index))
                {
                    int a2e=a2.get(index);
                    int a1e=a1.get(index);
                    a1.set(index, a2e);
                    a2.set(index, a1e);
                    k--;
                }
                index++;
            }
            int sum=0;
            for(int i =0;i<n;i++)
            {
                sum+=a1.get(i);
            }
            System.out.println(sum);
          
        }
    }
}
