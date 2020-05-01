class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<stones.length;i++)
        {
            ar.add(stones[i]);
        }
        Collections.sort(ar);
        while(ar.size()>1)
        {
            Collections.sort(ar);
            int a= ar.get(ar.size()-2);
            int b= ar.get(ar.size()-1);
            if(a==b)
            {
                ar.remove(ar.size()-1);
                ar.remove(ar.size()-1);
                
            }
            else
            {
                ar.remove(ar.size()-1);
                ar.remove(ar.size()-1);
                ar.add(Math.abs(a-b));
            }
        }
        if(!ar.isEmpty())
        {
            return ar.get(0);
        }
        return 0;
    }
}
