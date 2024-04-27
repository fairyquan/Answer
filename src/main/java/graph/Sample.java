package graph;

import java.util.Arrays;

public class Sample {
    /**
     * 岛屿问题dfs通用模板
     * @param grid 网格
     * @param r 行
     * @param c 列
     */
    static void dfs(int[][] grid, int r, int c) {
        // 判断 base case
        if (!inArea(grid, r, c)) {
            return;
        }
        // 如果这个格子不是岛屿，直接返回
        if (grid[r][c] != 1) {// 0:海洋   1:陆地    2:遍历过的陆地
            return;
        }
        grid[r][c] = 2; // 将格子标记为「已遍历过」

        // 访问上、下、左、右四个相邻结点
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    // 判断坐标 (r, c) 是否在网格中
    static boolean inArea(int[][] grid, int r, int c) {
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }

    public static void main(String[] args) {
        int[][] grid=new int[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(grid[i],1);
        }
        dfs(grid,2,2);

    }

}
