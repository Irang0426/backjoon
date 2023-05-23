package irang.backjoon.number11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] number = br.readLine().split("");

        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result += Integer.parseInt(number[i]);
        }

        System.out.println(result);
        br.close();
    }
}


