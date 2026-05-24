class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        for(char ch :password.toCharArray()){
            set.add(ch);
        }
        int s = 0;
        for(char ch : set){
            int t = ch;
            if(t >= 97 && t <=122){
               s += 1;
            }
            else if(t >=65 && t<=90){
                s += 2;
            }else if(t>= 48 && t<= 57){
                s += 3;
            }else{
                s += 5;
            }

        }
        return s;
    }
}