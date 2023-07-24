class Solution {
public:
bool compareAscendingDescending(int x, int y, bool ascending) {
    return ascending ? x < y : x > y;
}

void swap(vector<int>& arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}

int partition(vector<int>& arr, int low, int high, bool ascending) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (compareAscendingDescending(arr[j], pivot, ascending)) {
            i++;

            // Swap
            swap(arr, i, j);
        }
    }

    // Swap
    swap(arr, i + 1, high);

    return i + 1;;
}

void quicksort(vector<int>& arr, int low, int high, bool ascending = true) {
    if (low < high) {
        int partitionIndex = partition(arr, low, high, ascending);

        // Left pivot
        quicksort(arr, low, partitionIndex - 1, ascending);

        // Right pivot
        quicksort(arr, partitionIndex + 1, high, ascending);
    }
}

int hIndex(vector<int>& citations) {
    int hIndex = 0;
    quicksort(citations, 0, citations.size() - 1, false);

    for (int i = 0; i < citations.size(); ++i) {
        if (citations[i] >= i + 1) hIndex++; else break;
    }

    return hIndex;
}
};