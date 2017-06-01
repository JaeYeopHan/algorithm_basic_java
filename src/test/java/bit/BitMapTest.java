package bit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BitMapTest {

    /*
        TASK
        O(1)으로 해당 데이터가 존재하는지 판단한다.
     */

    @Test
    public void test() {
        BitMap bitMap = new BitMap();
        bitMap.store("1234567");
        assertThat(bitMap.exist("1234567"), is(true));
        assertThat(bitMap.exist("1234568"), is(false));
    }

    public class BitMap {
        public int[] cache;

        public BitMap() {
            cache = new int[(10 * 1000 * 1000) / 32];
        }

        public void store(String data) {
            int dataInt = Integer.parseInt(data);
            int arrIndex = dataInt / 32;
            int byteIndex = dataInt % 32;
            cache[arrIndex] = cache[arrIndex] | (1 << byteIndex);
        }

        public boolean exist(String data) {
            int dataInt = Integer.parseInt(data);
            int arrIndex = dataInt / 32;
            int byteIndex = dataInt % 32;
            return (cache[arrIndex] & (1 << byteIndex)) != 0;
        }
    }
}
