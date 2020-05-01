class Solution {
    public int search(int[] nums, int target) {
        int pivot= findPivot(nums,0,nums.length-1);
        if(pivot==-1)
        {
            return binarysearch(nums,0,nums.length-1,target);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(nums[0]<=target)
        {
            return binarysearch(nums,0,pivot-1,target);
        }
        return binarysearch(nums,pivot+1,nums.length-1,target);
        
    }
    public int binarysearch(int[] nums,int low,int high,int target)
    {
        if(high<low)
        {
            return -1;
        }
        int mid = (high+low)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(target<nums[mid])
        {
            return binarysearch(nums,low,mid-1,target);
        }
        return binarysearch(nums,mid+1,high,target);
    }
    public int findPivot(int[] nums,int low,int high)
    {
        if(low>high)
        {
            return -1;
        }
        if(low==high)
        {
            return low;
        }
        int mid= (low+high)/2;
        if(mid<high && nums[mid+1]<nums[mid])
        {
            return mid;
        }
        if(mid>low && nums[mid-1]>nums[mid])
        {
            return mid-1;
        }
        if(nums[low]>=nums[mid])
        {
            return findPivot(nums,low,mid-1);
        }
        return findPivot(nums,mid+1,high);
    }
}
