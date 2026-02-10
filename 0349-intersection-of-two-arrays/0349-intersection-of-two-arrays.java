class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map[nums1[i]] == 0) map[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(map[nums2[i]] == 1){
                map[nums2[i]]++;
                result.add(nums2[i]);
            } 
        }

        int n = result.size(); //mannual conversion
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = result.get(i);
        }
        return ans;
        // return result.stream().mapToInt(Integer::intValue).toArray();

    }
}