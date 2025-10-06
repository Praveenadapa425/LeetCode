class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count =0 , n = nums.size();
        for(int i=n-1;i>=0;i--){
            count++;
            int val = nums.get(i);

            if(val <= k ) set.add(val);

            if(set.size() == k) break;
            
        }
        return count;
    }
}