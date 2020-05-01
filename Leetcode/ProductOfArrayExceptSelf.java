class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
       if(nums.length==1)
       {
           return res;
       }
        
        int temp=1;
        for(int k=0;k<res.length;k++)
        {
            res[k]=1;
        }
        for(int i=0;i<res.length;i++)
        {
            res[i]=temp;
            temp*=nums[i];
        }
        temp=1;
        for(int j=res.length-1;j>=0;j--)
        {
            res[j]*=temp;
            temp*=nums[j];
        }
        return res;
    }
}
