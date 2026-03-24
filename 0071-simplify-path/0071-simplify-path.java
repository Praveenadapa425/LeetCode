class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        

        String[] paths = path.split("/");
        for(String s : paths){
            if(s.equals(".") || s.equals("")){
                continue;
            }else if(s.equals("..")){
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s : stack){
            sb.append("/").append(s);
        }
        return (sb.length() == 0) ? "/" : sb.toString();
    }
}