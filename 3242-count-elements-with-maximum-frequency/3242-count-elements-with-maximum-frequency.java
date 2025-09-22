class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        for(int n : nums){
           freq[n]++;
           maxFreq = Math.max(maxFreq , freq[n]);

        }
        
        int count =0;
        for(int n : freq){
            if(n == maxFreq){
                count += n;
            }
        }

        return count;
    }
}