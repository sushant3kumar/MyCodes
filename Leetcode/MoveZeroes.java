class Solution {
    public void moveZeroes(int[] nums) {
        //int[] arr = new int[nums.length+1];
        int j=0,count=0;
        int g= nums.length;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]!=0)
           {
               nums[count++]=nums[i];
               //j++;
           }
       }
       while(count<g)
       {
           nums[count++]=0;
       }
        
    }
}
