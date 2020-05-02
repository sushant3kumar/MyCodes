/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first =0;
        int last= n;
        int mid=0,lastf=0;
        while(first<=last)
        {
            mid=first+(last-first)/2;
            if(!isBadVersion(mid))
            {
                first=mid+1;
            }
            else
            {
                last=mid-1;
            }
            
        }
        if(isBadVersion(mid))
        {
            return mid;
        }
        return mid+1;
        
    }
}
