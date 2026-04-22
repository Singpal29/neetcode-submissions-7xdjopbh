class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : nums) {
            heap.offer(i);
        }
        int bestSequence = 1;
        int currSequence = 1;
        int lastElement = heap.poll();
        while (!heap.isEmpty()) {
            int curr = heap.poll();
            if (curr - lastElement == 1) {
                currSequence++;
                if (currSequence > bestSequence) {
                    bestSequence = currSequence;
                }
            }
            else if (curr - lastElement != 0) {
                currSequence = 1;
            }
            lastElement = curr;
        }
        return bestSequence;
    }
}
