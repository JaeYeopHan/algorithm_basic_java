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
        assertThat(calcDiceCase1(3), is(4));
        assertThat(calcDiceCase1(4), is(8));
        assertThat(calcDiceCase1(5), is(16));
        assertThat(calcDiceCase1(6), is(32));
        assertThat(calcDiceCase1(7), is(63));
        assertThat(calcDiceCase1(8), is(125));
        assertThat(calcDiceCase1(3), is(4));

        assertThat(calcDiceCase2(4), is(8));
        assertThat(calcDiceCase2(5), is(16));
        assertThat(calcDiceCase2(6), is(32));
        assertThat(calcDiceCase2(7), is(63));
        assertThat(calcDiceCase2(8), is(125));
    }

    private int dp[] = new int[1000];
    /**
     *  메모이제이션을 사용하지 않은 경우
     *  단점 : 숫자가 커질수록 느려진다.
     */
    public int calcDiceCase1(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return calcDiceCase1(n - 1) + calcDiceCase1(n - 2) + 
        calcDiceCase1(n - 3) + calcDiceCase1(n - 4) + 
        calcDiceCase1(n - 5) + calcDiceCase1(n - 6);
    }
    /**
     *  메모이제이션을 사용하는 경우
     *  장점 : 속도가 빠르다.
     */
    public int calcDiceCase2(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        int result = 0;
        for(int i = 1; i<=6; i++){
            if(n - i >= 0){
                if(dp[n - i] == 0){
                    dp[n - i] = calcDiceCase2(n - i);
                }
                result += dp[n - i];
            }
        }
        return result;
    }
}
