class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int n :nums){
            int t = 0;
            while(n > 0){
                t += n%10;
                n = n/10;
            }
            ans = Math.min(ans , t);
        }
        return ans;
    }
}