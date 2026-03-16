class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        String vowels = "aeiou";
        int b = -1;

        for(int i=n-1;i>=0 ; i--){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) == -1){
                b=i;
                break;
            }
        }
        for(int i = b ;i>=0;i--){
            sb.append(s.charAt(i));
        }

        return sb.reverse().toString();
    }
}