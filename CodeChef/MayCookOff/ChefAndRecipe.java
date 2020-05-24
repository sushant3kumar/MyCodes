/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.next());
            int[] arr= new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(sc.next());
            }
            ArrayList<Integer> a1 = new ArrayList<>();
            a1.add(arr[0]);
            for(int i=1;i<n;i++)
            {
                if(arr[i]!=arr[i-1])
                {
                    a1.add(arr[i]);
                }
            }
            HashSet<Integer> hs = new HashSet<>();
            int flag=0;
            for(int i=0;i<a1.size();i++)
            {
                if(!hs.add(a1.get(i)))
                {
                    System.out.println("NO");
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                continue;
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(hm.containsKey(arr[i]))
                {
                    hm.put(arr[i],hm.get(arr[i])+1);
                }
                else
                {
                    hm.put(arr[i],1);
                }
            }
            int flag1=0;
            for(Map.Entry k: hm.entrySet())
            {
                for(Map.Entry l: hm.entrySet())
                {
                    if(k.getValue()==l.getValue() && k.getKey()!=l.getKey())
                    {
                        System.out.println("NO");
                        flag1=1;
                        break;
                    }
                }
                if(flag1==1)
                {
                    break;
                }
            }
            if(flag1==1)
            {
                continue;
            }
            System.out.println("YES");
        }
	}
}
