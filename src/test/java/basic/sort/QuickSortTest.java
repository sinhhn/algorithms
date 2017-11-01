package basic.sort;

import basic.sort.InsertionSort;
import basic.sort.QuickSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    void insertionSortTest1() {
        Integer[] unsorted = {5, 2, 3, 4, 1, 7, 9};
        Integer[] sorted = {1, 2, 3, 4, 5, 7, 9};
        Assert.assertArrayEquals(sorted, QuickSort.quickSort(unsorted));
    }

    @Test
    void insertionSortTest2() {
        Integer[] unsorted = {1, 1, 2, 3, 4, 5, 6, 1};
        Integer[] sorted = {1, 1, 1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(sorted, QuickSort.quickSort(unsorted));
    }
}
