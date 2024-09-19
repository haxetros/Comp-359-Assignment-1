#include <iostream>
#include <vector>

using namespace std;

//Merge Function using extra array memory(not in place merge)
void mergeNotInPlace(vector<int>& arr, int left, int mid, int right){
    int n1 = mid - left + 1;
    int n2 = right - mid;

    vector<int> leftArr(n1), rightArr(n2);

    for (int i = 0; i < n1; i++)
        leftArr[i] = arr[left + i];
    for (int i = 0; i < n2; i++)
        rightArr[i] = arr[mid + 1 + i];

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if(leftArr[i] <= rightArr[j]){
            arr[k++] = leftArr[i++];
        } else {
            arr[k++] = rightArr[j++];
        }
    }

    while (i < n1){
        arr[k++] = leftArr[i++];
    }

    while (j < n2){
        arr[k++] = rightArr[j++];
    }  
}

// MergeSort Function using extra array memory(not in place merge)
void mergeSortNotInPlace(vector<int>& arr, int left, int right){
    if (left < right){
        int mid = left + (right - left) / 2;

        mergeSortNotInPlace(arr, left, mid);
        mergeSortNotInPlace(arr, mid + 1, right);

        mergeNotInPlace(arr, left, mid, right);
    }
}

int main(){
    vector<int> arr = {21, 32, 22, 7, 6, 2};

    cout << "Original array: ";
    for (int x : arr) 
        cout << x << " ";
    cout << endl;

    mergeSortNotInPlace(arr, 0, arr.size() - 1);
    cout << "Sorted array (Not-In-Place Merge): ";
    for (int x : arr) cout << x << " ";
    cout << endl;

    return 0;
}