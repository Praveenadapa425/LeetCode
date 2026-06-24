class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for(int cost : costs){
            freq[cost]++;
        }
        int bars = 0;
        for(int cost=1;cost<freq.length;cost++){
            int canBuy = Math.min(freq[cost], coins/cost);

            bars += canBuy;

            coins -= canBuy * cost;

            if (coins < cost) {
                break;
            }
        }
        return bars;
    }
}