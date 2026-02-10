class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] map1 = new int[1001];
        int[] map2 = new int[1001];
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            map2[nums2[i]]++;
        }

        for(int i=0;i<1001;i++){
            int min = Math.min(map1[i],map2[i]);
            while(min-- > 0){
                result.add(i);
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