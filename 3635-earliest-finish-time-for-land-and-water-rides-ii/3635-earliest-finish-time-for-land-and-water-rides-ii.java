class Solution {
    public int solve(int[] s1, int[] e1, int[] s2, int[] e2){
        int min = Integer.MAX_VALUE;
        int ans = min;
        for(int i=0;i<s1.length;i++){
            min = Math.min(min , s1[i]+e1[i]);
        }
        for(int i=0;i<s2.length;i++){
            ans = Math.min(ans , Math.max(min ,s2[i])+e2[i]);
        }
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
       int case1 =  solve(landStartTime, landDuration, waterStartTime, waterDuration); //starting landride first
       int case2 =  solve(waterStartTime, waterDuration, landStartTime, landDuration); //starting water ride first
       return Math.min(case1 , case2);

    }
}