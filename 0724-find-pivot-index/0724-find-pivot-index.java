class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++){

            // calcuateing the total sum
            totalSum+=nums[i];
        }
        int prefixSum=0;  // prefix sum
        //-------------- increamenting the prefixsum and i value at a time 
        for(int i=0;i<n; prefixSum+=nums[i++]){

            // prefixsum == suffix at i postion 
            if(prefixSum * 2 == totalSum-nums[i]){
                return i; //returning the i 
            }
        }
        return -1;
    }
}