package irang.practice.implementation.implementation003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] xy = {str.charAt(0) - 96, str.charAt(1) - '0'};

        int[][] cases = new int[][]{{-1, -2}, {1, -2}, {-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, 2}, {1, 2}};

        int count = cases.length;

        for (int i = 0; i < cases.length; i++) {
            int row = xy[0] + cases[i][0];
            int column = xy[1] + cases[i][1];
            if (row < 1 || row > 8 || column < 1 || column > 8) {
                count--;
            }
        }
        System.out.print(count);
    }
}
