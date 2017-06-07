package algorithm.basicMath;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Fibonacci {

    /*
        TASK
        Fibonacci 를 계산하는 함수를 작성한다.
     */

    @Test
    public void test() {

        assertThat(calcFiboByFor(5), is(5));
        assertThat(calcFiboByFor(6), is(8));
        assertThat(calcFiboByFor(7), is(13));

        assertThat(calcFiboByRec(5), is(5));
        assertThat(calcFiboByRec(6), is(8));
        assertThat(calcFiboByRec(7), is(13));

        assertThat(fiboByDp(5), is(5));
        assertThat(fiboByDp(6), is(8));
        assertThat(fiboByDp(7), is(13));
    }

    // Iteration version
    public int calcFiboByFor(int num) {
        if (num < 0) return -1;

        int curValue = 0;
        int prevValue = 1;
        int prevPrevValue = 0;

        for (int i = 2; i <= num; i++) {
            curValue = prevValue +prevPrevValue;
            prevPrevValue = prevValue;
            prevValue = curValue;
        }
        return curValue;
    }

    // Recursion version
    public int calcFiboByRec(int num) {
        if (num < 0) return -1;
        if (num < 2) return num;
        return calcFiboByRec(num - 1) + calcFiboByRec(num - 2);
    }

    // Dynamic Programming version
    public int fiboByDp(int num) {
        return calcFibo(num, new int[num + 1]);
    }

    private int calcFibo(int num, int[] cache) {
        if (num < 2) return num;
        if (cache[num] != 0) return cache[num];//in java, int[] is initialized by 0.

        cache[num] = calcFibo(num - 1, cache) + calcFibo(num - 2, cache);
        return cache[num];
    }
}
