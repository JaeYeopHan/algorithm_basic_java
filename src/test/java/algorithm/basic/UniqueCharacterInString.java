package algorithm.basic;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UniqueCharacterInString {

    /*
        TASK
        주어진 문자열에서 문자열을 구성하고 있는 각각의 문자열들이 고유한지를 판단한다.
     */

    @Test
    public void test() {
        assertThat(이중포문을_사용한_방법("abcd"), is(true));
        assertThat(이중포문을_사용한_방법("abcdefghij"), is(true));
        assertThat(이중포문을_사용한_방법("abccde"), is(false));
        assertThat(이중포문을_사용한_방법("abca"), is(false));

        assertThat(HashSet을_사용한_방법("abcd"), is(true));
        assertThat(HashSet을_사용한_방법("abcdefghij"), is(true));
        assertThat(HashSet을_사용한_방법("abccde"), is(false));
        assertThat(HashSet을_사용한_방법("abca"), is(false));
    }

    private boolean 이중포문을_사용한_방법(String str) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) return false;
            }
        }
        return true;
    }

    private boolean HashSet을_사용한_방법(String str) {
        Set<Character> strSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (strSet.contains(c)) {
                return false;
            }
            strSet.add(c);
        }
        return true;
    }
}
