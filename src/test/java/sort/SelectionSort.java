package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SelectionSort {

    /*
        TASK
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

        int[] arr = {1,2,3};
        int[] chagedArr = {1,3,2};
        assertThat(swapValue(arr, 1,2), is(chagedArr));
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
            result = swapValue(result, i, maxPos);
        }
        return result;
    }

    private int[] swapValue(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
