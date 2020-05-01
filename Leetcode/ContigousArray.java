class Solution {
    public int findMaxLength(int[] nums) {
        int[] prs= new int[nums.length];
        int ans =0;
        HashMap<Integer,Integer> fans= new HashMap<>();
        fans.put(0,0);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        int temp=0;
        for(int j=0;j<nums.length;j++)
        {
            temp+=nums[j];
            prs[j]=temp;
            //System.out.print(prs[j]+" ");
            if(fans.containsKey(prs[j]))
            {
                ans=Math.max(ans,Math.abs(fans.get(prs[j])-j)+1);
                //System.out.print(Math.abs(fans.get(prs[j])-j+1));
            }
            else
            {
                fans.put(prs[j],j+1);
            }
        }
       
       
        return ans;
        
            
    }
}
