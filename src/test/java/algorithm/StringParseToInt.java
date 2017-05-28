package algorithm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringParseToInt {

    /*
        TASK
        주어진 문자열을 int 형으로 변환한다.
    */

    @Test
    public void toIntFromString() {
        assertThat(123, is(toIntFromString("123")));
    }

    private int toIntFromString(String str) {
//        return Integer.parseInt(str);
        char[] strArr = str.toCharArray();
        int base = 0;
        for (char c : strArr) {
            base *= 10;
            base += c - '0';
        }
        return base;
    }
}
