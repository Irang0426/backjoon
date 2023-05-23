package irang.backjoon.number1008;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        double a = System.in.read() - '0';
        System.in.read();
        double b = System.in.read() - '0';
        System.out.println(a / b);
    }
}
