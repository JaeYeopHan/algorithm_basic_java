package famous_algorithm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Karp_Rabin_Algorithm {

    /*
        TASK
        장문의 문자열 A가 존재할 때,
        이 문자열 A 안에 특정 문자열 B가 존재하는지 알 수 있는 방법을 해결한다.
     */

    @Test
    public void test() {
        KarpRabinSearch rbk = new KarpRabinSearch();
        assertThat(rbk.patternSearch("dgethwabcafg".toCharArray(), "abc".toCharArray()), is(6));
    }

    /*
        SOLVE
        문자열을 수치로 변환시켜 탐색한다.
        찾고자 하는 문자열을 hash 값으로 치환하여
        본문에서 이와 동일한 hash 값에 대해서만 같은 문자열인지 비교해준다.
        (다른 문자열도 hash 값이 같을 수 있으므로)
        이 때 핵심은 찾고자 하는 문자열의 hash 값은 물론이고 본문의 hash 값을 효율적으로 구할 수 있는 것이다.
        즉 찾고자하는 문자열과 비교를 할 때 매번 hash 값을 생성하는 것이 아니고
        수학적인 규칙 속에서 이미 계산한 값을 재사용하는 것이 핵심이다.

        TIME COMPLEXITY : O(MN)
     */

    public class KarpRabinSearch {
        private int prime = 101;

        public int patternSearch(char[] text, char[] pattern) {
            int m = pattern.length;
            int n = text.length;
            long patternHash = createHash(pattern, m - 1);
            long textHash = createHash(text, m - 1);

            for (int i = 1; i < n - m + 1; i++) {
                if (patternHash == textHash && checkEqual(text, i - 1, i + m - 2, pattern, 0, m - 1)) {
                    return i - 1;
                }

                if (i < n - m + 1) {
                    textHash = reCalculateHash(text, i - 1, i + m - 1, textHash, m);
                }
            }
            return -1;
        }

        private boolean checkEqual(char[] str1, int start1, int end1, char[] str2, int start2, int end2) {
            if (end1 - start1 != end2 - start2) {
                return false;
            }
            while (start1 <= end1 && start2 <= end2) {
                if (str1[start1] != str2[start2]) {
                    return false;
                }
                start1++;
                start2++;
            }
            return true;
        }

        private long reCalculateHash(char[] str, int oldIndex, int newIndex, long oldHash, int patternLen) {
            long newHash = oldHash - str[oldIndex];
            newHash = newHash / prime;
            newHash += str[newIndex]*Math.pow(prime, patternLen - 1);
            return newHash;
        }

        private long createHash(char[] str, int end) {
            long hash = 0;
            for (int i = 0; i <= end; i++) {
                hash += str[i]*Math.pow(prime, i);

            }
            return hash;
        }
    }

    /*
        REFERENCE
        YOUTUBE : https://www.youtube.com/watch?v=H4VrKHVG5qI
        GITHUB  : https://github.com/mission-peace/interview/blob/master/src/com/interview/string/RabinKarpSearch.java
     */

}
