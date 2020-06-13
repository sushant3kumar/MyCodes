class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length==0)
        {
            List<Integer> nd= new ArrayList<>();
            return nd;
        }
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int[] prev= new int[nums.length];
        Arrays.fill(prev,-1);
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0 && dp[j]+1>dp[i])
                {
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
            if(dp[i]>dp[max])
            {
                max=i;
            }
        }
        List<Integer> a1=new ArrayList<>();
        //a1.add(nums[max]);
        while(max>=0)
        {
            
            a1.add(nums[max]);
            max= prev[max]; 
            
        }
        return a1;
    }
}
