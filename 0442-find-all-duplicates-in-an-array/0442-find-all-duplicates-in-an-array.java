class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();

        int n = nums.length;
        int arr[] = new int[n+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(arr[i] == 2){
                ans.add(i);
            }
        }

        return ans;
    }
}