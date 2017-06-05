package utils;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Utils {

    /*
        TASK
        swap util 분리
     */

    @Test
    public void test() {
        int[] arr = {1,2,3};
        int[] chagedArr = {1,3,2};
        assertThat(swapValue(arr, 1,2), is(chagedArr));
    }

    public static int[] swapValue(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public static char[] swapValue(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
