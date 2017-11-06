package basic.search;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SquenceSearchTest {

    @Test
    void sequenceSearchTest3() {
        int n = 10000000;
        Integer[] a = new Integer[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
        }
        Integer element = 777777;
        Assert.assertEquals(element - 1, SquenceSearch.squenceSearch(a, element));
    }
}
