class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double , Integer> map = new HashMap<>();
        long count =0;

        for(int[] rectangle : rectangles){
            double ratio = (double) rectangle[0]/rectangle[1];

            if(map.containsKey(ratio)){
                count += map.get(ratio);
                map.put(ratio , map.get(ratio)+1);
            }else{
                map.put(ratio , 1);
            }
            System.out.println(ratio);
        }
        return count;
    }
}