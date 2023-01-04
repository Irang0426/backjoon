package irang.backjoon.number10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            stringBuilder.append(count[i] + " ");
        }
        System.out.println(stringBuilder);
    }
}
