package kz.seisen.block7;



public class Islands {

    public static int numIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    dfs(grid, visited, r, c);
                    count++; // new island
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] grid, boolean[][] visited, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return;
        if (visited[r][c] || grid[r][c] == 0) return;

        visited[r][c] = true;

        dfs(grid, visited, r + 1, c);
        dfs(grid, visited, r - 1, c);
        dfs(grid, visited, r, c + 1);
        dfs(grid, visited, r, c - 1);
    }

}
