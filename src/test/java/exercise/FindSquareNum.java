package a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindSquareNum {

    /*
        TASK
        주어진 두 수 사이에 존재하는 수 중 제곱수가 되는 것을 구한다.
     */

    @Test
    public void test() {
        assertThat(solution(4, 17), is(3));
        assertThat(solution(17, 37), is(2));
        assertThat(solution(63, 123), is(4));
        assertThat(solution(17, 4), is(0));
        assertThat(solution(-1, -1), is(-1));
    }

    public int solution(int A, int B) {
        if (A < 0 && B < 0) return -1;
        int result = 0;
        for (int i = (int) Math.sqrt(A); i <= (int) Math.sqrt(B); i++) {
            int target = i * i;
            if (target >= A && target <= B) {
                result += 1;
            }
        }
        return result;
    }
}
