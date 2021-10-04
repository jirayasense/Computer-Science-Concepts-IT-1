package com.company.algos;

public class Search {

    /**
     * Oder Agnostic Binary Search
     *
     * @param arr    -> Array of (sorted) numbers
     * @param target -> to be search in array
     * @return index of target found otherwise -1
     */
    int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            throw new RuntimeException("array is empty");
        }

        if (arr[0] == arr[arr.length - 1]) {
            return arr[0] == target ? 0 : -1;
        }
        var isIncreasingOrder = arr[0] < arr[arr.length - 1];
        if (isIncreasingOrder) {
            int start = 0, end = arr.length - 1;
            while (start <= end) {
                int m = start + (end - start) / 2;
                if (arr[m] > target) {
                    //Search in right part
                    start = m + 1;
                } else if (arr[m] < target) {
                    //Search in left part
                    end = m - 1;
                } else {
                    return m;
                }
            }
        } else {
            int start = 0, end = arr.length - 1;
            while (start <= end) {
                int m = start + (end - start) / 2;
                if (arr[m] > target) {
                    //Search in left part
                    end = m - 1;
                } else if (arr[m] < target) {
                    //Search in Right part
                    start = m + 1;
                } else {
                    return m;
                }
            }
        }
        return -1;
    }
}
