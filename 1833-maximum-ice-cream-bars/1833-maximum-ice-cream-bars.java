class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bars = 0;
        for(int cost:costs){
            if(coins >= cost){
                coins -= cost;
                bars++;
            }else{
                break;
            }
        }
        return bars;
    }
}