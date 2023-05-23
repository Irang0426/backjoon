package irang.practice.implement.implement002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine()) + 1;

        long start = System.nanoTime();

        int sm = 60;
        int hCount = 0;
        int count = 0;

        for (int i = 0; i < sm; i++) {
            if (i / 10 == 3 || i % 10 == 3) {
                count++;
            }
        }

        for (int i = 0; i <= h; i++) {
            if (i % 10 == 3) {
                hCount++;
            }
        }

        int result = count * (sm * 2 - count) * (h - hCount) + (hCount * 3600);

        long end = System.nanoTime();

        System.out.println(result);
        System.out.println("시간 : " + (end - start) + "ns");

//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < sm; j++) {
//                for (int k = 0; k < sm; k++) {
//                    if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) {
//                        count++;
//                    }
//                }
//            }
//        }
//
//        System.out.println(count);
    }
}
