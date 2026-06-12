class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int minStock = prices[0];
       for(int i=1;i<prices.length;i++){
          
           maxProfit = Math.max(maxProfit , prices[i] - minStock);
     
           minStock = Math.min(minStock , prices[i]);
       }
       return maxProfit;
    }
}
