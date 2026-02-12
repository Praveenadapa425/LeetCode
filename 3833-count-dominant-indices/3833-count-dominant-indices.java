class Solution {
    public int dominantIndices(int[] nums) {
        if(nums.length == 1) return 0;
        int n = nums.length;
        long sum =0;
        int count =0;

        for(int i=n-1; i>=0;i--){
           
            System.out.println(sum + " "+n+" "+i);
            if(i <n-1){
                long suffixLen = n - i - 1;
                double avg = (double) sum/ suffixLen;
                if(nums[i] > avg){
                    count++;
                }
            }
            sum+=nums[i];
        }
        return count;
    }
}