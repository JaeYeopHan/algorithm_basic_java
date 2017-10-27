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

    private int dp[] = new int[1000];
    public int calcDiceCase(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        int result = 0;
        for(int i = 1; i<=6; i++){
            if(i >= 0){
                if(dp[n - i] == 0){
                    dp[n - i] = calcDiceCase(n - i);
                }
                result += dp[n - i];
            }
        }
        return result;
    }
}
