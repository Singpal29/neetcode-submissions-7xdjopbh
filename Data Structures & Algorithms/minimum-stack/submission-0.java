class MinStack {
    ArrayList<Integer> stk;
    public MinStack() {
        stk = new ArrayList<>();
    }
    
    public void push(int val) {
        stk.add(val);
    }
    
    public void pop() {
        stk.remove(stk.size() - 1);
    }
    
    public int top() {
        return stk.get(stk.size() - 1);
    }
    
    public int getMin() {
        int min = stk.get(0);
        for (int i : stk) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
