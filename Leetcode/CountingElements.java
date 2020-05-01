class Solution {
    public int countElements(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(hm.containsKey(arr[j]+1))
            {
               // System.out.print(hm.get(arr[j]+1)-1);
                if(hm.get(arr[j]+1)!=0)
                {
                    // System.out.print("xx");
                   // hm.put(arr[j]+1,hm.get(arr[j])-1);
                    count++;
                }
              
            }
        }
        return count;
    }
}
