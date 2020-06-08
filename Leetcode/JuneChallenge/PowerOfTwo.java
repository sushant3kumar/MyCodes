class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        {
            return false;
        }
        double ans= (Math.log(n)/Math.log(2));
        if((long)ans== Math.ceil(ans) || Math.pow(2,(long)ans)==(double)n)
            return true;
        return false;
    }
}
