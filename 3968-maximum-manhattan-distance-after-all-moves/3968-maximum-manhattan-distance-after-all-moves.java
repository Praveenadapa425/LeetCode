class Solution {
    public int maxDistance(String moves) {
        int hor = 0;
        int ver = 0;
        int blank = 0;
        for(char ch :moves.toCharArray()){
            if(ch == '_') blank++;
            if(ch == 'U') hor++;
            if(ch == 'D') hor--;
            if(ch == 'L') ver++;
            if(ch == 'R') ver--;
        }
        int ans = Math.abs(hor - 0) + Math.abs(ver -0);

        return ans+blank;
    }
}