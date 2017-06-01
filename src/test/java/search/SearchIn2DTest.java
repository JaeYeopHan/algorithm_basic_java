package search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchIn2DTest {

    /*
        TASK
        정렬된 2차원 배열에서 검색한다.
        1. 각 row 별로 for-loop 돌면서 O(log n)의 sort을 한다.
        2. O(n)
     */

    @Test
    public void test() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = i + j;
            }
        }
        assertThat(getTargetPosition(matrix, 5), is(new Position(4,1)));
    }

    public Position getTargetPosition(int[][] matrix, int target) {
        if (matrix == null) return null;

        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target) {
                return new Position(row, col);
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }

        return null;
    }

    public class Position {
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Position position = (Position) o;

            if (row != position.row) return false;
            return col == position.col;
        }

        @Override
        public int hashCode() {
            int result = row;
            result = 31 * result + col;
            return result;
        }

        @Override
        public String toString() {
            return "Position{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }
}
