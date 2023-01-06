package irang.programmers.number120897;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();    // stream 으로 List를 배열로 변환
    }

    public static void main(String[] args) {
        System.out.println(solution(24));
    }
}
