package basic.search;

public class BinarySearch {

    public static int binarySearch(Comparable[] a, Comparable element) {
        return binarySearch(a, 0, a.length - 1, element);
    }

    private static int binarySearch(Comparable[] a, int l, int r, Comparable element) {
        if(l < r) {
            int mid = (l + r) / 2;
            if (element.compareTo(a[mid]) < 0) {
                return binarySearch(a, l, mid - 1, element);
            } else if (element.compareTo(a[mid]) > 0) {
                return binarySearch(a, mid + 1, r, element);
            } else {
                return mid;
            }
        }
        else {
            if (element.compareTo(a[l]) == 0){
                return l;
            }
            else {
                return -1;
            }
        }

    }
}
