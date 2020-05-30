class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for (int[] pr : points) {
            maxHeap.offer(pr);
            if (maxHeap.size() > K) {
                maxHeap.poll();
            }
        }
        int[][] answer = new int[maxHeap.size()][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            answer[i++] = maxHeap.poll();
        }
        return answer;
    }
}
