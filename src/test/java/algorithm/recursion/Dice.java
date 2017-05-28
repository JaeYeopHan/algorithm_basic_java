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
        assertThat(4, is(calcDiceCase(3)));
        assertThat(8, is(calcDiceCase(4)));
        assertThat(16, is(calcDiceCase(5)));
        assertThat(32, is(calcDiceCase(6)));
        assertThat(63, is(calcDiceCase(7)));
        assertThat(125, is(calcDiceCase(8)));
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
