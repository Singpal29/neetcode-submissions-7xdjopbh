class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = findRow(matrix, target);
        int left = 0;
        int right = matrix[rowIndex].length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (matrix[rowIndex][mid] == target) {
                return true;
            }
            else if (matrix[rowIndex][mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
    public int findRow(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        
        while (Math.abs(left - right) > 1) {
            int index = (left + right) / 2;
            System.out.println(left);
            System.out.println(right);
            if (matrix[index][0] <= target) {
                left = index;
            }
            else if (matrix[index][0] > target) {
                right = index;
            }
        }
        if (matrix[right][0] <= target) {
            return right;
        }
        return left;
    }
}
