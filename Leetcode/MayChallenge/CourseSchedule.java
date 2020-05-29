class Solution {
   int[] visited;
    List<Integer>[] gr;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses];
        gr = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            gr[i] = new ArrayList<>();
        for (int[] p : prerequisites)
            gr[p[1]].add(p[0]);
        for (int i = 0; i < numCourses; i++) 
            if (hasCycle(i))
                return false; 
        return true;
    }
    
    private boolean hasCycle(int u) {
        if (visited[u] == 2) return false;
        if (visited[u] == 1) return true;        
        visited[u] = 1;   
        for (int v : gr[u]) 
            if (hasCycle(v))
                return true;        
        visited[u] = 2;
        return false;
    }   
}
