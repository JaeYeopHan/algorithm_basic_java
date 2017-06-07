package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchEquilibrium {

    @Test
    public void test() {
        int[] arr = new int[9];
        arr[0] = -4;
        arr[1] = 8;
        arr[2] = 16;
        arr[3] = -22;
        arr[4] = 0;
        arr[5] = -4;
        arr[6] = 8;
        arr[7] = 16;
        arr[8] = -22;
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
