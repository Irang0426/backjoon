package irang.practice.sort;

import java.util.Arrays;

/*
퀵 정렬
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8, 5};

        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick_sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int leftIndex = start + 1;
        int rightIndex = end;
        while (true) {
            while (leftIndex < end && arr[start] >= arr[leftIndex]) {
                leftIndex++;
            }

            while (rightIndex > start && arr[start] <= arr[rightIndex]) {
                rightIndex--;
            }

            if (leftIndex >= rightIndex) {
                int temp = arr[start];
                arr[start] = arr[rightIndex];
                arr[rightIndex] = temp;
                break;
            }
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
        }
        quick_sort(arr, start, rightIndex - 1);
        quick_sort(arr, rightIndex + 1, end);
    }
}
