class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num :nums){
            set.add(num);
        }
        int prev = set.first();
        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        for(int x:set){
            if(x == prev) continue;
            else if(x == prev+1){
                count++;
            }else{
                maxCount = Math.max(maxCount , count);
                count = 1;
            }
            prev = x;

        }
        maxCount = Math.max(maxCount , count);
        return maxCount;
    }
}
