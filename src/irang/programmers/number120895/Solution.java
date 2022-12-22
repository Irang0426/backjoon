package irang.programmers.number120895;

public class Solution {
    public static String solution(String my_string, int num1, int num2) {
        char temp = my_string.charAt(num1);
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, temp);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }
}
