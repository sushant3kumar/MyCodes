class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
                    
                    if(hm.get(nums[i])>nums.length/2)
                    {
                        return nums[i];
                    }
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        return -1;
    }
}
