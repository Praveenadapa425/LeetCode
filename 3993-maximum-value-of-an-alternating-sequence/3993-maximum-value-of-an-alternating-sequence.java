class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1) return s;
        long N = n;
        long S = s;
        long M = m;
        long  ans = S + (N/2 *(M)) - N/2+1;
        return ans;
    }
}