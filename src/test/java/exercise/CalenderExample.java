package exercise;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalenderExample {

    /*
        TASK
        2017년 1월 1일은 일요일이다.
        2017년 어느날의 월, 일을 입력받아 요일을 반환하는 함수를 구현한다.

        2017년 2월은 28일까지 있다.
        요일은 월~일을 0~6으로 표현한다.
        예를 들어 월요일이면 0을 반환하고, 토요일은 5, 일요일은 6을 반환한다.
     */

    @Test
    public void test() {
        Calendar c = new Calendar();
        assertThat(c.getDay(3, 20), is("금요일"));
    }

    public int getDayOfWeek(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;

        for (int i = 1; i < month; i++) {
            count += daysInMonth[i];
        }
        count += day;
        count += 5;
        return count % 7;
    }

    public class Calendar {
        private Map<Integer, Integer> calender;

        public Calendar() {
            this.calender = buildCalender();
        }

        public String getDay(int month, int day) {
            switch (getDayIntFormat(month, day)) {
                case 0:
                    return "월요일";
                case 1:
                    return "화요일";
                case 2:
                    return "수요일";
                case 3:
                    return "목요일";
                case 4:
                    return "금요일";
                case 5:
                    return "토요일";
                case 6:
                    return "일요일";
                default:
                    return null;
            }
        }

        private int getDayIntFormat(int month, int day) {
            for (Map.Entry<Integer, Integer> entry : calender.entrySet()) {
                int sum = 0;
                if (entry.getKey() == month) {
                    return (sum + day + 5) % 7;
                }
                sum += entry.getValue();
            }
            return -1;
        }

        private Map<Integer, Integer> buildCalender() {
            Map<Integer, Integer> calender = new HashMap<>();
            calender.put(1, 31);
            calender.put(2, 28);
            calender.put(3, 31);
            calender.put(4, 30);
            calender.put(5, 31);
            calender.put(6, 30);
            calender.put(7, 31);
            calender.put(8, 31);
            calender.put(9, 30);
            calender.put(10, 31);
            calender.put(11, 30);
            calender.put(12, 31);
            return calender;
        }
    }
}
