package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSort {

    /*
        TASK
        bubble sort를 구현한다.
     */

    @Test
    public void test() {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 0;
        arr[4] = 3;

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
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
