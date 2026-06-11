class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0,j = numbers.length-1;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                int[] ans = new int[2];
                ans[0] = ++i;
                ans[1] = ++j;
                return ans;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[2];
    }
}