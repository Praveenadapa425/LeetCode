class Solution {
    private int gcd(int a , int b){
        if(b == 0) return a;
        
        return gcd(b , a%b);
    }
    public int gcdOfOddEvenSums(int n) {
       int evenSum = n * (n-1);
       int oddSum = n *n;
    //    System.out.println(oddSum+ " "+evenSum);
       return gcd(oddSum , evenSum);
    }
}