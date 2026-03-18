class Solution {
    public String removeDuplicates(String s, int k) {
       Stack<Pair> stack = new Stack<>();

       for(char c : s.toCharArray()){
         if(stack.empty() || stack.peek().key != c){
            stack.push(new Pair(c , 1));
         }else{
            Pair temp = stack.pop();
            if(temp.value > k-1){
                temp.value=temp.value - k + 1;
                stack.push(temp);
            }else if(temp.value < k-1){
                temp.value= temp.value + 1;
                stack.push(temp);
            }
         }
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