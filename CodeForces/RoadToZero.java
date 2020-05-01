import java.util.*;
//import java.lang.*;


public class cf1{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0)
        {
            long x=  Long.parseLong(sc.next());
            long y=  Long.parseLong(sc.next());
            long a=  Long.parseLong(sc.next());
            long b= Long.parseLong(sc.next());
            if(x==0 && y==0)
            {
                System.out.println(0);
                continue;
            }
            long count=0;
            count = Math.abs(x-y);
            long res=a*count;
            long gres= res;
            count=x<y?x:y;
            res+=b*count;
            //System.out.println(res);
            long pr=a<b?a:b;
            long fres=0;
            if(pr==a)
            {
                fres=2*count*pr;
            }
            else
            {
                fres=count*pr;
            }
            //long fres= count*pr;
            fres+=gres;
            System.out.println(fres<res?fres:res);


        }
        sc.close();
        
    }
}
