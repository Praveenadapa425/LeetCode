class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(st.empty()){
                st.push(ch);
            }else if(st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }

        }
       
        
        // converting st array to String
        for(char ch :st){
            sb.append(ch);
        }
        return sb.toString();
    }
}