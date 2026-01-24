class Solution {
    public int vowelConsonantScore(String s) {
        String vowels = "aeiou";
        int c=0,v=0;
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) > -1){
                v++;
            }else if(Character.isLetter(ch)) c++;
        }

        if(c > 0) return (int)Math.floor((double)v/c);
        return 0;
    }
}