package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindMaxSumInArray {

    /*
        TASK
        주어진 배열에서 합이 최대가 되는 sub array의 합을 구한다.
     */

    @Test
    public void test() {
        int[] arr1 = {1,2,-9,4,-3,12,24,3,4,-8,10,9};
        assertThat(solution(arr1), is(55));
        int[] arr2 = {};
        assertThat(solution(arr2), is(Integer.MAX_VALUE));
        int[] arr3 = {1};
        assertThat(solution(arr3), is(1));
        int[] arr4 = {1,2};
        assertThat(solution(arr4), is(3));
    }

    public int solution(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MAX_VALUE;

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max + arr[i]) {
                max = arr[i];
            } else {
                max += arr[i];
            }
        }

        return max;
    }
}
