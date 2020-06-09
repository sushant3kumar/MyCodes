class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        int count=0;
        for(int i=0;i<s.length();)
        {
            int flag=0;
            for(int j=k;j<t.length();j++)
            {
                if(i>=s.length())
                {
                    break;
                }
                if(s.charAt(i)==t.charAt(j))
                {
                    i++;
                    k=j+1;
                    count++;
                    flag=1;
                }
            }
            if(flag==0)
            {
                if(i<s.length())
                {
                    i++;
                }
            }
        }
        if(count==s.length())
        {
            return true;
        }
        return false;
    }
}
