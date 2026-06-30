class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ']' || ch == '}' || ch == ')'){
                if(stack.isEmpty() ||
                   (ch==')' && stack.peek() !='(') ||
                (ch==']' && stack.peek() !='[') ||
                (ch=='}' && stack.peek() !='{') ){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? true : false; 
    }
}
