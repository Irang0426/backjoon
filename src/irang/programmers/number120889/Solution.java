package irang.programmers.number120889;

import java.util.Arrays;

public class Solution{
    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] >= sides[0] + sides[1] ? 2 : 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }
}
