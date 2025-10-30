class Solution {
     public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> tri = new ArrayList<>();
        
        if (numRows == 0) return tri;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        tri.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = tri.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            
            currentRow.add(1);
            
            tri.add(currentRow);
        }
        
        return tri;
    }
}