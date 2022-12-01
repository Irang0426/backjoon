package irang.programmers.number120888;

public class Solution {
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("people"));
    }
}
