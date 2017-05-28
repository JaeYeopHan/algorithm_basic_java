package algorithm.recursion;

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
        assertThat(5, is(calcFibo(5)));
        assertThat(8, is(calcFibo(6)));
        assertThat(13, is(calcFibo(7)));
    }

    public int calcFibo(int num) {
        if (num < 2) {
            return num;
        }
        return calcFibo(num - 1) + calcFibo(num - 2);
    }
}
