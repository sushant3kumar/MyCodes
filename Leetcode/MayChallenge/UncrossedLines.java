class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int k=0;
        int ans=0;int[][] dp = new int[A.length+1][B.length+1];
        for(int i =0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                if(A[i]==B[j])
                {
                   dp[i+1][j+1]=1+dp[i][j];
                }
                else
                {
                    dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[A.length][B.length];
    }
}
