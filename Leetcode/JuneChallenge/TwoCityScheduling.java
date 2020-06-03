class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,new mycomp());
        int cost=0;
        for(int i=0;i<costs.length;i++)
        {
            if(i<costs.length/2)
            {
                cost+=costs[i][1];
            }
            else
            {
                cost+=costs[i][0];
            }
        }
        return cost;
    }
   
}
 class mycomp implements Comparator<int[]>
    {
        public int compare(int[] a,int[] b)
        {
            return((a[1]-a[0])-(b[1]-b[0]));
        }
    }
