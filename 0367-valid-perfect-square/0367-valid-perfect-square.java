class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1,j = num;
        while(i<=j){
            long mid = i+(j-i)/2;
            // System.out.println(mid);
            if(mid * mid == num) return true;
            else if(mid * mid > num){
                j = mid -1;
            }else{
                i = mid +1;
            }

        }
        return false;
    }
}