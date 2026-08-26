class Solution {
    int row;
    int col;
    public int numIslands(char[][] grid) {
        row=grid.length;
        col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
            return count;
        }
         void dfs(char[][] grid, int rows, int cols){
            if(rows<0 || rows>=row || cols<0 || cols>=col){
                return;
            }
            if(grid[rows][cols]=='0'){
                return;
            }
            grid[rows][cols]='0';
            dfs(grid, rows-1,cols);
            dfs(grid, rows+1, cols);
            dfs(grid, rows, cols-1);
            dfs(grid, rows, cols+1);
        
        
    }
}