class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        String vowels = "aeiou";
        
        for(int i=n-1;i>=0 ; i--){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) == -1){
               return s.substring(0,i+1);
            }
        }
        

        return "";
    }
}