class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lowerCase = new boolean[26];
        boolean[] upperCase = new boolean[26];
        for(char ch : word.toCharArray()){
            int t = ch;
            if(t>=65 && t<=90){
                upperCase[t-65] = true;
            }else{
                lowerCase[t-97] = true; 
            }
            //  System.out.println(ch +" "+t);
        }

        int special  =0;
        for(int i=0;i<26;i++){
            if(lowerCase[i] && upperCase[i]) special++;
        }
        return special;
    }
}