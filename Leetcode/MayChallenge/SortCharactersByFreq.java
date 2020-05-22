class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        List<Map.Entry<Character,Integer>> lm= new LinkedList<>(hm.entrySet());
        Collections.sort(lm,new mycomp());
        String temp="";
        for(int i =0;i<lm.size();i++)
        {
               int k=lm.get(i).getValue(); 
               char el=lm.get(i).getKey();
        
            while(k-->0)
            {
                temp=temp+el;
            }
        }
        return temp;
        
    }
    class mycomp implements Comparator<Map.Entry<Character,Integer>>
    {
        public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2)
        {
            return (o2.getValue().compareTo(o1.getValue()));
            
        }
    }
}
