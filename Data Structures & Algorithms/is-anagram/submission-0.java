class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 97]--;
        }
        for (int i : alphabet) {
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
