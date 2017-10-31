package basic.sort;

public class QuickSort {
    public static Comparable[] quickSort(Comparable[] a) {
        quickSort(a, 0, a.length - 1);
        return a;
    }

    private static void quickSort(Comparable[] a, int l, int r) {
        int index = partition(a, l, r);
        if (l < index - 1)
            quickSort(a, l, index - 1);
        if (index < r)
            quickSort(a, index, r);
    }

    private static int partition(Comparable[] a, int l, int r) {
        int i = l;
        int j = r;
        Comparable pivot = a[(l + r) / 2];
        while (i <= j) {
            while (Helper.less(a[i], pivot)) {
                i++;
            }

            while (Helper.less(pivot, a[j])) {
                j--;
            }

            if (i <= j) {
                Helper.swap(a, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
}
