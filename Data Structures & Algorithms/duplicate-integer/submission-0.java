class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i : nums) {
            hash.add(i);
        }
        return hash.size() != nums.length;
    }
}