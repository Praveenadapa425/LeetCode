class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr = new int[10];
        int ans =0;
        while(n > 0){
            int t = n %10;
            arr[t]++;
            n =n/ 10;
        }
        for(int i=0;i<10;i++){
            ans += arr[i] * i;
        }
        return ans;
    }
}