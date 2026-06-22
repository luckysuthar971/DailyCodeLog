class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i =0;i < grid.length;i++){
            for(int j = 0;j < grid[i].length;j++){
                if(grid[i][j] < 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}