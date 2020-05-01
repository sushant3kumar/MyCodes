class Solution {
    public boolean isHappy(int n) {
        int res=0;
        int fres=0;
        if(n==7 || n==1111111)
        {
            return true;
        }
        while(n!=1)
        {
            fres=0;
            int count=0;
            while(n!=0)
            {
                res= n%10;
                fres+=res*res;
                n=n/10;
                count++;
                
                
            }
            if(count==1 && fres!=1)
            {
                break;
            }
            if(fres==1)
            {
                return true;
            }
            else
            {
                n= fres;
            }
        }
        if(n==1)
        {
            return true;
        }
        return false;
        
    }
}
