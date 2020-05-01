/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> ar = new ArrayList<>();
        ar=binaryMatrix.dimensions();
        int a= ar.get(0)-1;
        int b= ar.get(1)-1;
        int sz=a;
        int flag=0;
        int i=0;int j=b;
        System.out.println(a+" "+b);
        //System.out.println(binaryMatrix.get(i,j));
        while(j>0 && i<sz)
        {
            if(binaryMatrix.get(i,j)==0)
            {
                i++;
                //flag=1;
                // System.out.println(b);
            }
            if(binaryMatrix.get(i,j)==1)
            {
                j--;
                flag=1;
                //System.out.println(a);
            }
        }
        if(flag==1)
        {
            if(binaryMatrix.get(i,j)==0)
            {
                return j+1;
            }
            else
            {
                return j;
            }
            
        }   
        else{
           return -1; 
        }
            
        
        
    }
}
