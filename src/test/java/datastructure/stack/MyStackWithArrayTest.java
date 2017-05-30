package datastructure.stack;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyStackWithArrayTest {

    /*
        TASK
        Array를 사용하여 Stack을 구현한다.
    */

    @Test
    public void test() {
        MyStackWithArray stack = new MyStackWithArray();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        assertThat(stack.pop(), is(6));
        assertThat(stack.pop(), is(5));
        assertThat(stack.pop(), is(4));
        assertThat(stack.pop(), is(3));
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
        assertThat(stack.pop(), is(0));

//        java.lang.RuntimeException: Empty Stack!
//        assertThat(0, is(stack.pop()));
    }

    public class MyStackWithArray {
        private int[] data = new int[5];
        private int topIndex = -1;

        public synchronized void push(int i) {
            topIndex++;
            if (topIndex >= data.length) {
                int[] oldData = data;
                data = new int[data.length * 2];
//                System.arraycopy(oldData, 0, data, 0, oldData.length);
                for (int j = 0; j < oldData.length; j++) {
                    data[j] = oldData[j];
                }
            }

            data[topIndex] = i;
        }

        public synchronized int pop() {
            if (topIndex < 0) {
                throw new RuntimeException("Empty Stack!");
            }
//            int result = data[topIndex];
//            topIndex--;
            return data[topIndex--];
        }
    }
}
