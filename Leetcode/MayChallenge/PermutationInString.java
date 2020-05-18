class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] pat= new int[26];
        int[] txt= new  int[26];
        Arrays.fill(pat,0);
        Arrays.fill(txt,0);
        int plen=s1.length();int tlen= s2.length();
        for(int i=0;i<plen;i++)
        {
            pat[s1.charAt(i)-'a']++;
            
        }
       
        for(int i =0;i<tlen;i++)
        {
            if(i<plen)
            {
                txt[s2.charAt(i)-'a']++;
                 if(Arrays.equals(txt,pat))
                 {
              
                    return true;
                 }
                continue;
            }
            txt[s2.charAt(i-plen)-'a']--;
            txt[s2.charAt(i)-'a']++;
            if(Arrays.equals(txt,pat))
            {
              
                return true;
            }
        }
        return false;
    }
}
