package irang.practice.practice2;

/*
3 3
3 1 2
4 1 4
2 2 2

2
-------------------
2 4
7 3 1 8
3 3 3 4

3
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {

            int min = 10001;
            for (int j = 0; j < m; j++) {
                min = Math.min(min ,sc.nextInt());
            }
            result = Math.max(min, result);
        }

        System.out.println(result);
    }
}
