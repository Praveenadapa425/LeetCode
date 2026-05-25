class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n = a.length;
        int[] freq = new int[n+1];
        int[] ans = new int[n];
        int common = 0;
        for(int i=0;i<n;i++){
            
            if(++freq[a[i]] == 2) common++;
            if(++freq[b[i]] == 2) common++;
            
            ans[i] = common;
        }
        return ans;

    }
}