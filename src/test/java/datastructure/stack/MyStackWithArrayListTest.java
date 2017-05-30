package datastructure.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyStackWithArrayListTest {
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

        assertThat(6, is(stack.pop()));
        assertThat(5, is(stack.pop()));
        assertThat(4, is(stack.pop()));
        assertThat(3, is(stack.pop()));
        assertThat(2, is(stack.pop()));
        assertThat(1, is(stack.pop()));
        assertThat(0, is(stack.pop()));
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
