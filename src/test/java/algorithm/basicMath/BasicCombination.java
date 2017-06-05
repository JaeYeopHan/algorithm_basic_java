package algorithm.basicMath;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BasicCombination {

    /*
        TASK
        n개의 서로 다른 원소 중 r개의 원소를 순서없이 선택하는 방법의 수를 구한다.
     */

    @Test
    public void test() {
        assertThat(getByRecursion(0, 0), is(1));
        assertThat(getByRecursion(1, 0), is(1));
        assertThat(getByRecursion(2, 1), is(2));
        assertThat(getByRecursion(8, 3), is(56));

        assertThat(getByDp(0, 0), is(1));
        assertThat(getByDp(1, 0), is(1));
        assertThat(getByDp(2, 1), is(2));
        assertThat(getByDp(8, 3), is(56));
    }

    public int getByRecursion(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        return getByRecursion(n - 1, r - 1) + getByRecursion(n - 1, r);
    }

    public int getByDp(int n, int r) {
        int cache[][] = new int[10][10];
        if (r == 0 || n == r) {
            return 1;
        }
        if (cache[n][r] != 0) return cache[n][r];
        return cache[n][r] = getByDp(n - 1, r - 1) + getByDp(n - 1, r);
    }
}
