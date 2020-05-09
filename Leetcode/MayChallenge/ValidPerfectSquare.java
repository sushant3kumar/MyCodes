class Solution {
    public boolean isPerfectSquare(int num) {
        int i =1;long sum=0;
        while(sum<(long)num)
        {
            sum=sum+i;
            i=i+2;
            if(sum==(long)num)
                return true;
        }
        return false;
    }
}
