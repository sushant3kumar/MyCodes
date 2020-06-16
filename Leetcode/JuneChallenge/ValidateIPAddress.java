class Solution {
    public String validIPAddress(String IP) {
        if(IP.chars().filter(ch ->ch=='.').count()==3)
        {
            return ip4(IP);
        }
        else if(IP.chars().filter(ch ->ch==':').count()==7)
        {
            return ip6(IP);
        }
        else
        {
            return "Neither";
            
        }
    }
    public String ip4(String ip)
    {
        String[] a= ip.split("\\.",-1);
       //for(int i=0;i<a.length;i++)
       //{
           //System.out.println(a.length);
       //}
        if(a.length!=4)
        {
            return "Neither";
        }
        for(String x:a)
        {
            
           // else if
            //{
                for(char c: x.toCharArray())
                {
                    if(!Character.isDigit(c))
                    {
                        return "Neither";
                    }
                }
           // }
            //System.out.println(x.charAt(0)+" "+x.length());
            if(x.length()==0 || x.length()>3)
            {
                return "Neither";
            }
            else if(x.charAt(0)=='0' && x.length()>1)
            {
                return "Neither";
            }
            else if(Integer.parseInt(x)<0 || Integer.parseInt(x)>255)
            {
                return "Neither";
            }
            
        }
        return "IPv4";
    }
     public String ip6(String ip)
    {
         String[] a =ip.split(":",-1);
         String b="0123456789abcdefABCDEF";
         for(String x:a)
         {
             if(x.length()==0|| x.length()>4)
             {
                 return "Neither";
             }
             for(char c:x.toCharArray())
             {
                 if(b.indexOf(c)==-1)
                 {
                     return "Neither";
                 }
             }
         }
         return "IPv6";
         
    }
}
