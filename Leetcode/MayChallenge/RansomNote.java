class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm= new HashMap<>();
        HashMap<Character,Integer> hm1= new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        for(int i =0;i<ransomNote.length();i++)
        {
             hs.add(ransomNote.charAt(i));
            if(hm.containsKey(ransomNote.charAt(i)))
            {
                hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))+1);
            }
            else
            {
                hm.put(ransomNote.charAt(i),1);
            }
        }
        for(int i =0;i<magazine.length();i++)
        {
           
            if(hm1.containsKey(magazine.charAt(i)))
            {
                hm1.put(magazine.charAt(i),hm1.get(magazine.charAt(i))+1);
            }
            else
            {
                hm1.put(magazine.charAt(i),1);
            }
        }
        int count=0;
        for(char r: hs)
        {
            // System.out.println(r);
           if(hm.containsKey(r) && hm1.containsKey(r))
           {
              
               if(hm1.get(r)>=hm.get(r))
               {
                   
                   continue;
               }
               else
               {
                   count++;
               }
           }
           else if(hm.containsKey(r) && !hm1.containsKey(r))
           {
               count++;
           }
           else//(!hm.containsKey(r) && hm1.containsKey(r))
           {
               count++;
           }
            
            
        }
        if(count!=0)
        {
            return false;
        }
        return true;
        
    }
}
