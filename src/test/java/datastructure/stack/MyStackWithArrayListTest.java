package datastructure.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyStackWithArrayListTest {

    /*
        TASK
        ArrayList를 사용하여 Stack을 구현한다.
    */

    @Test
    public void test() {
        MyStackWithArrayList<Integer> stack = new MyStackWithArrayList<>();

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
//        java.lang.ArrayIndexOutOfBoundsException: -1
//        assertThat(stack.pop(), is(0));
    }

    public class MyStackWithArrayList<T> {
        private List<T> data;

        public MyStackWithArrayList() {
            data = new ArrayList<T>();
        }

        public void push(T i) {
            data.add(i);
        }

        public T pop() {
            return data.remove(data.size() - 1);
        }
    }
}
