class Solution {
    public void nextPermutation(int[] nums) {
          int k=-1,i;
         for( i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
               k=i;
               break;
            }

        }
         if (k == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int max=-1;
        for(int j=nums.length-1;j>k;j--){
            if(nums[j]>nums[k]){
                max=j;
                break;
            }
        }
        swap(nums,k,max);

        reverse(nums,k+1,nums.length-1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper method to reverse the subarray from start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

}