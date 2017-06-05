package algorithm.basicMath;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GcdAndGcm {

    /*
        TASK
        입력받은 두 수의 최대 공약수, 최소 공배수를 구한다.
     */

    @Test
    public void test() {
        assertThat(gcdByIteration(-1, 0), is(-1));
        assertThat(gcdByIteration(0, 0), is(0));
        assertThat(gcdByIteration(6, 8), is(2));
        assertThat(gcdByIteration(3, 3), is(3));

        assertThat(gcdByRecursion(-1, 0), is(-1));
        assertThat(gcdByRecursion(0, 0), is(0));
        assertThat(gcdByRecursion(6, 8), is(2));
        assertThat(gcdByRecursion(3, 3), is(3));

        assertThat(gcm(6, 8), is(24));
    }

    public int gcdByIteration(int a, int b) {
        if (a < 0 || b < 0) return -1;
        int mod;
        while (b != 0) {
            mod = a % b;
            a = b;
            b = mod;
        }
        return a;
    }

    public int gcdByRecursion(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) {
            return a;
        }
        return gcdByRecursion(b, a % b);
    }

    public int gcm(int a, int b) {
        return a * b / gcdByRecursion(a, b);
    }
}
