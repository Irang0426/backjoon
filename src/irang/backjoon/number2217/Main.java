package irang.backjoon.number2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rope[] = new int[10001];
        int max = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            rope[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 10000; i > 0; i--) {
            k += rope[i];
            max = Math.max(max, k * i);
        }

        System.out.println(max);
        br.close();
    }
}
