import java.util.Random;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class MergeSortTimer {

    public static int[] generateRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(1000000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        int numRuns = 5;

        // String formatting https://stackoverflow.com/questions/33466526/java-printf-formatting-to-print-items-in-a-table-or-columns
        System.out.printf("%-12s %-22s %-22s%n", "Size", "ExtraMemorySort(ms)", "InPlaceSort(ms)");

        for (int size : sizes) {
            long totalTimeExtraMemory = 0;
            long totalTimeInPlace = 0;

            for (int run = 0; run < numRuns; run++) {
                // Generate random array of the given size
                int[] originalArray = generateRandomArray(size);

                // Make copies for each sort
                int[] arrayForExtraMemorySort = Arrays.copyOf(originalArray, originalArray.length);
                int[] arrayForInPlaceSort = Arrays.copyOf(originalArray, originalArray.length);

                // Time extraMemoryMergeSort
                long startTimeExtraMemory = System.nanoTime();
                MergeSort.extraMemoryMergeSort(arrayForExtraMemorySort, arrayForExtraMemorySort.length);
                long endTimeExtraMemory = System.nanoTime();
                totalTimeExtraMemory += (endTimeExtraMemory - startTimeExtraMemory);

                // Time inPlaceMergeSort
                long startTimeInPlace = System.nanoTime();
                MergeSort.inPlaceMergeSort(arrayForInPlaceSort);
                long endTimeInPlace = System.nanoTime();
                totalTimeInPlace += (endTimeInPlace - startTimeInPlace);
            }

            // Calculate average times in milliseconds
            // From https://stackoverflow.com/questions/18377477/java-calculate-how-long-sorting-an-array-takes
            double avgTimeExtraMemory = TimeUnit.MILLISECONDS.convert(totalTimeExtraMemory, TimeUnit.NANOSECONDS) / (double) numRuns;
            double avgTimeInPlace = TimeUnit.MILLISECONDS.convert(totalTimeInPlace, TimeUnit.NANOSECONDS) / (double) numRuns;

            // String formatting https://stackoverflow.com/questions/33466526/java-printf-formatting-to-print-items-in-a-table-or-columns
            // Output results into a table
            System.out.printf("%-12d %-22.2f %-22.2f%n", size, avgTimeExtraMemory, avgTimeInPlace);
        }
    }
}

/*
Size         ExtraMemorySort(ms)    InPlaceSort(ms)
1000         0.20                   0.20
10000        1.00                   1.60
100000       12.60                  21.20
1000000      122.80                 242.60
 */
