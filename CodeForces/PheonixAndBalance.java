
import java.util.*;

public class PheonixAndBalance {

    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n= Integer.parseInt(sc.next());
            int[] arr= new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=(int)Math.pow(2,i+1);
                sum+=arr[i];
            }
            int d=n/2;
            int sp=0; int fp= d-1;
            int rsum=0;
            for(int i=sp;i<=fp;i++)
            {
                rsum+=arr[i];
            }
            int psum=0;
            while(fp<arr.length && rsum<sum/2)
            {
                sp++;fp++;
                psum=rsum;
                rsum=0;
                for(int i=sp;i<=fp;i++)
                {
                     rsum+=arr[i];
                }
               

            }
            int a=sum-psum;int b=psum;
           
            System.out.println(Math.abs(a-b));
        }
    }
    
}