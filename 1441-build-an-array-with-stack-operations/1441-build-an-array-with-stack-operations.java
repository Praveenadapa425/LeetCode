class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i=1,j=0;
        List<String> list = new ArrayList<>();
        while(i<=n && j<target.length){
            list.add("Push");
            if(i != target[j]){
                list.add("Pop");
                i++;
            }else{
                j++;
                i++;
            }
        }
        return list;
    }
}