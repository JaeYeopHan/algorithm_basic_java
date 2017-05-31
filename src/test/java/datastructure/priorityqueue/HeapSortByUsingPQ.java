package datastructure.priorityqueue;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HeapSortByUsingPQ {

    /*
        TASK
        Priority queue를 사용하여 heap sort를 하라.
     */

    @Test
    public void test() {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 6;

        int[] sortedArr = new int[5];
        sortedArr[0] = 1;
        sortedArr[1] = 3;
        sortedArr[2] = 6;
        sortedArr[3] = 7;
        sortedArr[4] = 9;
        assertThat(heapSort(arr), is(sortedArr));
    }

    public int[] heapSort(int[] arr) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) { //O(nlogn)
            queue.add(arr[i]);
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) { //O(nlogn)
            newArr[i] = queue.poll();
        }
        return newArr;
    }
}
