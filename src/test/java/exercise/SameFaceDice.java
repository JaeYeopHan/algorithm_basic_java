package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SameFaceDice {

    /*
        TASK
        각각의 주사위들이 모두 같은 면을 보이기 위한 최소 rotate 횟수를 구한다.
     */

    @Test
    public void test() {
        int[] arr1 = {1,2,3};
        assertThat(solution(arr1), is(2));
        int[] arr2 = {1,1,6};
        assertThat(solution(arr2), is(2));
        int[] arr3 = {1,6,2,3};
        assertThat(solution(arr3), is(3));
        int[] arr4 = {1,1};
        assertThat(solution(arr4), is(0));
        int[] arr5 = {3,3,4,4,2};
        assertThat(solution(arr5), is(4));
    }

    public int solution(int[] A) {
        int result = Integer.MAX_VALUE;
        for (int dice = 1; dice <= 6; dice++) {
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] != dice) {
                    if (A[i] + dice == 7) {
                        count += 2;
                    } else {
                        count += 1;
                    }
                }
            }
            if (result >= count) {
                result = count;
            }
        }
        return result;
    }
}
