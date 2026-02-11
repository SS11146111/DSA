package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // choose last element as pivot
        int left = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                left++;

                // swap arr[i] and arr[j]
                int temp = arr[left];
                arr[left] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[left + 1];
        arr[left + 1] = arr[high];
        arr[high] = temp;

        return left + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // partition index
            int pivotIndex = partition(arr, low, high);

            // sort left side
            quickSort(arr, low, pivotIndex - 1);

            // sort right side
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {15, 20, 5, 45, 30, 10};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}

/*
* T.C : Best/Avg -> O(n*logn), worst->O(n^2) -> worst case when array is sorted and pivot is smallest/largest
* S.C : O(logn) due to recursion stack
* */
