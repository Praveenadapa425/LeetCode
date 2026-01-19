class Solution {
    public String largestOddNumber(String num) {
       
        int n = num.length();
        int i;
        for(i =n-1;i>=0;i--){
            if((num.charAt(i)-'0' ) % 2 ==1) break;
        }
        if(i<0) return "";
        return num.substring(0,i+1);
    }
}