package irang.backjoon.number2875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int girl = Integer.parseInt(st.nextToken());
        int boy = Integer.parseInt(st.nextToken());
        int intern = Integer.parseInt(st.nextToken());

        int count = 0;
        while (girl + boy - intern >= 3 && girl >= 2 && boy >= 1) {
            girl -= 2;
            boy -= 1;
            count++;
        }
        System.out.print(count);
    }
}
