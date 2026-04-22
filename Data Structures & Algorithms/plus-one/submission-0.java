class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (digits[i] == 9) {
            digits[i] = 0;
            i--;
            if (i == -1) {
                int[] ret = new int[digits.length + 1];
                ret[0] = 1;
                return ret;
            }
        }
        digits[i]++;
        return digits;
    }
}
