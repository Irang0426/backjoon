package irang.practice.greedy.greedy01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
그리디 알고리즘

5 8 3
2 4 5 4 6
result = 46
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int last = list[n - 1];
        int first = list[n - 2];
        int k2 = k + 1;

        int result = (last * k + first) * (m / k2) + last * (m % k2);

        System.out.println(result);
    }
}
