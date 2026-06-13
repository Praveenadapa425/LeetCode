class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> stack = new Stack<>();
        int n = temp.length ;
        int ans[] = new int[n];
        for(int i = n-1 ; i>=0;i--){
            while(!stack.isEmpty() && stack.peek()[0] <= temp[i]){
                stack.pop();
            }

            ans[i] = (stack.isEmpty()) ? 0 : stack.peek()[1] - i;
            int[] t = new int[]{temp[i] , i};
            stack.push(t);
        }
        return ans;
    }
}