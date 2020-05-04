class Solution {
    public int findComplement(int num) {
        String str= Integer.toBinaryString(num);
        char[] arr= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                arr[i]='0';
            }
            else
            {
                arr[i]='1';
            }
        }
        String fstr = new String(arr);
        return(Integer.parseInt(fstr,2));
        
    }
}
