package basic.sort;

public class SelectionSort {

    public static Comparable[] selectionSort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (Helper.less(a[j], a[min])) {
                    min = j;
                }
            }
            Helper.swap(a, i, min);
        }
        return a;
    }
}
