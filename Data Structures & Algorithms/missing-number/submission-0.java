class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        int expectedTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            expectedTotal += i;
        }
        expectedTotal += nums.length;
        return expectedTotal - total;
    }
}
