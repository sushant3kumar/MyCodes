class Solution {
    public int maxProfit(int[] prices) {
        int size= prices.length;
        int fp=1,sp=0;
        int flag=0;
        int by =0, sl=0;
        int profit=0;
        while(fp!=size)
        {
            if(prices[fp]>prices[sp])
            {
                by= prices[sp];
                sl=prices[fp];
                fp++;
                sp++;
                System.out.print(sl-by+"  ");
                profit+=sl-by;
            }
            else
            {
               sp=fp;
               fp=fp+1;
            }
        }
     
        return profit;
        
    }
}
