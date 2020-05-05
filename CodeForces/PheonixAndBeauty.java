

import java.util.*;

public class PheonixAndBeauty {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n=Integer.parseInt(sc.next());
            int k=Integer.parseInt(sc.next());
            int[] arr= new int[n];
            HashSet<Integer> hs= new HashSet<>();
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(sc.next());
                hs.add(arr[i]);
            }
            ArrayList<Integer> ar =new ArrayList<>();
            if(hs.size()>k)
            {
                System.out.println(-1);
                continue;
            }
            else
            {
                for(int i: hs)
                {
                    ar.add(i);
                }
                while(ar.size()!=k)
                {
                    ar.add(1);
                }
                
               // int count=1;
                System.out.println(n*(ar.size()));
                for(int i =0;i<n;i++)
                {
                    for(int j=0;j<ar.size();j++)
                    {
                        System.out.print(ar.get(j)+" ");
                    }
                   // count++;
                }
            }

        }
    }
    
}
