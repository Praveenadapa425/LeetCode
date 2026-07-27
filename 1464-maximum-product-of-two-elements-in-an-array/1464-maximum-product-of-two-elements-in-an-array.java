class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = max; // max2 == second maximum in array;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
                
            }else if(nums[i] == max || nums[i]> max2){
                max2 = nums[i];
            }
        }
        return (max2-1) * (max-1);
        
    }
}