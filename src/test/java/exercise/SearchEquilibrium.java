package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchEquilibrium {

    /*
        TASK
        주어진 배열에서 양 쪽의 합이 동일해지는 index의 값을 구한다.
     */

    @Test
    public void test() {
        int[] arr = {-4, 8, 16, -22, 0, -4, 8, 16, -22};
        assertThat(true, is(solution(arr) == 0 || solution(arr) == 4));
    }

    public int solution(int[] arr) {
        if (arr == null) return -1;

        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        if (total - arr[0] == 0) {
            return 0;
        }

        if (total - arr[arr.length - 1] == arr[arr.length - 1]) {
            return arr.length - 1;
        }

        int left = 0;
        for (int i = 1; i < arr.length; i++) {
            left += arr[i - 1];
            if ((total - arr[i])/2 == left) {
                return i;
            }
        }

        return -1;
    }
}
