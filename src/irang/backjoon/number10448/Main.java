package irang.backjoon.number10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> triangularNumberList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            numList.add(Integer.parseInt(st.nextToken()));
        }

        int num = 1;
        while (triangularNumber(num) < 1000) {
            triangularNumberList.add(triangularNumber(num));
            num++;
        }

        for (int i = 0; i < numList.size(); i++) {
            if (threeCheck(triangularNumberList, numList.get(i))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int triangularNumber(int n) {
        return n * ( n + 1 ) / 2;
    }

    public static boolean threeCheck(List<Integer> triangularNumberList, int num) {
        int size = triangularNumberList.size();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int l = 0; l < size; l++) {
                    if (triangularNumberList.get(i) + triangularNumberList.get(j) + triangularNumberList.get(l) == num) return true;
                }
            }
        }
        return false;
    }
}
