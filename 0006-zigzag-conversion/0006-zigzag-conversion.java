class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(n <=2 || numRows == 1)
            return s;
        int index = 0;
        int incrementIndex = numRows+(numRows - 2);
        char[] result = new char[n];
        for (int i = 0; i < numRows; i++){
            int curIndex = i;
            while(curIndex < n){
                result[index++] = s.charAt(curIndex);
                if(i != 0 && i != numRows-1){
                    int stopIndex = curIndex+incrementIndex;
                    int ind = curIndex;

                        ind = ind+ incrementIndex - (2*i);
                        if(ind < stopIndex && ind < n)
                            result[index++] = s.charAt(ind);
                 
                }
                curIndex = curIndex + incrementIndex;
            }
        }
        return String.valueOf(result);
    }
}