class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       
        while(k-- >0){
            shift(grid);
        }
        List<List<Integer>> ans = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<m;j++){
                list.add(grid[i][j]);
            }
            ans.add(list);
        }
        return ans;
        
    }
    private void shift(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int last = grid[n-1][m-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int t= grid[i][j];
                grid[i][j] = last;
                last = t;
            }
        }
        return;
    }
}