class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        int prefixSum=0;
        for(int i=0;i<n;i++){

            if(prefixSum * 2 == totalSum-nums[i]){
                return i;
            }
            prefixSum+=nums[i];
        }
        return -1;
        
    }
}