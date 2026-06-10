class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);
        }

        int maxCount = Integer.MIN_VALUE;
        for(int x: set){
            if(!set.contains(x-1)){
                int count = 1;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                maxCount = Math.max(maxCount , count);
            }
        }
        return maxCount;
    }
}
