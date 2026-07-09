class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
             n = sqSum(n);
             if(set.contains(n)) return false;
             set.add(n);
        }
        return true;
    }
    private int sqSum(int n){
        int ans =  0;
        while(n !=0){
            int x = n%10;
            ans +=(x *x);
            n /= 10;
        }
        return ans;
    }
}