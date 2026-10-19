class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            twoSum(nums, i + 1, nums.length - 1, (-1) * nums[i]);
        }
        return ret;
    }
    public void twoSum(int[] nums, int low, int high, int target) {
        while (low < high) {
            if (nums[high] + nums[low] == target) {
                ret.add(new ArrayList<>(List.of(nums[high], nums[low], (-1) * target)));
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1]) low++; 
            }
            else if (nums[high] + nums[low] < target) {
                low++;
            }
            else {
                high--;
            }
        }
    }
}
//-1 -1 0 1 2 4
/*
-1
*/
