class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int plen= p.length();int slen= s.length();
        List<Integer> al= new ArrayList<>();
        char[] arr= new char[26]; 
        char[] txt= new char[26];
        int i=0;
        if(s.equals("") || p.equals("") ||slen<plen)
        {
            return al;
        }
        for(i=0;i<plen;i++)
        {
            arr[p.charAt(i)-'a']++;
            txt[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,txt))
        {
            al.add(i-plen);
        }
        int j=0;
        for( j = plen;j<slen;j++)
        {
            txt[s.charAt(j-plen)-'a']--;
            txt[s.charAt(j)-'a']++;
            if(Arrays.equals(arr,txt))
            {
                al.add(j-plen+1);
            }
        }
       
        return al;
    }
}
