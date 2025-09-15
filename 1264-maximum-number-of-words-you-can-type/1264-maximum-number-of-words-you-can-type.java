class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        boolean flag = true;
        boolean[] arr = new  boolean[26];
        for(char ch : brokenLetters.toCharArray()){
            arr[ch - 'a'] = true;   // marking broken char
        }

        for(char ch : text.toCharArray()){
            if(ch == ' '){
                if(flag == true) count++;  
                flag = true;
                
            }else if(flag && arr[ch - 'a']){

                    flag = false; // if broken char appears 

            }
            
            // System.out.println(flag + "  "+ count);

        }
        if(flag) count++;
        return count;
        
    }
}