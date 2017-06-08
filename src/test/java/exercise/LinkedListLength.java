package a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LinkedListLength {

    /*
        TASK
        주어진 배열은 어떠한 링크드 리스트의 정보를 담고 있다.
        배열의 각 원소는 다음 노드의 인덱스를 나타낸다.
        원소의 값이 -1이면 링크드 리스트가 끝났음을 의미한다.
        이 때 주어진 배열로 구성된 링크드 리스트의 길이를 구한다.
     */

    @Test
    public void test() {
        int[] arr = {1, 4, -1, 3, 2};
        assertThat(solution(arr), is(4));
        int[] arr1 = {-1};
        assertThat(solution(arr1), is(1));
        int[] arr2 = {1, -1};
        assertThat(solution(arr2), is(2));
    }

    public int solution(int[] A) {
        if (A.length == 1) return 1;
        int pos = 0;
        int count = 0;
        while (pos != -1) {
            pos = A[pos];
            count += 1;
        }

        return count;
    }
}
