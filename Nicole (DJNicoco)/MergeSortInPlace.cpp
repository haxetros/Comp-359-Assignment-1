#include <iostream>
#include <vector>
using namespace std;

// Merge Function without using extra array memory (in-place merge)
void mergeInPlace(vector<int>& arr, int left, int mid, int right) {
    int i = left; // left subarray
    int j = mid + 1; // right subarray

    // this is to traverse both of the subarrays and merge them
    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            i++; // if the current element is in the left subarray
                 // then move to the next element in the left subarray
        } else {
            int value = arr[j];
            int index = j;

            // move elements of the left subarray one position to the right
            while (index > i) {
                arr[index] = arr[index - 1];
                index--; //decrement the index
            }
            arr[i] = value;

            i++; // moves to the next position of the left subarray
            mid++; // increments mid since the elements were shifted
            j++; // moves to the next position of the right subarray
        }
    }
}

// MergeSort Function without using extra array memory (in-place merge)
void mergeSortInPlace(vector<int>& arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2; // this calculates the mid point

        // The left and right subarray are recursively sorted
        mergeSortInPlace(arr, left, mid);
        mergeSortInPlace(arr, mid + 1, right);

        mergeInPlace(arr, left, mid, right); // this merges the two sorted subarrays
    }
}

int main() {
    // Initialize the array to be sorted
    vector<int> arr = {12, 11, 13, 5, 6, 7};

    // This will print the original array
    cout << "Original array: ";
    for (int x : arr) cout << x << " ";
    cout << endl;

    mergeSortInPlace(arr, 0, arr.size() - 1); // This is where the in-place merge sort occurs

    /// This will print the sorted array for the in-place merge
    cout << "Sorted array (In-Place Merge): ";
    for (int x : arr) cout << x << " ";
    cout << endl;

    return 0; // exits the program
}