class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] a1= J.toCharArray();
        char[] a2= S.toCharArray();
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<a2.length;i++)
        {
            if(hm.containsKey(a2[i]))
            {
                hm.put(a2[i], hm.get(a2[i])+1);
            }
            else
            {
                hm.put(a2[i],1);
            }
        }
        int count=0;
        for(int i=0;i<a1.length;i++)
        {
            if(hm.containsKey(a1[i]))
            {
                count+=hm.get(a1[i]);
            }
        }
        return count;
    }
}
