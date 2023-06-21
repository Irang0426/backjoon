package irang.practice.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(binarySearch(arr, target, 0, n - 1));
        System.out.println(LoopBinarySearch(arr, target, 0, n - 1));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int n = (start + end) / 2;
        if (arr[n] < target) {
            return binarySearch(arr, target, n + 1, end);
        }
        if (arr[n] > target) {
            return binarySearch(arr, target, start, n - 1);
        }
        return n + 1;
    }

    static int LoopBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int n = (start + end)  / 2;
            if (arr[n] == target) {
                return n + 1;
            }
            if (arr[n] < target) {
                start = n + 1;
            } else if (arr[n] > target) {
                end = n - 1;
            }
        }
        return -1;
    }
}
/*
10 7
1 3 5 8 9 11 13 15 17 19

4
 */