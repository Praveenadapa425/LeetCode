class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max = nums[0];
        int maxSum = 0;
        for(int i=0;i<nums.length - k;i++){
            max = Math.max(max , nums[i]);

            maxSum = Math.max(maxSum , max + nums[i+k]);

            // System.out.println(max +" "+maxSum);
        }
        return maxSum;
    }
}