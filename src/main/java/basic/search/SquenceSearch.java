package basic.search;

public class SquenceSearch {
    public static int squenceSearch(Comparable[] a, Comparable element) {
        for (int i = 0; i < a.length; i++) {
            if(element.compareTo(a[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
}
