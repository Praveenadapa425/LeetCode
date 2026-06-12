class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for(int num : nums){
            arr[num]++;
        }
        int preCount = 0;
        for(int i=0;i<=100;i++){
            int count = arr[i];
            arr[i] = preCount;
            preCount += count;
        }

        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = arr[nums[i]];
        }
        return ans;
    }
}