class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int price = 0;
        int i = cost.length-1;
        int count = 0;
        while(i >=0){
            count++;
            if(count % 3 != 0){
                price += cost[i];
            }
            i--;
        }
        return price;
    }
}