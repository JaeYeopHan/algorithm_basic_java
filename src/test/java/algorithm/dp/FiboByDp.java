package algorithm.dp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FiboByDp {
    @Test
    public void test() {
        assertThat(5, is(fiboByDp(5)));
        assertThat(8, is(fiboByDp(6)));
        assertThat(13, is(fiboByDp(7)));
    }

    public int fiboByDp(int num) {
        return calcFibo(num, new int[num + 1]);
    }

    private int calcFibo(int num, int[] cache) {
        if (num < 2) {
            return num;
        }

        //in java, int[] is initialized by 0.
        if (cache[num] != 0) {
            return cache[num];
        }

        cache[num] = calcFibo(num - 1, cache) + calcFibo(num - 2, cache);
        return cache[num];
    }
}
