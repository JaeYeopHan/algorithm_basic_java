package algorithm.recursion;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Dice {

    /*
        TASK
        주사위로 이동 가능한 경우의 수를 모두 구한다.
     */

    @Test
    public void test() {
        assertThat(calcDiceCase(3), is(4));
        assertThat(calcDiceCase(4), is(8));
        assertThat(calcDiceCase(5), is(16));
        assertThat(calcDiceCase(6), is(32));
        assertThat(calcDiceCase(7), is(63));
        assertThat(calcDiceCase(8), is(125));
    }

    public int calcDiceCase(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return calcDiceCase(n - 1)
                + calcDiceCase(n - 2)
                + calcDiceCase(n - 3)
                + calcDiceCase(n - 4)
                + calcDiceCase(n - 5)
                + calcDiceCase(n - 6);
    }
}
