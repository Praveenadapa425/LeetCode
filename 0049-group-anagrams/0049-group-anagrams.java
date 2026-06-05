class Solution {
    public String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            String key = sortString(s);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key , list);

            }else{
                List<String> list = new ArrayList<>();
                 list.add(s);
                 map.put(key ,list);
            }
        }
        return new ArrayList<>(map.values());

        // List<List<String>> ans = new ArrayList<>();
        // for(List<String> list :map.values()){
        //     ans.add(list);
        // }
        // return ans;
    }
}
