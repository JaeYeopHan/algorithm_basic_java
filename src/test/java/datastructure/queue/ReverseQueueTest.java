package datastructure.queue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseQueueTest {

    /*
        TASK
        Stack을 사용하여 queue를 stack처럼 만든다.
     */

    @Test
    public void test() {
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        que.offer(2);
        que.offer(3);

        reverseQueue(que);

        assertThat(que.poll(), is(3));
        assertThat(que.poll(), is(2));
        assertThat(que.poll(), is(1));
    }

    public Queue<Integer> reverseQueue(Queue<Integer> que) {
        Stack<Integer> stack = new Stack<>();
        while (!que.isEmpty()) {
            stack.push(que.poll());
        }
        while(!stack.isEmpty()) {
            que.offer(stack.pop());
        }
        return que;
    }
}
