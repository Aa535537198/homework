package day_5.mid;

/**
 * @author JGod
 * @create 2020-12-16-16:18
 */

/**
 * leetCode:  https://leetcode-cn.com/problems/minesweeper/
 */
public class LeetCode529 {
    int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
    int[] dirY = {1, 0, -1, 0, 1, -1, 1, -1};

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        }else {
            dfs(board, click[0], click[1]);
        }

        return board;
    }

    public void dfs(char[][] board, int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int tx = x + dirX[i];
            int ty = y + dirY[i];
            if (tx < 0 || tx > board.length - 1 || ty < 0 || ty > board[0].length - 1){
                continue;
            }
            if (board[tx][ty] == 'M'){
                cnt++;
            }
        }
        if (cnt > 0){
            board[x][y] = (char)(cnt + '0');
        }else {
            board[x][y] = 'B';
            for (int i = 0; i < 8; i++) {
                int tx = x + dirX[i];
                int ty = y + dirY[i];
                if (tx < 0 || tx > board.length - 1 || ty < 0 || ty > board[0].length - 1 || board[tx][ty] != 'E'){
                    continue;
                }
                dfs(board,  tx, ty);
            }
        }
    }

}
