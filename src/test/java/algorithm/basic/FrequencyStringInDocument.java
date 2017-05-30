package algorithm.basic;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FrequencyStringInDocument {

    /*
        TASK
        주어진 문서(단어별로 나뉘어진 배열)에서 특정 단어의 빈도를 구한다.
     */

    @Test
    public void test() {
        String[] strArr = new String[100];
        assertThat(countStringInDocs(strArr, null), is(0));
        strArr[0] = "jbee";
        assertThat(countStringInDocs(strArr, "jbee"), is(1));
        strArr[1] = "jbee";
        assertThat(countStringInDocs(strArr, "jbee"), is(2));
        strArr[2] = "jbee";
        assertThat(countStringInDocs(strArr, "jbee"), is(3));
    }

    private int countStringInDocs(String[] strArr, String target) {
        if (strArr == null || target == null) return 0;

        Map<String, Integer> countString = new HashMap<>();
        Arrays.stream(strArr).forEach(str -> {
            if (!countString.containsKey(str)) {
                countString.put(str, 0);
            }
            countString.put(str, countString.get(str) + 1);
        });

        if (countString.get(target) == null) {
            return 0;
        }

        return countString.get(target);
    }
}
