import  java.util.*;

public class binaryPeriod {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0)
        {
            String str= sc.next();
            HashSet<Character> hs = new HashSet<>();
            char[] arr = str.toCharArray();
            //int count=0;
            for(int i=0;i<arr.length;i++)
            {
                hs.add(arr[i]);
                if(arr[i]==0)
                {
                    //count++;
                }
            }
            char a='0';
            char b='0';
            
            if(hs.size()==1)
            {
                String r1="";
                for(int i=0;i<2*arr.length;i++)
                {
                    
                   r1=r1+arr[0];
                }
                System.out.println(r1);
                continue;
            }
            else
            {
                for(int i=0;i<arr.length-1;i++)
                {
                    if(arr[i]!=arr[i+1])
                    {
                        a=arr[i];
                        b= arr[i+1];
                        break;
                    }
                }
                String nb= String.valueOf(a)+String.valueOf(b);
                String gf="";
                for(int i=0;i<arr.length;i++)
                {
                    gf+=nb;
                }
                System.out.println(gf);
            }
           
        }
        sc.close();
    }

}