class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char start =Character.toLowerCase( s.charAt(i));
            char end = Character.toLowerCase( s.charAt(j));
            if(start == end){
                i++;
                j--;
            }else if(('a' > start || start > 'z') && ('0' > start || start > '9')){
                i++;
            }else if(('a' > end || end > 'z') && ('0' > end || end > '9') ){
                j--;
            }else{
                return false;
            }
        }
        return true;

        
    }
}