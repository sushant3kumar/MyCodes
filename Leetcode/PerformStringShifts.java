class Solution {
    public String stringShift(String s, int[][] shift) {
        int res=0;
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<shift.length;i++)
        {
            if(shift[i][0]==1)
            {
                res=res+shift[i][1];
            }
            else
            {
                res-=shift[i][1];
            }
        }
         if(res>s.length() || res<s.length())
           {
               res=res%s.length();
           }
       if(res==0)
       {
           return s;
       }
       else if(res<0)
       {
            res=Math.abs(res);
          
           String a = s.substring(0,res);
           str.delete(0,res);
           str.append(a);
           return str.toString();
       }
        else
        {
            String b = s.substring(s.length()-res,s.length());
            str.delete(s.length()-res,s.length());
            str.insert(0,b);
            return str.toString();
        }
        
    }
}
