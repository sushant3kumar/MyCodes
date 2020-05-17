import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        //Scanner sc = new Scanner(System.in);
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
       // BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int t= Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] ar= br.readLine().split(" ");
            long a1 = Long.parseLong(ar[0]);
            long k = Long.parseLong(ar[1]);
            long b=a1;
            k--;
            while(k-->0)
            {
                long prod=prodof(a1);
                if(prod==0)
                {
                    break;
                }
                a1+=prod;
            }
            System.out.println(a1);

        }
    }
    public static long prodof(long a)
    {

        long smallest = 10; 
        long largest=0;
        while(a != 0)  
        { 
            long r = a % 10; 
            smallest = Math.min(r, smallest); 
           
            largest=Math.max(r,largest);
            
            a = a / 10; 
            if(smallest==0 || largest==0)
            {
                return 0;
            }
            
        } 
    return smallest*largest;
    }
   
}
