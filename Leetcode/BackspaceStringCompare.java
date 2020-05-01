class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder st1= new StringBuilder(S);
        StringBuilder st2= new StringBuilder(T);
        for(int i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)=='#')
            {
                if(i-1>=0)
                {
                    st1.deleteCharAt(i);
                    st1.deleteCharAt(i-1);
                    i=-1;
                }
                else
                {
                    st1.deleteCharAt(i);
                    i=-1;
                }
                 
               
            }
        }
        int j=0;
         for(j=0;j<st2.length();j++)
        {
            if(st2.charAt(j)=='#')
            {
                if(j-1>=0)
                {
                    st2.deleteCharAt(j);
                    st2.deleteCharAt(j-1);
                    //System.out.println(j);
                    j=-1;
                }
                else
                {
                    //System.out.print("xx");
                    st2.deleteCharAt(j);
                    j=-1;
                }
                 
            }
        }
         
       System.out.println(st1+" "+ st2);
        if(st1.toString().equals(st2.toString()))
        {
             
            return true;
        }
        else
        {
            return false;
        }
    }
}
