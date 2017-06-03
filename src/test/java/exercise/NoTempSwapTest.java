package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NoTempSwapTest {

    /*
        TASK
        temp 를 사용하지 않고 두 변수를 swap 한다.
     */

    @Test
    public void test() {
        int a = 4;
        int b = 3;

        int[] result = swap(a, b);
        assertThat(result[0] == 3, is(true));
        assertThat(result[1] == 4, is(true));
    }

    public int[] swap(int a, int b) {
        int[] result = new int[2];
        a = a + b;
        b = a - b;
        a = a - b;
        result[0] = a;
        result[1] = b;
        return result;
    }
}
