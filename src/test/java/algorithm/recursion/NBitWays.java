package algorithm.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NBitWays {

    /*
        TASK
        n비트의 모든 경우의 수를 출력한다.
     */

    @Test
    public void test() {
        List<String> actual1 = new ArrayList<>();
        actual1.add("00");
        actual1.add("01");
        actual1.add("10");
        actual1.add("11");
        assertThat(actual1, is(calcBitCombination(2)));

        List<String> actual2 = new ArrayList<>();
        actual2.add("000");
        actual2.add("001");
        actual2.add("010");
        actual2.add("011");
        actual2.add("100");
        actual2.add("101");
        actual2.add("110");
        actual2.add("111");
        assertThat(actual2, is(calcBitCombination(3)));
    }

    public List<String> calcBitCombination(int n) {
        return bitCombination(n, "", new ArrayList<>());
    }

    private List<String> bitCombination(int n, String str, List<String> list) {
        if (n == str.length()) {
            list.add(str);
            return list;
        }
        bitCombination(n, str + "0", list);
        bitCombination(n, str + "1", list);
        return list;
    }
}
