package sort;

import org.junit.Test;
import utils.Utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SelectionSort {

    /*
        TASK
        Selection sort를 구현한다.
     */

    @Test
    public void test() {
        int[] arr1 = {};
        int[] sortedArr1 = {};
        assertThat(solution(arr1), is(sortedArr1));
        int[] arr2 = {6,4,1,8,9,2,7,5,3};
        int[] sortedArr2 = {1,2,3,4,5,6,7,8,9};
        assertThat(solution(arr2), is(sortedArr2));
        int[] arr3 = {1};
        int[] sortedArr3 = {1};
        assertThat(solution(arr3), is(sortedArr3));
    }

    public int[] solution(int[] arr) {
        if (arr == null) return null;
        int[] result = arr;
        int maxPos;

        for (int i = 0; i < result.length - 1; i++) {
            maxPos = i;
            for (int k = i + 1; k < result.length; k++) {
                if (result[maxPos] > result[k]) {
                    maxPos = k;
                }
            }
            result = Utils.swapValue(result, i, maxPos);
        }
        return result;
    }
}
