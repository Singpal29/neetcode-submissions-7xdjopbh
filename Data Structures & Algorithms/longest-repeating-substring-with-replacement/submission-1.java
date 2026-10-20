class Solution {
    public int characterReplacement(String s, int k) {
        
        int best = 0;
        for (int i = 0; i < 26; i++) {
            int left = 0;
            int right = 0;
            int tracker = k;
            char val = (char) (i + 65);
            int curr = 0;
            while (right < s.length()) {
                if (s.charAt(right) == val) {
                    curr++;
                    best = Math.max(best, curr);

                }
                else {
                    tracker--;
                    curr++;
                    while (tracker < 0) {
                        curr--;
                        if (s.charAt(left) != val) tracker++;
                        left++;
                    }
                    best = Math.max(best, curr);
                }
                right++;
            }
        }
        return best;

    }
}
