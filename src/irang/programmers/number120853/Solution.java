package irang.programmers.number120853;

import java.util.Stack;

public class Solution {
    public static int solution(String s) {
        int num = 0;

        Stack<Integer> stack = new Stack<>();

        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        for (int i : stack) {
            num += i;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 Z Z 4"));
    }
}
