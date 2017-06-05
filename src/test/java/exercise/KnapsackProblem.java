package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KnapsackProblem {

    /*
        TASK
        일정 무게, 일정 가치를 지닌 보석 여러 종류 있다.
        일정한 무게를 담을 수 있는 가방에 보석들을 담을 때,
        가장 큰 가치를 창출할 수 있는 경우의 수에 대해 계산한다.
     */

    @Test
    public void test() {
        assertThat(solution(), is(0));
    }

    public int solution() {
        return 0;
    }
}
