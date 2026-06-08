class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length && i<nums.length){
            if(nums[i] % 2 == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j += 2;
            }else{
                i+=2;
            }
        }
        return nums;
    }
}