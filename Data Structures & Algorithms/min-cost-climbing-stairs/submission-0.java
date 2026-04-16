class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(climb(cost, 0), climb(cost, 1));
    }
    public int climb(int[] cost, int step) {
        if (step >= cost.length) {
            return 0;
        }
        if (memo.containsKey(step)) {
            return memo.get(step);
        }
        memo.put(step, Math.min(cost[step] + climb(cost, step + 1), cost[step] + climb(cost, step + 2)));
        return memo.get(step);
    }
}
