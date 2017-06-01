package bit;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BitOperator {

    @Test
    public void test() {
        assertThat(isPowerOf2(2), is(true));
        assertThat(isPowerOf2(4), is(true));
        assertThat(isPowerOf2(8), is(true));
        assertThat(isPowerOf2(16), is(true));
        assertThat(isPowerOf2(17), is(false));
    }

    public String testFunction() {
        return "";
    }

    public boolean get(int n, int i) {
        int mask = 1 << i;
        return (n & mask) != 0;
    }

    public int set(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public int clear(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }

    /*
        TASK
        2의 제곱수인지 판별한다.
     */

    public boolean isPowerOf2(int n) {
        // 10 == 2 => 2 - 1 == 1
        // 100 == 4 => 4 - 1 == 11
        // 1000 == 8 => 8 - 1 == 111
        // 10000 == 16 => 16 - 1 == 1111
        // n에서 1을 뺀다음에 n과 and 연산을 하면 모두 0이 된다.
        return (n & (n - 1)) == 0;
    }

    /*
        TASK
        두 수에서 다른 비트의 개수를 구한다.
     */

    public int getBitDiff(int a, int b) {
        int diff = a ^ b; //XOR
        int count = 0;
        while (diff != 0) {
            diff = diff & (diff - 1);
            count++;
        }
        return count;
    }
}
