class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num :score){
            pq.offer(num);
        }
        Map<Integer , Integer> map = new HashMap<>();
        int rank = 1;
        while(!pq.isEmpty()){
            map.put(pq.poll() , rank++);
        }

        String[] ans = new String[score.length];
        for(int i=0;i<ans.length;i++){
            rank = map.get(score[i]);
            if(rank== 1){
                ans[i] = "Gold Medal";
            }else if(rank == 2){
                ans[i] = "Silver Medal";
            }else if(rank == 3){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = String.valueOf(rank);
            }
        }
        return ans;

    }
}