package algorithm.basic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindPrimeNumTest {

    /*
        TASK
        주어지는 수 이하의 소수 개수를 구한다.
     */

    @Test
    public void test() {
        assertThat(solution(-3), is(-1));
        assertThat(solution(0), is(0));
        assertThat(solution(1), is(0));
        assertThat(solution(2), is(1));
        assertThat(solution(3), is(2));
        assertThat(solution(8), is(4));
        assertThat(solution(12), is(5));
        assertThat(solution(44), is(14));
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43
    }

    public int solution(int num) {
        if (num < 0) {
            return -1;
        }
        int[] checkList = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            checkList[i] = i;
        }
        int baseNum = (int) Math.sqrt(num);

        for (int i = 2; i <= baseNum; i++) {
            if (checkList[i] == 0) {
                continue;
            }
            for (int k = i; k <= num; k += i) {
                if (checkList[k] != i && checkList[k] % i == 0) {
                    checkList[k] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (checkList[i] != 0) {
                count++;
            }
        }

        return count;
    }
}
