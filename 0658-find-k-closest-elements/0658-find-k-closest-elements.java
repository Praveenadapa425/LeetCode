class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        for(int i = k;i<arr.length;i++){
            if(x - arr[start] <= arr[i] - x){        
                break;
            }
            start++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= start;i<start+k;i++) list.add(arr[i]);
        return list;
    }
}