class Solution {
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int cheapBuy = -1;
        for (int i : prices) {
            if (i < cheapBuy || cheapBuy == -1) {
                cheapBuy = i;
            }
            bestProfit = Math.max(bestProfit, i - cheapBuy);
        }
        return bestProfit;
    }
}
