class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int[] minRow = new int[n];
        for(int i=0;i<n;i++){
            int min = matrix[i][0];
            for(int j=0;j<m;j++){
                min = Math.min(min , matrix[i][j]);
            }
            minRow[i] = min;
        }
        int[] maxCol = new int[m];
        for(int i=0;i<m;i++){
            int max = matrix[0][i];
            for(int j=0;j<n;j++){
                max = Math.max(max , matrix[j][i]);
            }
            maxCol[i] = max;
        }

        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                if((matrix[i][j] == minRow[i]) && matrix[i][j] == maxCol[j]){
                    list.add(matrix[i][j]);
                }

            }
        }
        
        return list;
    }
}