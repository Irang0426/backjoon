package irang.backjoon.number2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> conList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (decomposition(i) == n) {
                conList.add(i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(conList.get(0));
        }
    }

    public static int decomposition(int num) {
        int total = num;
        if (num > 10) {
            while (num > 10) {
                total += num % 10;
                num /= 10;
            }
        }
        total += num;
        return total;
    }
}
