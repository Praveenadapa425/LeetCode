class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxCount = 0;
        for(int num :nums){
            if(num %2 == 0){
                map.put(num , map.getOrDefault(num, 0)+1);
                maxCount = Math.max(maxCount , map.get(num));
            }
           
        }
        if(map.size() == 0) return -1;
        int ans = Integer.MAX_VALUE;
        for(int key :map.keySet()){
            if(map.get(key) == maxCount){
                ans = Math.min(ans , key);
            }
        }
        return ans;
    }
}