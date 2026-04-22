class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int bestArea = 0;
        int currArea = 0;
        while (left != right) {
            currArea = Math.min(heights[left], heights[right]) * (right - left);
            bestArea = bestArea >= currArea ? bestArea : currArea;
            if (heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return bestArea;
    }
}
