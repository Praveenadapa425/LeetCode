class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character , Character> mapst = new HashMap<>();
        Map<Character , Character> mapts = new HashMap<>();
        for(int i =0;i<n;i++){
           char ss = s.charAt(i);
           char tt = t.charAt(i);

           if(mapst.containsKey(ss)){
            if(mapst.get(ss) != tt) return false;
           }else{
            mapst.put(ss,tt);
           }

         if(mapts.containsKey(tt)){
            if(mapts.get(tt) != ss) return false;
           }else{
            mapts.put(tt,ss);
           }


        }
        return true;
    }
}