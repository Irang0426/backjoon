package irang.programmers.number120896;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.chars().filter(c -> c == ch).count() == 1) {
                answer += ch;
            }
        }
        return Stream.of(answer.split("")).sorted().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }
}
