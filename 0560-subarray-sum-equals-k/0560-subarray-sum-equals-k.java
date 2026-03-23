class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            sum += num;

            if(sum == k) count++;
            
            int rem = sum - k;

            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(sum , map.getOrDefault(sum ,0)+1);
        }

        return count;
    }
}