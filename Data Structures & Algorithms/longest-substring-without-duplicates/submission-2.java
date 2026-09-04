class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) return s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max = Math.max(right - left + 1, max);
            right++;
        }
        return max;
    }
}
