class Solution {
    public String removeDuplicates(String s, int k) {
       Stack<Pair> stack = new Stack<>();

       for(char c : s.toCharArray()){
         if(!stack.empty() && stack.peek().key == c){
            stack.peek().value++;
         }else{
            stack.push(new Pair(c , 1));
         }
         if(stack.peek().value == k) stack.pop();
       }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            Pair temp = stack.pop();
            for(int i=0;i<temp.value;i++){
                sb.append(temp.key);
            }
        }
        return sb.reverse().toString();
    }
}
class Pair{
    char key;
    int value;
    Pair(char key , int value){
        this.key = key;
        this.value = value; 
    }
}