package basic.search;

public class BinarySearch {

    public static int binarySearch(Comparable[] a, Comparable element) {
        return binarySearch(a, 0, a.length - 1, element);
    }

    private static int binarySearch(Comparable[] a, int l, int r, Comparable element) {
        int mid = (l + r) / 2;
        if (element.compareTo(a[mid]) < 0) {
            return binarySearch(a, l, mid, element);
        } else if (element.compareTo(a[mid]) > 0) {
            return binarySearch(a, mid, r, element);
        } else {
            return mid;
        }
    }
}
