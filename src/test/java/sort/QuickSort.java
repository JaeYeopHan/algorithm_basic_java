package sort;

import org.junit.Test;
import utils.Utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuickSort {

    /*
        TASK
        Quick sort를 구현한다.
     */

    @Test
    public void test() {
        int[] arr1 = {};
        int[] sortedArr1 = {};
        assertThat(solution(arr1, 0, arr1.length - 1), is(sortedArr1));
        int[] arr2 = {6,4,1,8,9,2,7,5,3};
        int[] sortedArr2 = {1,2,3,4,5,6,7,8,9};
        assertThat(solution(arr2, 0, arr2.length - 1), is(sortedArr2));
        int[] arr4 = {6,4,2,10,9,1,7,11,5,3,0,8};
        int[] sortedArr4 = {0,1,2,3,4,5,6,7,8,9,10,11};
        assertThat(solution(arr4, 0, arr4.length - 1), is(sortedArr4));
        int[] arr3 = {1};
        int[] sortedArr3 = {1};
        assertThat(solution(arr3, 0, arr3.length - 1), is(sortedArr3));
    }

    public int[] solution(int[] arr, int left, int right) {
        if (arr == null) return null;

        int[] result = arr;
        if (left >= right) return result;

        int pivotPos = partition(result, left, right);

        result = solution(result, left, pivotPos - 1);
        result = solution(result, pivotPos + 1, right);

        return result;
    }

    private int partition(int[] arr, int left, int right) {
        if (arr == null || left < 0) return -1;
        int pivotValue = arr[right];
        int endOfLowBlock = left - 1;

        for (int pos = left; pos < right; ++pos) {
            if (pivotValue > arr[pos]) {
                endOfLowBlock += 1;
                Utils.swapValue(arr, pos, endOfLowBlock);
            }
        }
        endOfLowBlock += 1;
        Utils.swapValue(arr, right, endOfLowBlock);

        return endOfLowBlock;
    }
}
