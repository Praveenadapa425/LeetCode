class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0)+1);
            maxFreq = Math.max(maxFreq , map.get(n)); // getting max Freqing while putting
        }
        
        int count =0;
        for(int n : map.keySet()){
            if(map.get(n) == maxFreq){
                count += map.get(n);
            }
        }

        return count;
    }
}