class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                stk.push(i);
            }
            else {
                if (stk.size() == 0) {
                    return false;
                }
                switch (i) {
                    case ')':
                        if (stk.pop() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stk.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stk.pop() != '[') {
                            return false;
                        }
                        break;
                }
            }
        }
        return stk.size() == 0;
    }
}
