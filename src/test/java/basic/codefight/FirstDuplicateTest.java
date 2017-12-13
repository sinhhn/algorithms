package basic.codefight;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FirstDuplicateTest {
    @Test
    void firstDuplicateTest1() {
        int[] a = {1, 2, 3, 3, 4, 5, 6, 7, 8, 10, 11};
        Assert.assertEquals(3, FirstDuplicate.firstDuplicate(a));
    }
}
