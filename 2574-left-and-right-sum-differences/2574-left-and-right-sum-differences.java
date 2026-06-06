class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totSum = 0;
        for(int num :nums) totSum += num;
        int[] ans = new int[nums.length];
        int leftSum = 0;

        for(int i=0;i<ans.length;i++){
            int rightSum = totSum -leftSum - nums[i];
            ans[i] =Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        } 
        return ans;
    }
}