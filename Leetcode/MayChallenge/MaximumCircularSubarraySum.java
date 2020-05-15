class Solution {
    public int maxSubarraySumCircular(int[] A) {
        
        int maxk = kadene(A);
        int fsum=0;
        int count=0;
        for(int i =0;i<A.length;i++)
        {
            fsum+=A[i];
            if(A[i]<0)
            {
                count++;
            }
            A[i]=-A[i];
        }
        if(count==A.length)
        {
            return maxk;
        }
         fsum= fsum+kadene(A);
        return fsum>maxk?fsum:maxk;
       
    }
    public static int kadene(int[] A)
    {
        int lmax=Integer.MIN_VALUE;
        //int gmax=Integer.MIN_VALUE;
        int sum=0;
        for(int i =0;i<A.length;i++)
        {
            sum=sum+A[i];
            if(sum>lmax)
            {
                lmax=sum;
            }
             if(sum<=0)
            {
                sum=0;
            }
        }
        return lmax;
    }
}
