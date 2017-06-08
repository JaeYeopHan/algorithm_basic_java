package a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OnlyTwoDigitSum {

    /*
        TASK
        주어진 배열에서 두 자리수만 골라서 합한 값을 return 한다.
     */

    @Test
    public void test() {
        int[] arr = {1, 1000, 80, -91};
        assertThat(solution(arr), is(-11));
        int[] arr1 = {};
        assertThat(solution(arr1), is(0));
        int[] arr2 = {-1, -2};
        assertThat(solution(arr2), is(0));
    }

    public int solution(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int target = Math.abs(A[i]);
            if (target / 100 < 1 && target / 10 > 0) {
                result += A[i];
            }
        }
        return result;
    }
}
