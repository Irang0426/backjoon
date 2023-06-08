package irang.practice.sort;

import java.util.Arrays;

/*
선택 정렬
 */
public class Sort001 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 0, 3, 1, 6, 2, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}