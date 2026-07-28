class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        boolean singleChar = false;
          char single ='1';
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i] % 2 == 1){
                singleChar = true;
                single = (char) (i+'a');
                for(int j=0;j<freq[i]/2;j++){
                    sb.append((char)(i+'a'));
                }
            }else{
                 for(int j=0;j<freq[i]/2;j++){
                    sb.append((char)(i+'a'));
                }
            }
        }
        if(singleChar) sb.append(single);
        // int start = 0;
        int end = singleChar ? sb.length()-1 : sb.length();
        sb.append(new StringBuilder (sb.substring(0 , end)).reverse());
        return sb.toString();
    }
}