class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int pclr=image[sr][sc];
        return ffu(image,sr,sc,pclr,newColor);
    }
    public int[][] ffu(int[][] image,int x,int y,int pclr,int nc)
    {
        if(x>=image.length || y>=image[0].length || x<0 || y<0)
        {
            return image;
        }
        if(image[x][y]!=pclr)
        {
            return image;
        }
        if(pclr==nc)
        {
            return image;
        }
        image[x][y]=nc;
       image= ffu(image,x+1,y,pclr,nc);
       image= ffu(image,x,y+1,pclr,nc);
       image= ffu(image,x-1,y,pclr,nc);
       image= ffu(image,x,y-1,pclr,nc);
        return image;
    }
    
}
