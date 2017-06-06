package algorithm.dp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JumpGame {

    /*
        TASK
        외발뛰기 <215>
        n x n 크기의 격자에 1부터 0까지의 정수를 쓴 게임판이 존재합니다.
        이 게임의 목적은 게임판의 왼쪽 위 칸에서 시작하여 게임판의 맨 오른쪽 아래 칸에 도착하는 것입니다.
        중간에 게임판 밖으로 벗어나면 안되며 문제는 주어진 게임판에서 목적을 달성할 수 있는지에 대한 여부를 판단하는 것입니다.
     */

    @Test
    public void test() {
        int[][] board1 = {
                { 1,1,1,1,1,1 },
                { 1,1,1,1,1,1 },
                { 1,1,1,1,1,1 },
                { 1,1,1,1,1,1 },
                { 1,1,1,1,1,1 },
                { 1,1,1,1,1,1 }
        };
        assertThat(solutionByRec(board1), is(true));
        assertThat(solutionByDp(board1), is(true));
        int[][] board2 = {
                { 1,1,1,1,1,1,1,1,1 },
                { 1,1,1,1,1,1,1,1,1 },
                { 1,1,1,1,1,1,1,1,1 },
                { 1,1,1,1,1,1,1,1,1 },
                { 1,1,1,1,1,1,1,1,1 },
                { 1,1,1,1,1,1,1,1,1 },
                { 1,1,1,1,1,1,2,2,1 },
                { 1,1,1,1,1,1,2,1,2 },
                { 1,1,1,1,1,1,1,2,1 }
        };
        assertThat(solutionByRec(board2), is(false));
        assertThat(solutionByDp(board2), is(false));
    }

    public boolean solutionByRec(int[][] board) {
        return jumpByRec(board, board.length - 1, 0, 0);
    }

    public Boolean solutionByDp(int[][] board) {
        Boolean[][] cache = new Boolean[board.length][board.length];
        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache.length; j++) {
                cache[i][j] = null;
            }
        }
        return jumpByDp(cache, board, board.length - 1, 0, 0);
    }

    public boolean jumpByRec(int[][] board, int n, int y, int x) {
        if (y > n || x > n) return false; // Out of game board
        if (y == n && x == n) return true; // Arrive goal
        int jumpSize = board[y][x];
        return jumpByRec(board, n, y + jumpSize, x) || jumpByRec(board, n, y, x + jumpSize);
    }

    public Boolean jumpByDp(Boolean[][] cache, int[][] board, int n, int y, int x) {
        if (y > n || x > n) return false; // Out of game board

        if (y == n && x == n) return true; // Arrive goal

        Boolean ret = cache[y][x];

        if (ret != null) return ret;

        int jumpSize = board[y][x];
        ret = jumpByDp(cache, board, n, y + jumpSize, x)
                || jumpByDp(cache, board, n, y, x + jumpSize);
        return ret;
    }
}
