#include <iostream>
#include <vector>
using namespace std;

// Merge Function without using extra array memory (in place merge)
void mergeInPlace(vector<int>& arr, int left, int mid, int right) {
    int i = left;
    int j = mid + 1;

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            i++;
        } else {
            int value = arr[j];
            int index = j;

            while (index > i) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[i] = value;

            i++;
            mid++;
            j++;
        }
    }
}

// MergeSort Function without using extra array memory (in place merge)
void mergeSortInPlace(vector<int>& arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        mergeSortInPlace(arr, left, mid);
        mergeSortInPlace(arr, mid + 1, right);

        mergeInPlace(arr, left, mid, right);
    }
}

int main() {
    vector<int> arr = {12, 11, 13, 5, 6, 7};

    cout << "Original array: ";
    for (int x : arr) cout << x << " ";
    cout << endl;

    mergeSortInPlace(arr, 0, arr.size() - 1);

    cout << "Sorted array (In-Place Merge): ";
    for (int x : arr) cout << x << " ";
    cout << endl;

    return 0;
}