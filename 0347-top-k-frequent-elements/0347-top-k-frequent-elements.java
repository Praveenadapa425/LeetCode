class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        int n= nums.length;
       List<Integer>[] bucket = new ArrayList[n+1];
    for(int key:map.keySet()){
        if(bucket[map.get(key)] == null){
            bucket[map.get(key)] = new ArrayList<>();
        }
        bucket[map.get(key)].add(key);
    }
       int ans[] = new int[k];
       int idx = 0;
       for(int i=n;i>0;i--){
         if(bucket[i]== null) continue;
         for(int num:bucket[i]){
             ans[idx++] = num;
             if(idx == k) return ans;
         }
       }
        return ans;
    }
}