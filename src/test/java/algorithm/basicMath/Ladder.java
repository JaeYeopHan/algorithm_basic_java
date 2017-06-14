package algorithm.basicMath;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Ladder {

    /*
        TASK
        사다리를 한 칸 또는 두 칸씩 오를 수 있다고 했을 때
        사다리 높이에 따른 사다리 오르기 방법의 경우의 수를 구한다.
     */

    @Test
    public void test() {
        assertThat(solution(0), is(1));
        assertThat(solution(1), is(1));
        assertThat(solution(2), is(2));
        assertThat(solution(3), is(3));
        assertThat(solution(4), is(5));
        assertThat(solution(5), is(8));
        assertThat(solution(6), is(13));
        assertThat(solution(7), is(21));
    }

    public int solution(int num) {
        return getCountOfCase(num, 0, num);
//        return getCountOfCaseRec(num);
    }

    // Use while statement
    private int getCountOfCase(int one, int two, int num) {
        int result = 0;
        while (one + two * 2 == num && one >= 0) {
            result += getByRecursion(one + two, two);
            one -= 2;
            two += 1;
        }
        return result;
    }

    public int getByRecursion(int n, int r) {
        int cache[][] = new int[n + 1][r + 1];
        if (r == 0 || n == r) {
            return 1;
        }
        if (cache[n][r] != 0) return cache[n][r];
        return cache[n][r] = getByRecursion(n - 1, r - 1) + getByRecursion(n - 1, r);
    }

    // test code를 작성하다보니 이것이 피보나치 규칙을 따른다는 것을 알게 되었다.
    // Recursion version
    private int getCountOfCaseRec(int num) {
        if (num < 2) {
            return 1;
        }
        return getCountOfCaseRec(num - 1) + getCountOfCaseRec(num - 2);
    }
}
