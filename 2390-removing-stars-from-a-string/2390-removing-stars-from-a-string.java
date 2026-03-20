class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(ch);
            if(ch == '*' && sb.length() >=2){
                sb.deleteCharAt(sb.length() -1);
                sb.deleteCharAt(sb.length() -1);
            }
        }
        

        return sb.toString();
    }
}