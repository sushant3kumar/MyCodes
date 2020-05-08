class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2= coordinates[coordinates.length-1][0];
        int y2= coordinates[coordinates.length-1][1];
        float m= 0;
        for(int i=0;i<coordinates.length;i++)
        {
            int y = coordinates[i][1];
            int  x = coordinates[i][0];
            if(x2!=x1)
            {
                 m= (float)((y2-y1)/(x2-x1));
            }
            else
            {
                m=1;
                y=y1;
            }
            
            if(y-y1!=m*(x-x1))
            {
                return false;
            }
        }
        return true;
    }
}
