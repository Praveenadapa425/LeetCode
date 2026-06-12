class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i]; 
        }
        for(int i=0,j=0 ; i<n ; i++,j+=2){
            nums[j] = arr[i];
            nums[j+1] = nums[i+n];
        }
        return nums;
    }
}