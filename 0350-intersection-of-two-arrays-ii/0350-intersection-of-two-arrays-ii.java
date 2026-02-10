class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
           return intersect(nums2,nums1);
        }

        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i] , map.getOrDefault(nums1[i],0)+1);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])  && map.get(nums2[i]) > 0){
                result.add(nums2[i]);
                map.put(nums2[i] , map.get(nums2[i]) -1);
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