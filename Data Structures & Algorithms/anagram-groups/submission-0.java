class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] freqs = new int[26];
            for (int i = 0; i < str.length(); i++) {
                freqs[str.charAt(i) - 97]++;
            }
            String key = Arrays.toString(freqs);
            
            if (map.containsKey(key)) {
                map.get(key).add(str);
            }
            else {
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        
        for (List<String> i : map.values()) {
            ret.add(i);
        }
        return ret;
    }
}
