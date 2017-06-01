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
        int[] arr = new int[7];
        arr[0] = 52;
        arr[1] = 31;
        arr[2] = 24;
        arr[3] = 45;
        arr[4] = 13;
        arr[5] = 11;
        arr[6] = 28;
        assertThat(searchByRec(arr, 24), is(2));
        assertThat(search(arr, 24), is(2));
    }

    // while version
    private int search(int[] arr, int target) {
        if (arr == null) return -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid;
                right -= 1;
            } else {
                right = mid;
                left += 1;
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
            return searchRec(arr, mid, right - 1, target);
        } else {
            return searchRec(arr, left + 1, mid, target);
        }
    }
}
