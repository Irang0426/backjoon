package irang.practice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sort006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st1.nextToken());
            b[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        while (k != 0) {
            if (a[i] > b[n - i - 1]) break;
            int temp = a[i];
            a[i] = b[n - i - 1];
            b[n - i - 1] = temp;
            i++;
            k--;
        }
        int sum = Arrays.stream(a).sum();
        System.out.print(sum);
    }
}
/*
5 3
1 2 5 4 3
2 2 6 6 5
 */