package basic.sort;

import basic.sort.SelectionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class SelectionSortTest {
    @Test
    void selectionSortTest1() {
        Integer[] unsorted = {5, 2, 3, 4, 1, 7, 9};
        Integer[] sorted = {1, 2, 3, 4, 5, 7, 9};
        Assert.assertArrayEquals(sorted, SelectionSort.selectionSort(unsorted));
    }

    @Test
    void selectionSortTest2() {
        Integer[] unsorted = {1, 1, 2, 3, 4, 5, 6, 1};
        Integer[] sorted = {1, 1, 1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(sorted, SelectionSort.selectionSort(unsorted));
    }
}
