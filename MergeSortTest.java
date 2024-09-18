import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testExtraMemoryMergeSort() {
        int[] arr = {5, 4, 1, 6, 3, 2, 8, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arr, arr.length);
        assertArrayEquals(expected, arr);

        int[] arrSorted = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expcectedSorted = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arrSorted, arrSorted.length);
        assertArrayEquals(expcectedSorted, arrSorted);

        int[] arrReverse = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedReverse = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arrReverse, arrReverse.length);
        assertArrayEquals(expectedReverse, arrReverse);

        int[] arrDuplicates = {5, 3, 1, 3, 6, 3, 8, 7};
        int[] expectedDuplicates = {1, 3, 3, 3, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arrDuplicates, arrDuplicates.length);
        assertArrayEquals(expectedDuplicates, arrDuplicates);

        int[] arrEmpty = {};
        int[] expectedEmpty = {};
        MergeSort.extraMemoryMergeSort(arrEmpty, arrEmpty.length);
        assertArrayEquals(expectedEmpty, arrEmpty);

        int[] arrSingle = {1};
        int[] expectedSingle = {1};
        MergeSort.extraMemoryMergeSort(arrSingle, arrSingle.length);
        assertArrayEquals(expectedSingle, arrSingle);
    }

    @Test
    public void testInPlaceMergeSort() {
        int[] arr = {5, 4, 1, 6, 3, 2, 8, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arr);
        assertArrayEquals(expected, arr);

        int[] arrSorted = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expcectedSorted = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arrSorted);
        assertArrayEquals(expcectedSorted, arrSorted);

        int[] arrReverse = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedReverse = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arrReverse);
        assertArrayEquals(expectedReverse, arrReverse);

        int[] arrDuplicates = {5, 3, 1, 3, 6, 3, 8, 7};
        int[] expectedDuplicates = {1, 3, 3, 3, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arrDuplicates);
        assertArrayEquals(expectedDuplicates, arrDuplicates);

        int[] arrEmpty = {};
        int[] expectedEmpty = {};
        MergeSort.inPlaceMergeSort(arrEmpty);
        assertArrayEquals(expectedEmpty, arrEmpty);

        int[] arrSingle = {1};
        int[] expectedSingle = {1};
        MergeSort.inPlaceMergeSort(arrSingle);
        assertArrayEquals(expectedSingle, arrSingle);
    }
}
