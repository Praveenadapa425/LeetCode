class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        boolean flag = true;
        for(char ch : text.toCharArray()){
            if(ch == ' '){
                if(flag == true) count++;  
                flag = true;
                
            }else if(flag && brokenLetters.indexOf(ch) != -1){

                    flag = false; // if broken char appears 

            }
            
            // System.out.println(flag + "  "+ count);

        }
        if(flag) count++;
        return count;
    }
}