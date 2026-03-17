class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("C") && !st.empty()){
                st.pop();
            }else if(s.equals("D") && !st.empty()){
                int t = st.peek();
                st.push(t*2);
            }else if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                int sum = a+b;
                st.push(b);
                st.push(a);
                st.push(sum);
            }else{
                int p = Integer.parseInt(s);
                st.push(p);
            }
        }
        int score = 0;
        for(Integer i :st){
            score += i;

        }
        return score;
    }
}