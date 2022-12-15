package irang.programmers.number120891;

public class Solution {
    public static int solution(int order) {
        int count = 0;
        String[] str = String.valueOf(order).split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("3") || str[i].equals("6") || str[i].equals("9")) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(29423));
    }
}
