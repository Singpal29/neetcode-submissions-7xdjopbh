class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length());
            builder.append("#");
            builder.append(str);
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int count = 0;
            while (Character.isDigit(str.charAt(i))) {
                count *= 10;
                count += (str.charAt(i) - 48);
                i++;
            }
            ret.add(str.substring(i + 1, i + 1 + count));
            i += 1 + count;
        }
        return ret;
    }
}
