package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RadixSort {

    /*
        TASK
        radix sort를 구현한다.
     */

    @Test
    public void test() {
        int[] arr = new int[5];
        arr[0] = 52;
        arr[1] = 31;
        arr[2] = 24;
        arr[3] = 45;
        arr[4] = 13;

        int[] sortedArr = new int[arr.length];
        sortedArr[0] = 13;
        sortedArr[1] = 24;
        sortedArr[2] = 31;
        sortedArr[3] = 45;
        sortedArr[4] = 52;
        assertThat(sort(arr), is(sortedArr));
    }

    public int[] sort(int[] arr) {
        int[] newArr = new int[100];
        int[] result = new int[arr.length];
        for (int item : arr) {
            newArr[item] = item;
        }
        int index = 0;
        for (int item : newArr) {
            if (item != 0) {
                result[index++] = item;
            }
        }
        return result;
    }

}
