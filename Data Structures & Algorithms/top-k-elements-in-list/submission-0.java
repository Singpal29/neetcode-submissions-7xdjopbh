class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for (int i : nums) {
            histogram.put(i, histogram.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> histogram.get(b) - histogram.get(a));
        for (int i : histogram.keySet()) {
            maxHeap.add(i);
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = maxHeap.poll();
        }
        return ret;
    }
}
