class Solution {
    public int minimumSwaps(int[] nums) {
        int swap = 0;
        int i =0,j = nums.length - 1;
        while(i < j){
            if(nums[i]== 0 && nums[j] != 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
                swap++;
                continue;
            }
            if(nums[i] != 0) i++;
            if(nums[j] == 0) j--;

        }
        return swap;
        

    }
}