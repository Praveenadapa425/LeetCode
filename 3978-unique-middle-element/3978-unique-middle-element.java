class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length /2;
        for(int i=0;i<nums.length;i++){
            if(i != mid && nums[mid] == nums[i]){
                return false;
            }
        }
        return true;
    }
}