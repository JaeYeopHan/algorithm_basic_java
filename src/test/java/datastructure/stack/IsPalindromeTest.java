package datastructure.stack;

import org.junit.Test;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IsPalindromeTest {

    /*
        TASK
        Stack 자료구조를 사용하여 회문을 판별한다.
     */

    @Test
    public void test() {
        assertThat(isPalindrome("abba"), is(true));
    }

    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() / 2) {
                stack.add(charArr[i]);
            } else {
                if (stack.pop() != charArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
