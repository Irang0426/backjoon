package irang.backjoon.number1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals(" ")) {
            System.out.println(0);
        } else {
            System.out.println(str.strip().split(" ").length);
        }
    }
}
