class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for(int num :nums){
            if((num & 1) == 0){
                ans |= num;
            }
        }
        return ans;
    }
}