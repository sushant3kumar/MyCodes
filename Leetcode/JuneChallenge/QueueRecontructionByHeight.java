class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new mycomp());
        //int gr= people[0][0];
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);       
        }
        return res.toArray(new int[people.length][]);
    }
}
class mycomp implements Comparator<int[]>
{
    public int compare(int[] a,int[] b)
    {
        return a[0]!=b[0]?b[0]-a[0]:a[1]-b[1];
    }
}
