public class MergeSort {

    public static void extraMemoryMergeSort(int[] a, int n) {
        // If the array has less than 2 elements, it's already sorted
        if (n < 2) {
            return;
        }
        // Find the middle point to divide the array into two halves
        int mid = n / 2;
        // Create temporary arrays to hold the two halves
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        // Copy data to the left subarray
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        // Copy data to the right subarray
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        // Recursively sort the left subarray
        extraMemoryMergeSort(l, mid);
        // Recursively sort the right subarray
        extraMemoryMergeSort(r, n - mid);

        // Merge the sorted subarrays
        extraMemoryMerge(a, l, r, mid, n - mid);
    }

    public static void extraMemoryMerge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        // Traverse both arrays and copy the smallest element to a
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        // Copy any remaining elements of l[] to a[]
        while (i < left) {
            a[k++] = l[i++];
        }
        // Copy any remaining elements of r[] to a[]
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void inPlaceMergeSortHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        inPlaceMergeSortHelper(arr, start, mid);
        inPlaceMergeSortHelper(arr, mid + 1, end);

        inPlaceMerge(arr, start, mid, end);
    }

    public static void inPlaceMerge(int[] arr, int start, int mid, int end) {
        // Calculate the initial gap (h) for comparisons
        int len = end - start + 1;
        int h = (int) Math.ceil(len / 2.0);
        // Perform comparisons and swaps based on the gap
        while (h >= 1) {
            int i = start;
            while (i + h <= end) {
                if (arr[i] > arr[i + h]) {
                    // Swap elements if they are out of order
                    int temp = arr[i];
                    arr[i] = arr[i + h];
                    arr[i + h] = temp;
                }
                i++;
            }
            // If the gap is 1, break to prevent infinite loop
            if (h == 1) {
                break;
            }
            // Reduce the gap for the next iteration
            h = (int) Math.ceil(h / 2.0);
        }
    }

    public static void inPlaceMergeSort(int[] arr) {
        inPlaceMergeSortHelper(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        System.out.println("Extra Memory MergeSort");

        int[] arr1 = {5, 4, 1, 6, 3, 2, 8, 7};
        int n = arr1.length;

        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        extraMemoryMergeSort(arr1, n);

        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");

        System.out.println("In-Place MergeSort");

        int[] arr2 = {5, 4, 1, 6, 3, 2, 8, 7};

        System.out.println("Before sorting:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        inPlaceMergeSort(arr2);

        System.out.println("After sorting:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
