import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        
        while(t-->0)
        {
            int size=Integer.parseInt(sc.next());
            long[] a1= new long[size];
            long[] a2 = new long[size];
            for(int i=0;i<size;i++)
            {
                a1[i]=Long.parseLong(sc.next());
            }
            for(int i=0;i<size;i++)
            {
                a2[i]=Long.parseLong(sc.next());
            }
            for(int i=1;i<size;i++)
            {
                a1[i]=a1[i]+a1[i-1];
                a2[i]=a2[i]+a2[i-1];
            }
            long[] ab1= new long[size+1];
            long[] ab2= new long[size+1];
            ab1[0]=0;ab2[0]=0;
            for(int i=0;i<size;i++)
            {
                ab1[i+1]=a1[i];
                ab2[i+1]=a2[i];
            }
            long ans= 0;
          
           for(int i=0;i<size;i++)
           {
               if(ab1[i]==ab2[i] && ab1[i+1]==ab2[i+1])
               {
                   ans+=(ab1[i+1]-ab1[i]);
               }
           }

           System.out.println(ans);
           

            

        }
    }
}
