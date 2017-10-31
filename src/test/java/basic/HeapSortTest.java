package basic;

import basic.sort.HeapSort;
import basic.sort.InsertionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HeapSortTest {
    @Test
    void heapSortTest1() {
        Integer[] unsorted = {5, 2, 3, 4, 1, 7, 9};
        Integer[] sorted = {1, 2, 3, 4, 5, 7, 9};
        Assert.assertArrayEquals(sorted, HeapSort.sort(unsorted));
    }

    @Test
    void heapSortTest2() {
        Integer[] unsorted = {1, 1, 2, 3, 4, 5, 6, 1};
        Integer[] sorted = {1, 1, 1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(sorted, HeapSort.sort(unsorted));
    }
}
