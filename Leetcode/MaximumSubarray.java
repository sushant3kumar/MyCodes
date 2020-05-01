class Solution {
    public int maxSubArray(int[] nums) {
        int maxh=0;
        int fmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxh+=nums[i];
             if(maxh>fmax)
            {
                fmax= maxh;
            }
            if(maxh<0)
            {
                maxh=0;
            }
           
        }
        return fmax;
    }
}
