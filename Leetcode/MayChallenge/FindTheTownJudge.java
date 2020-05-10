class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] inIndex= new int[N+1];
        int[] outIndex= new int[N+1];
        for(int i =0;i<trust.length;i++)
        {
            outIndex[trust[i][0]]++;
            inIndex[trust[i][1]]++;
        }
        for(int i=1;i<=N;i++)
        {
            if(outIndex[i]==0 && inIndex[i]==N-1)
            {
                return i;
            }
        }
        return -1;
    }
}
