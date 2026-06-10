class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int t = 0;
            for(int num:nums){
                int bit =( num >> i) & 1;
                if(bit == 1) t++;
            }
            ans += (t%3) * (1 << i);
        }
        return ans;
    }
}