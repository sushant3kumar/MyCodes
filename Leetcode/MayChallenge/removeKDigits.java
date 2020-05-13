class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int p=k;
        if(k>=num.length())
        {
            return "0";
        }
        for(int i =0;i<num.length();i++)
        {
            while(!st.isEmpty() && st.peek()>num.charAt(i) && p>0)
            {
                //System.out.print(st.peek()+" ");
                st.pop();       
                p--;
            }
            //System.out.println("");
            if(st.size()<=(num.length()-k) )
            {
                //System.out.print(num.charAt(i)+" ");
                st.push(num.charAt(i));
            }
        }
        //System.out.println(st.size());
        String res="";
        while(!st.isEmpty())
        {
            res=st.peek()+res;
            st.pop();
        }
        int fd=0;
        System.out.println(res);
        while(res.charAt(fd)=='0' && fd<res.length()-1)
        {
            fd++;
        }
        if(fd>res.length()-1)
        {
            return "0";
        }
        String fr= res.substring(fd);
        System.out.print(fr);
        if(fr.length()>(num.length()-k))
        {
            fr=fr.substring(0,((num.length()-k)));
        }
        if(fr.length()<(num.length()-k) &&fd==0)
        {
            fr=num.substring(k);
        }
        return fr;
    }
}
