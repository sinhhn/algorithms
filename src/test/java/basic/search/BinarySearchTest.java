package basic.search;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BinarySearchTest {
    @Test
    void binarySearchTest1() {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer element = 3;
        Assert.assertEquals(2, BinarySearch.binarySearch(a, element));
    }

    @Test
    void binarySearchTest2() {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        Integer element = 15;
        Assert.assertEquals(14, BinarySearch.binarySearch(a, element));
    }

    @Test
    void binarySearchTest3() {
        int n = 10000000;
        Integer[] a = new Integer[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
        }
        Integer element = 777777;
        Assert.assertEquals(element - 1, BinarySearch.binarySearch(a, element));
    }

}
