import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q3
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        
        while(t-->0)
        {
            int n =Integer.parseInt(sc.next());
            int[] ac= new int[26];
            int[] bc= new int[26];
            String a = sc.next();
            String b =sc.next();
            char maxa=0;
            char maxb=0;
            int flag1=0;
            for(int i=0;i<n;i++)
            {
               if(b.charAt(i)>a.charAt(i))
               {
                   System.out.println(-1);
                   flag1=1;
                   break;
                 
               }

                ac[a.charAt(i)-'a']++;
                bc[b.charAt(i)-'a']++;
            }
            if(flag1==1)
            {
                continue;
            }
            int flag=0;
            for(int i=0;i<26;i++ )
            {
                if(bc[i]>0 && ac[i]==0)
                {
                    System.out.println(-1);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                continue;
            }
            char[] a1= a.toCharArray();
            char[] b1 = b.toCharArray();
            ArrayList<ArrayList<Integer>> fin= new ArrayList<>();
            int index=0;
            int count=0;
            while(!Arrays.equals(a1, b1))
            {
                count++;
                ArrayList<Integer> al= new ArrayList<>();
                int i=0;
                for( i =0;i<n;i++)
                {
                    if(b1[i]!=a1[i])
                    {
                        al.add(i);
                        break;
                    }
                }
                a1[i]=b1[i];
                for(int k=0;k<n;k++)
                {
                    if(a.charAt(k)==b1[i] )
                    {
                        al.add(0,k);
                        //System.out.println(a.charAt(k)+" "+k+" "+i);
                        break;
                    }
                }
                
                for(int j=i+1;j<n;j++)
                {
                    if(b1[j]==b1[i] && a1[j]!=b1[i] && a1[j]>=a1[i] )
                    {
                        al.add(j);
                        a1[j]=b1[j];
                        
                    }
                }
                int gh=al.size();
                al.add(0,gh );
                fin.add(al);
               
            }   
            System.out.println(count);
            for(int i=0;i<fin.size();i++)
            {
                for(int j=0;j<fin.get(i).size();j++)
                {
                    System.out.print(fin.get(i).get(j)+" ");
                }
                System.out.println("");
            }


        }
    }
}
