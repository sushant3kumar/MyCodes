class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
       if(dungeon.length==0 ||dungeon[0].length==0)
       {
           return 0;
       }
        int row= dungeon.length;
        int col= dungeon[0].length;
        int[][] dp = new int[row+1][col+1];
        for(int i=0;i<row+1;i++)
        {
            for(int j=0;j<col+1;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        dp[row-1][col]=1;
        dp[row][col-1]=1;
        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>=0;j--)
            {
                int a =Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j];
                a=a<=0?1:a;
                dp[i][j]=a;
            }
        }
        return dp[0][0];
}
}
