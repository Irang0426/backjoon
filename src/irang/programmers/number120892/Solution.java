package irang.programmers.number120892;

public class Solution {
    public static String solution(String cipher, int code) {
        String[] str = cipher.split("");
        String answer = "";
        for (int i = 1; i < str.length / code + 1; i++) {
            answer += str[i * code - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }
}
