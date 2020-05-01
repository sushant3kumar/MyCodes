class Solution {
    public int subarraySum(int[] nums, int k) {
        int size= nums.length;
        int[] arr = new int[size]; 
        int psum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int fres=0;
        //arr[0]=0;
        for(int i=0;i<size;i++)
        {
            psum+=nums[i];
            arr[i]=psum;
            if(psum==k)
            {
                fres++;
            }
            if(hm.containsKey(psum-k))
            {
                fres+=hm.get(psum-k);
            }
            if(!hm.containsKey(psum))
            {
                hm.put(psum,1);
            }
            else
            {
                hm.put(psum,hm.get(psum)+1);
            }
           
        }
         /*if(hm.containsKey(0))
            {
                fres+=hm.get(0);
            }*/
        return fres;
      
    }
}
