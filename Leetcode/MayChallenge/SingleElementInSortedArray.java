class Solution {
    public int singleNonDuplicate(int[] nums) {
        return search(nums,0,nums.length-1);
    }
    public int search(int[] arr,int low,int high)
    {
        if(low>high)
        {
            return -1;
        }
        if(low==high)
        {
            return arr[low];
        }
        int mid=low+(high-low)/2;
        if(mid%2==0)
        {
            if(arr[mid]!=arr[mid+1])
            {
                return search(arr,low,mid);
            }
            else
            {
                return search(arr,mid+2,high);
            }
        }
        else if(mid%2!=0)
        {
            if(arr[mid]==arr[mid-1])
            {
                return search(arr,mid+1,high);
            }
            else
            {
                return search(arr,low,mid-1);
            }
        }
        return -1;
            
    }
}
