class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        int n = nums.length;
        int[] visited = new int[n+1];

        for(int i=0;i<n;i++){
            visited[nums[i]] = 1;
        }

        for(int i=1 ;i<n+1;i++){
            if(visited[i] == 0){
                arr.add(i);
            }
        }
        return arr;

       
        
    }
}