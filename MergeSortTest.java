import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testExtraMemoryMergeSort() {
        int[] arr1 = {5, 4, 1, 6, 3, 2, 8, 7};
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arr1, arr1.length);
        assertArrayEquals(expected1, arr1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arr2, arr2.length);
        assertArrayEquals(expected2, arr2);

        int[] arr3 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arr3, arr3.length);
        assertArrayEquals(expected3, arr3);

        int[] arr4 = {5, 3, 1, 3, 6, 3, 8, 7};
        int[] expected4 = {1, 3, 3, 3, 5, 6, 7, 8};
        MergeSort.extraMemoryMergeSort(arr4, arr4.length);
        assertArrayEquals(expected4, arr4);

        int[] arr5 = {};
        int[] expected5 = {};
        MergeSort.extraMemoryMergeSort(arr5, arr5.length);
        assertArrayEquals(expected5, arr5);

        int[] arr6 = {1};
        int[] expected6 = {1};
        MergeSort.extraMemoryMergeSort(arr6, arr6.length);
        assertArrayEquals(expected6, arr6);
    }

    @Test
    public void testInPlaceMergeSort() {
        int[] arr1 = {5, 4, 1, 6, 3, 2, 8, 7};
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arr1);
        assertArrayEquals(expected1, arr1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arr2);
        assertArrayEquals(expected2, arr2);

        int[] arr3 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arr3);
        assertArrayEquals(expected3, arr3);

        int[] arr4 = {5, 3, 1, 3, 6, 3, 8, 7};
        int[] expected4 = {1, 3, 3, 3, 5, 6, 7, 8};
        MergeSort.inPlaceMergeSort(arr4);
        assertArrayEquals(expected4, arr4);

        int[] arr5 = {};
        int[] expected5 = {};
        MergeSort.inPlaceMergeSort(arr5);
        assertArrayEquals(expected5, arr5);

        int[] arr6 = {1};
        int[] expected6 = {1};
        MergeSort.inPlaceMergeSort(arr6);
        assertArrayEquals(expected6, arr6);
    }
}
