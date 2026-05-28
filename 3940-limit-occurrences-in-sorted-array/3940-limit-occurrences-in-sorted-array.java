class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 1;
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]) c++;
            else c = 1;

            if(c <= k) list.add(nums[i]);

        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++) arr[i] = list.get(i);
        return arr;
    }
}