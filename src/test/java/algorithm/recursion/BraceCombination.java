package algorithm.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BraceCombination {

    /*
        TASK
        N개 괄호로 만들 수 있는 모든 조합 출력하기.
     */

    @Test
    public void test() {
        assertThat(null, is(괄호경우의수구하기(0)));
        List<String> actual = new ArrayList<>();
        actual.add("(())");
        actual.add("()()");
        assertThat(괄호경우의수구하기(2), is(actual));
    }

    public List<String> 괄호경우의수구하기(int n) {
        if (n == 0) {
            return null;
        }
        return combination(n, n, "", new ArrayList<>());
    }

    private List<String> combination(int start, int end,
                                     String pairs, List<String> result) {
        if (start > end) return result;
        if (start < 0 || end < 0) return result;
        if (start == 0 && end == 0) {
            result.add(pairs);
            return result;
        }
        combination(start - 1, end, pairs + "(", result);
        combination(start, end - 1, pairs + ")", result);
        return result;
    }
}
