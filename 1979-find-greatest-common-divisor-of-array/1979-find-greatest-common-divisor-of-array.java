class Solution {
    private int gcd(int a , int b){
        if(b==0) return a;
        return gcd(b , a %b);
    }
    public int findGCD(int[] nums) {
        int small = nums[0],large = nums[0];
        for(int i=1;i<nums.length;i++){
            small = Math.min(small , nums[i]);
            large = Math.max(large , nums[i]);
        }
        return gcd(small , large);
    }
}