package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InsertionSort {

    /*
        TASK
        Insertion sort를 구현한다.
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
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int k;
            for (k = i - 1; k >= 0; k--) {
                if (temp >= arr[k]) {
                    break;
                }
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = temp;
        }

        return arr;
    }
}
