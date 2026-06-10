class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num :nums){
            if(num > 0)set.add(num);
        }
        int x = 1;
        while(set.contains(x)){
            x++;
        }
        return x;
    }
}