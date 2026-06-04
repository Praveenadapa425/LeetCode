class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int j=num1;j<=num2;j++){
            if(j <100) continue;
            String s = String.valueOf(j);
            for(int i=1;i<s.length()-1;i++){
                if((s.charAt(i-1) < s.charAt(i) && s.charAt(i) > s.charAt(i+1)) ||
                (s.charAt(i-1) > s.charAt(i) && s.charAt(i) < s.charAt(i+1))){
                    count++;
                }
            }
        }
        return count;
    }
}