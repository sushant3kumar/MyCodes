class StockSpanner {

    public StockSpanner() {
        a1=new ArrayList<>();
    }
    public ArrayList<Integer> a1;
    public int next(int price) {
        int count=1;
        a1.add(price);
        if(a1.size()==1)
        {
            return 1;
        }
        else
        {
            for(int i=a1.size()-2;i>=0;i--)
            {
                if(a1.get(i)>price)
                {
                    break;
                }
                if(a1.get(i)<=price)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
