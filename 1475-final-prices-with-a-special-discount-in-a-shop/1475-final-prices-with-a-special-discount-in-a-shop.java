class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty() || prices[i] < stack.peek()){
               
                while(!stack.isEmpty() && stack.peek() > prices[i]){
                    stack.pop();
                }
            }
            ans[i] = (stack.isEmpty()) ? prices[i] :prices[i] - stack.peek();
            stack.push(prices[i]);
              
        
            System.out.println(stack);
        }
        return ans;
    }
}