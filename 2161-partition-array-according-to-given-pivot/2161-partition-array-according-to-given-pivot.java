class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int i=0;
        for(int num:nums){
            if(num < pivot){
                arr[i++] = num;
            }
        }
        for(int num:nums){
            if(num == pivot){
                arr[i++] = num;
            }
        }
        for(int num:nums){
            if(num > pivot){
                arr[i++] = num;
            }
        }
        return arr;
    }
}