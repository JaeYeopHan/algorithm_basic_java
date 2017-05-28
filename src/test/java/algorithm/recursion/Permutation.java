package algorithm.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class Permutation {

    /*
        TASK
        순열을 구한다.
     */

    @Test
    public void test() {
        List<String> actual = new ArrayList<>();
        actual.add("123");
        actual.add("132");
        actual.add("213");
        actual.add("231");
        actual.add("312");
        actual.add("321");
        assertThat(actual, is(calcPermutation("123")));
    }

    public List<String> calcPermutation(String str) {
        if (str == null) return null;
        return permutation(str, new boolean[str.length()],
                            "", new ArrayList<>());
    }

    private List<String> permutation(String str, boolean[] isPick,
                                     String perm, List<String> result) {
        if (str.length() == perm.length()) {
            result.add(perm);
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            if (isPick[i]) {
                continue;
            }
            isPick[i] = true;
            permutation(str, isPick, perm + str.charAt(i), result);
            isPick[i] = false;
        }
        return result;
    }
}
