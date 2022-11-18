package irang.backjoon.number2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        stringBuffer.append(a);
        stringBuffer2.append(b);

        String reverse = stringBuffer.reverse().toString();
        String reverse2 = stringBuffer2.reverse().toString();

        int max = Math.max(Integer.parseInt(reverse), Integer.parseInt(reverse2));
        System.out.print(max);
    }
}
