package algorithm.basic;

import org.junit.Test;
import utils.Utils;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringReverse {

    /*
        TASK
        주어진 문자열을 역순으로 출력한다.
     */

    @Test
    public void test() {
        assertThat(solution1("abc"), is("cba"));
        assertThat(solution1("abcd"), is("dcba"));

        assertThat(solution2("abc"), is("cba"));
        assertThat(solution2("abcd"), is("dcba"));
    }

    // 1. 새로운 배열에 담기
    public String solution1(String str) {
        char[] charArr = str.toCharArray();
        char[] resultArr = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            resultArr[charArr.length - i - 1] = charArr[i];
        }
        return new String(resultArr);
    }

    // 2. swap하기
    public String solution2(String str) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length / 2; i++) {
            Utils.swapValue(charArr, i, charArr.length - 1 - i);
        }
        return new String(charArr);
    }
}
