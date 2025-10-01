class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int emt = numBottles;
        while(emt >= numExchange){
            int newBottles = emt / numExchange;
            sum += emt / numExchange;
            emt = emt % numExchange + newBottles;         
        }
        return sum;
    }
}