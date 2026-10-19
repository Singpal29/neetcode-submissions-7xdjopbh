class Solution {
    public int trap(int[] height) {
        int count = 0;
        int currLeft = height[0];
        int leftIndex = 0;
        for (int i = 1; i < height.length; i++) {
            //System.out.println("Curr Index: " + i);
            if (height[i] >= currLeft) {
                
                currLeft = height[i];
                leftIndex = i;
            }
            else {
                count += currLeft - height[i];
            }
            //System.out.println("Curr Count: " + count);
        }
        int currRight = height[height.length - 1];
        int rightIndex = height.length - 1;
        for (int i = height.length - 1; i > leftIndex; i--) {
            count -= currLeft - height[i];
            if (height[i] >= currRight) {
                
                currRight = height[i];
                rightIndex = i;
            }
            else {
                count += currRight - height[i];
            }
        }
        return count;
    }
}
