class Solution {
    public String removeTrailingZeros(String num) {
        // StringBuilder sb = new StringBuilder(num);
        // int i = num.length() -1;
        // while(i >= 0 && sb.charAt(i) == '0'){
        //     sb.deleteCharAt(i--);
        // }
        // return sb.toString();
        int i = num.length()-1;
        while(num.charAt(i) == '0'){
            i--;
        }
        return num.substring(0,i+1);
    }
}