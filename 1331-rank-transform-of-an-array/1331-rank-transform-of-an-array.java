class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1 = arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int n : arr1){
            if(!map.containsKey(n)){
                map.put(n , rank++);
            }
        }

        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}