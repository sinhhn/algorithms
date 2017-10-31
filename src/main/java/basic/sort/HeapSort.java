package basic.sort;

public class HeapSort {


    public static Comparable[] sort(Comparable[] a) {
        int n = a.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            Helper.swap(a, 0, i);
            // call max heapify on the reduced heap
            heapify(a, i, 0);
        }
        return a;
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private static void heapify(Comparable arr[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int l = 2 * i + 1;  // left = 2*i + 1
        int r = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && Helper.less(arr[largest], arr[l]))
            largest = l;

        // If right child is larger than largest so far
        if (r < n && Helper.less(arr[largest], arr[r]))
            largest = r;

        // If largest is not root
        if (largest != i) {
            Helper.swap(arr, i, largest);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

}