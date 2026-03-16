class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#' && !stack.empty()){
                stack.pop();
            }else if(ch != '#'){
                stack.push(ch);
            }
        }

        Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch == '#' && !stack1.empty()){
                stack1.pop();
            }else if(ch != '#'){
                stack1.push(ch);
            }
        }
        return (stack.equals(stack1)) ? true : false;
    }
}