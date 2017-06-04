package sort;

import org.junit.Test;
import utils.Utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSort {

    /*
        TASK
        bubble sort를 구현한다.
     */

    @Test
    public void test() {
        int[] arr = {2,1,4,0,3};
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = i;
        }
        assertThat(sort(arr), is(sortedArr));
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Utils.swapValue(arr, i, j);
                }
            }
        }
        return arr;
    }
}
