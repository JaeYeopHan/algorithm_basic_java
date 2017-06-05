package search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    /*
        TASK
        binary search를 사용하여 O(log n)의 시간복잡도로 target을 찾는다.
     */
    @Test
    public void test() {
        int[] arr1 = {11,22,33,44,55,66,77,88};
        int[] arr2 = {11,22,33,44,55,66,77};
        int[] arr3 = {1};
        int[] arr4 = {};
        assertThat(search(arr1, 33), is(2));
        assertThat(search(arr2, 22), is(1));
        assertThat(search(arr3, 1), is(0));
        assertThat(search(arr4, 1), is(-1));

        assertThat(searchByRec(arr1, 33), is(2));
        assertThat(searchByRec(arr2, 22), is(1));
        assertThat(searchByRec(arr3, 1), is(0));
        assertThat(searchByRec(arr4, 1), is(-1));
    }

    // while version
    private int search(int[] arr, int target) {
        if (arr == null) return -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //recursive version
    private int searchByRec(int[] arr, int target) {
        if (arr == null) return -1;
        return searchRec(arr, 0, arr.length - 1, target);
    }

    private int searchRec(int[] arr, int left, int right, int target) {
        if (left > right || left < 0 || right >= arr.length) return -1;
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return searchRec(arr, mid + 1, right, target);
        } else {
            return searchRec(arr, left, mid - 1, target);
        }
    }
}
