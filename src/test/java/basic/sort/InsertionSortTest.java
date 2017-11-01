package basic.sort;

import basic.sort.InsertionSort;
import basic.sort.SelectionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    @Test
    void insertionSortTest1() {
        Integer[] unsorted = {5, 2, 3, 4, 1, 7, 9};
        Integer[] sorted = {1, 2, 3, 4, 5, 7, 9};
        Assert.assertArrayEquals(sorted, InsertionSort.insertionSort(unsorted));
    }

    @Test
    void insertionSortTest2() {
        Integer[] unsorted = {1, 1, 2, 3, 4, 5, 6, 1};
        Integer[] sorted = {1, 1, 1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(sorted, InsertionSort.insertionSort(unsorted));
    }
}
