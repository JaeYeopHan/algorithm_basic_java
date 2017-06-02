package exercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorialZeroCount {

    /*
        TASK
        n!의 결과값에서 0의 개수를 구한다.
     */

    @Test
    public void test() {

        assertThat(countZero1(getFactorial(5)), is(1));
        assertThat(countZero1(getFactorial(12)), is(2));
        assertThat(countZero2(5), is(1));
        assertThat(countZero2(12), is(2));
    }

    public int getFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public int countZero1(int num) {
        int count = 0;
        while (num % 10 == 0) {
            num /= 10;
            count++;
        }
        return count;
    }


    // 5가 얼마나 곱해졌는지가 중요하다.
    public int countZero2(int num) {
        int count = 0;
        for (int i = 5; i <= num; i += 5) {
            int base = i;
            while (base % 5 == 0) {
                base /= 5;
                count++;
            }
        }
        return count;
    }
}
