package algorithm.basic;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CharacterCompressWithLength {

    /*
        TASK
        주어진 문자열을 길이와 함께 적어주면서 압축을 한다.
     */

    @Test
    public void test() {
        assertThat(null, is(runLengthCompress_USE_HASHMAP(null)));
        assertThat(runLengthCompress_USE_HASHMAP("aaabbbccc"), is("a3b3c3"));
        assertThat(runLengthCompress_USE_HASHMAP("aabbacbccc"), is("a3b3c4"));
        assertThat(runLengthCompress("aaabbbccc"), is("a3b3c3"));
    }

    private String runLengthCompress_USE_HASHMAP(String str) {
        if (str == null) return null;

        Map<Character, Integer> charCounter = new HashMap<>(str.length());

        for (char c : str.toCharArray()) {
            if (!charCounter.containsKey(c)) {
                charCounter.put(c, 0);
            }
            charCounter.put(c, charCounter.get(c) + 1);
        }
        StringBuilder sb = new StringBuilder();
        charCounter.forEach((chr, count) -> sb.append(chr + count.toString()));
        return sb.toString();
    }

    private String runLengthCompress(String str) {
        if (str == null) return null;

        char[] ca = str.toCharArray();
        String result = "";
        int count = 1;
        char prev = ca[0];

        for (int i = 1; i < ca.length; i++) {
            if (prev == ca[i]) {
                count++;
            } else {
                result = result + prev + count;
                count = 1;
                prev = ca[i];
            }
        }
        result = result + prev + count;
        return result;
    }
}
