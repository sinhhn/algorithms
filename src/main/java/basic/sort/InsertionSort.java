package basic.sort;

public class InsertionSort {
    public static Comparable[] insertionSort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && Helper.less(a[j], a[j - 1]); j--) {
                Helper.exch(a, j, j - 1);
            }
        }
        return a;
    }
}
