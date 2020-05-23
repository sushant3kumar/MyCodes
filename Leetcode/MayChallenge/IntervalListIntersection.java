class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int l= Math.min(A.length,B.length);
        int[][] ans= new int[3*Math.max(A.length,B.length)][2];
        int k=0;
        for(int i=0;i<A.length;i++)
        {
           for(int j=0;j<B.length;j++)
           {
               int s1=A[i][0],s2=B[j][0],e1=A[i][1],e2=B[j][1];
                if((s2<=e1 && e2>=s1))
                {
                    ans[k][0]=Math.max(s1,s2);
                    ans[k][1]=Math.min(e1,e2);
                   // System.out.print(ans[k][0]+" "+ans[k][1]);
                    k++;
                }
           }
        }
        int[][] fa= new int[k][2];
        for(int i=0;i<k;i++)
        {
            fa[i][0]=ans[i][0];
            fa[i][1]=ans[i][1];
        }
        return fa;
    }
}
