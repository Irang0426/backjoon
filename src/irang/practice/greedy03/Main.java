package irang.practice.greedy03;

/*
그리디 알고리즘
입력 예시
25 5

출력 예시
2
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        while (n >= k) {
            int target = n / k;
            count += n - target * k;
            n = target;
            count++;
        }

        count += (n - 1);

        System.out.print(count);
    }
}
