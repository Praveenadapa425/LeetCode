class Solution {
    public long sumAndMultiply(int n) {
        long x = 0,sum = 0;
        int place = 1;
        while(n > 0){
            int digit = n %10;
            n = n/10;
            if(digit == 0){
                continue;
            }
            sum += digit;
            x += digit * place;
            place *= 10;
        }
        return sum *x;
    }
}