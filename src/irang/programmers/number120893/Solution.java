package irang.programmers.number120893;

import java.util.stream.Collectors;

public class Solution {
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer += my_string.substring(i, i + 1).toUpperCase();
            } else if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer += my_string.substring(i, i + 1).toLowerCase();
            }
        }
        return answer;
//        stream 풀이
//        return my_string.chars().mapToObj(operand -> String.valueOf((char)(Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }
}
