class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int num :nums){
           while(!stack.empty() && gcd(stack.peek(),num) > 1){
              num = lcm(stack.pop() , num);
           }
           stack.push(num);
           
        }
        return stack;
    }
    public static int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b , a%b);
    }
    public static int lcm(int a , int b){
        return (a/gcd(a,b))*b;
    }
}