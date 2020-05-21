class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        for(int i =1;i<matrix.length;i++)
        {
            if(matrix[i][0]==1)
            {
                count++;
            }
        }
        for(int i =0;i<matrix[0].length;i++)
        {
            if(matrix[0][i]==1)
            {
                count++;
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]!=0)
                {
                    int sq= 1+Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1]));
                    count+=sq;
                     matrix[i][j]=sq;
                }
               
            }
        }
        return count;
    }
}
