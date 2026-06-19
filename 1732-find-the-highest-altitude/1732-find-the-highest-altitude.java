class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0,ans = 0;
        for(int x : gain){
            ans += x;
            height = Math.max(height ,ans);  
        }
        return height;
    }
}