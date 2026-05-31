class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int t :asteroids){
            if(t >0) stack.push(t);
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(t)){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == Math.abs(t)){
                    stack.pop();
                }else if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(t);
                }
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}