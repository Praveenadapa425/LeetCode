class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        int duplicate = 0;
        for(int num:nums){
           if(set.contains(num)) {
             duplicate = num;
             break;
           }
           set.add(num);
        }
        int missing = duplicate;
        for(int i=0;i<nums.length;i++){
            missing ^= nums[i] ^(i+1);
        }
        return new int[]{duplicate , missing};
    }
}