package irang.backjoon.number5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 그리디 알고리즘

        Scanner sc = new Scanner(System.in);
        int pay = Integer.parseInt(sc.nextLine());
        int money = 1000 - pay;
        int[] changes = {500, 100, 50, 10, 5, 1};

        int count = 0;

        for (int change : changes) {
            count += money / change;
            money %= change;
        }

        System.out.println(count);
    }
}
