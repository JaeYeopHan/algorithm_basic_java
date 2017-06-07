package famous_algorithm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KMP_Algorithm {

    /*
        TASK
        장문의 문자열 A가 존재할 때,
        이 문자열 A 안에 특정 문자열 B가 존재하는지 알 수 있는 방법을 해결한다.
     */

    @Test
    public void test() {
        assertThat(KMP("abcxabcdabcdabcy".toCharArray(), "abcdabcy".toCharArray()), is(true));
    }

    /*
        SOLVE
        Karp-Rabin에서는 한 칸씩 이동하면서 패턴 문자열과 비교해줬다.
        하지만 이는 비교 과정 중에 발생한 소중한 정보를 버리고 다시 비교하는 것이다.
        kmp는 한 칸씩 이동하는 것이 아니라 몇 칸씩 이동하며 비교하기 때문에
        karp-rabin 보다 빠르게 탐색이 가능하다.

        패턴의 접두사와 접미사 그리고 경계라는 것을 사용하여 비교가 필요없는 경우를 필터링해 필요할 때만 비교를 해준다.
        비교를 한 다음 일치하는 부분의 접두사와 접미사를 비교하여 같은 개수 만큼 이동한다.
        그리고 경계부터 다시 본문과 비교해준다.

        매번 접두사와 접미사를 비교하는 것도 비용이므로
        접두사와 접미사가 같은 개수에 대한 테이블을 만들어둔다.
     */

    private int[] computeTemporaryArray(char[] pattern) {
        int[] lps = new int[pattern.length];
        int idx = 0;
        for (int i = 1; i < pattern.length;) {
            if (pattern[i] == pattern[idx]) {
                lps[i] = idx + 1;
                idx++;
                i++;
            } else {
                if (idx != 0) {
                    idx = lps[idx - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public boolean KMP(char []text, char []pattern){

        int lps[] = computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattern.length){
            return true;
        }
        return false;
    }

    /*
        REFERENCE
        YOUTUBE : https://www.youtube.com/watch?v=GTJr8OvyEVQ
        GITHUB  : https://github.com/mission-peace/interview/blob/master/src/com/interview/string/SubstringSearch.java
     */

}
