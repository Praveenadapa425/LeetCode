class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==1) j++;
            else{
                if(i<j){
                    i=j;
                }
                j=0;
            } 
            
        }
        if(i<j) return j;
        else return i; 
        
    }
}