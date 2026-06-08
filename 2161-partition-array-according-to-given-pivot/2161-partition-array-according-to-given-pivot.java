class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        List<Integer> greaterList = new ArrayList<>();
        int piv = -1;
        for(int num:nums){
            if(piv == -1 && num == pivot){
                piv = list.size();
            }
            if((num==pivot) ||(num < pivot && piv == -1)){
                list.add(num);
            }else if(num <= pivot){
                list.add(piv , num);
                piv++;
            }else{
                greaterList.add(num);
            }
            
        }
        for(int i : greaterList){
            list.add(i);
        }
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arr;
    }
}