class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int tempProduct = 1;

        int countZero = 0;
        for (int i : nums) {
            if (i == 0) {
                countZero++;
            }
            else {
                tempProduct *= i;
            }
            product *= i;
            
        }
        if (countZero >= 2) {
            return new int[nums.length];
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    nums[i] = tempProduct;
                }
                else {
                    nums[i] = product / nums[i];
                }
            }
            return nums;
        }

    }
}  
