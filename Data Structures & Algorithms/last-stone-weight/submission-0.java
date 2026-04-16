class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            heap.add(i);
        }
        while (heap.size() > 1) {
            heap.add(Math.abs(heap.poll() - heap.poll()));
        }
        if (heap.size() == 0) {
            return 0;
        }  
        return heap.poll();
    }
}
