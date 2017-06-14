package datastructure.stack;

import org.junit.Test;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckBrace {

    /*
        TASK
        괄호의 유효성을 체크한다.
     */

    @Test
    public void test() {
        assertThat(solution("(())"), is(true));
        assertThat(solution("()()"), is(true));
        assertThat(solution(")(())("), is(false));
        assertThat(solution("(())("), is(false));
        assertThat(solution(")(())"), is(false));
        assertThat(solution("(()"), is(false));
        assertThat(solution("())"), is(false));

        assertThat(solution("(asdc;aga;ac;dsc;)"), is(true));
        assertThat(solution("(aaa(bbb)ccc)"), is(true));
    }

    public boolean solution(String braces) {
        Stack<Character> stack = new Stack<>();

        if (braces == null) return true;
        char open = "(".charAt(0);
        char close = ")".charAt(0);

        for (char c : braces.toCharArray()) {
            if (c == open) {
                stack.push(c);
            } else if (c == close){
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
