class Solution {
    public void solve(char[][] board) {
        if(board.length==0)
        {
            return;
        }
        int row=board.length;
        int col= board[0].length;
        int[][] arr= new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(((i==0||j==0) || (i==row-1 ||j==col-1)) && board[i][j]=='O')
                {
                    arr[i][j]=1;
                    continue;
                }
                if(board[i][j]=='X')
                {
                    arr[i][j]=-1;
                    continue;
                }
                if(board[i][j]=='O')
                {
                    arr[i][j]=0;
                }
                
            }
        }
        /*for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }*/
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==1)
                {
                    dfs(arr,i,j,row,col);
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==0)
                {
                    board[i][j]='X';
                }
                if(arr[i][j]==1)
                {
                    board[i][j]='O';
                }
            }
        }
       
        
    }
   /* public boolean isValid(int x,int y,int row,int col)
    {
        if(x>=0 && x<row && y>=0 && y<col)
        {
            return true;
        }
        return false;
    }
    */
    public void dfs(int[][] arr, int x,int y,int row,int col)
    {
        if(x<0 || x>=row || y<0 || y>=col)
        {
            return;
        }
        if(arr[x][y]==0)
        {
            arr[x][y]=1;
        }
        if(x<row-1 && arr[x+1][y]==0)
        {
            dfs(arr,x+1,y,row,col);
        }
        if(y<col-1 && arr[x][y+1]==0)
        {
            dfs(arr,x,y+1,row,col);
        }
        if(x>=1 && arr[x-1][y]==0)
        {
             dfs(arr,x-1,y,row,col);
        }
        if(y>=1 && arr[x][y-1]==0)
        {
            dfs(arr,x,y-1,row,col);
        }
        
       
        
    }
}
/*class el
{
    int x,y;
    el(int x,int y)
    {
        x= this.x;
        y= this.y;
    }
}
*/
