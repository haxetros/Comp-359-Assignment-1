#include <iostream>
#include <vector>

using namespace std;

//Merge Function using extra array memory(not in-place merge)
void mergeNotInPlace(vector<int>& arr, int left, int mid, int right){
    // This is to calculate the sizes of these two arrays that will be merged
    int n1 = mid - left + 1;
    int n2 = right - mid;

    // This will create temporary arrays for the not in-place merge
    vector<int> leftArr(n1), rightArr(n2);

    // This copies the data to the temporary arrays above
    for (int i = 0; i < n1; i++)
        leftArr[i] = arr[left + i];
    for (int i = 0; i < n2; i++)
        rightArr[i] = arr[mid + 1 + i];

    // This merges the arrays back to the original one and the arrays will be copied
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if(leftArr[i] <= rightArr[j]){
            arr[k++] = leftArr[i++];
        } else {
            arr[k++] = rightArr[j++];
        }
    }
    // remaining elements of the left array
    while (i < n1){
        arr[k++] = leftArr[i++];
    }
    // remaining elements of the right array
    while (j < n2){
        arr[k++] = rightArr[j++];
    }  
}

// MergeSort Function using extra array memory(not in-place merge)
void mergeSortNotInPlace(vector<int>& arr, int left, int right){
    if (left < right){
        int mid = left + (right - left) / 2; // this will divide the array

        mergeSortNotInPlace(arr, left, mid); // this is the first half
        mergeSortNotInPlace(arr, mid + 1, right); // this is the second half

        mergeNotInPlace(arr, left, mid, right); // then this merges both arrays into one
    }
}

int main(){
    // Initialize the array to be sorted
    vector<int> arr = {21, 32, 22, 7, 6, 2};

    // This will print the original array
    cout << "Original array: ";
    for (int x : arr) 
        cout << x << " ";
    cout << endl;

    mergeSortNotInPlace(arr, 0, arr.size() - 1); // This is where the not in-place merge sort occurs

    // This will print the sorted array for the not in-place merge
    cout << "Sorted array (Not-In-Place Merge): ";
    for (int x : arr) cout << x << " ";
    cout << endl;

    return 0; // exits the program
}