class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDiff = 0;
        int sum = 0;
        for(int x : nums){
            int min = 9,max=0;
            int num = x;
            while(num > 0){
                int n = num %10;
                min = Math.min(min , n);
                max = Math.max(max , n);
                num /= 10;
            }
            int currDiff = max - min;
            if(currDiff > maxDiff){
                maxDiff = Math.max(maxDiff , currDiff);
                sum = x;
            }else if(currDiff == maxDiff) sum += x;
        }
        return sum;
    }
}