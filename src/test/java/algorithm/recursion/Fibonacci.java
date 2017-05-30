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
        assertThat(calcFibo(5), is(5));
        assertThat(calcFibo(6), is(8));
        assertThat(calcFibo(7), is(13));
    }

    public int calcFibo(int num) {
        if (num < 2) {
            return num;
        }
        return calcFibo(num - 1) + calcFibo(num - 2);
    }
}
