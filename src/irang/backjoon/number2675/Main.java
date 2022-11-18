package irang.backjoon.number2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    str.append(s.charAt(j));
                }
            }
            str.append("\n");
        }
        System.out.print(str);
    }
}
